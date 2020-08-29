/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import rs.njt.webapp.njtbioskopprojekat.model.ProjectionDto;
import rs.njt.webapp.njtbioskopprojekat.model.ReservationDto;
import rs.njt.webapp.njtbioskopprojekat.model.UserDto;
import rs.njt.webapp.njtbioskopprojekat.service.ProjectionService;
import rs.njt.webapp.njtbioskopprojekat.service.ReservationService;
import rs.njt.webapp.njtbioskopprojekat.service.UserService;

/**
 *
 * @author remmi
 */
@Controller
@RequestMapping(path = "/myReservations")
public class ReservationController {

    private ModelAndView modelAndView = new ModelAndView();

    private final ReservationService reservationService;
    private final ProjectionService projectionService;
    private final UserService userService;

    @Autowired
    public ReservationController(ReservationService reservationService, UserService userService, ProjectionService projectionService) {
        this.reservationService = reservationService;
        this.userService = userService;
        this.projectionService = projectionService;
    }

    @GetMapping
    public ModelAndView myReservations() {
        modelAndView.setViewName("myReservations");
        return modelAndView;
    }

    @ModelAttribute(name = "reservations")
    private List<ReservationDto> getReservations() {
        return reservationService.getAll();
    }

    //TODO: dodati /details
    @GetMapping(path = "/{reservationId}/delete")
    public ModelAndView deleteReservation(@PathVariable(name = "reservationId") Long reservationId, HttpServletRequest request) {
        reservationService.delete(reservationId);
        request.getSession(true).setAttribute("message", "Successfully deleted reservation!");
        modelAndView.setViewName("redirect:/myReservations");
        return modelAndView;
    }

    @PostMapping(path = "/save")
    public ModelAndView saveReservation(HttpServletRequest request) {
        String projectionID = request.getParameter("projectionId");
        long projectionIDint = Long.parseLong(projectionID);

        String tickets = request.getParameter("tickets");
        if (tickets.equals("")) {
            request.getSession(true).setAttribute("message", "You need to enter tickets amount!");
            modelAndView.setViewName("redirect:/searchProjections/" + projectionIDint + "/createReservation");
        } else {
            int ticketsInt = Integer.parseInt(tickets);

            if (ticketsInt < 1) {
                request.getSession(true).setAttribute("message", "You need to reserve atleast 1 ticket!");
                modelAndView.setViewName("redirect:/searchProjections/" + projectionIDint + "/createReservation");
            } else if (ticketsInt > 6) {
                request.getSession(true).setAttribute("message", "You can reserve up to 6 tickets!");
                modelAndView.setViewName("redirect:/searchProjections/" + projectionIDint + "/createReservation");
            } else {
                Date dateTimeOfReservation = new Date(System.currentTimeMillis());
                UserDto user = (UserDto) request.getSession(true).getAttribute("loggedUser");
                ProjectionDto projection = projectionService.getById(projectionIDint);

                ReservationDto reservation = new ReservationDto(dateTimeOfReservation, ticketsInt, projection, user);

                reservationService.saveReservation(reservation);

                request.getSession(true).setAttribute("message", "Successfully created reservation!");
                modelAndView.setViewName("redirect:/myReservations");
            }

        }

        //modelAndView.addObject("movieDto", movieService.getById(movieId));
        return modelAndView;
    }
}
