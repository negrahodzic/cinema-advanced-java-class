/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import rs.njt.webapp.njtbioskopprojekat.model.ReservationDto;
import rs.njt.webapp.njtbioskopprojekat.service.MovieService;
import rs.njt.webapp.njtbioskopprojekat.service.ReservationService;

/**
 *
 * @author remmi
 */
@Controller
@RequestMapping(path = "/myReservations")
public class ReservationController {

    private ModelAndView modelAndView = new ModelAndView();
    
    private final ReservationService reservationService;
    

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
//        System.out.println("+++++++++++++++++++++++++ LandingController(TestService testService, MovieService movieService) +++++++++++++++++++=");
        // this.modelAndView = new ModelAndView(); // Da li ovako da radimo?
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
    //TODO: dodati /details, /delete
    @GetMapping(path = "/{reservationId}/delete")
    public ModelAndView deleteReservation(@PathVariable(name="reservationId") Long reservationId) { 
        reservationService.delete(reservationId);
        modelAndView.setViewName("redirect:/myReservations");
        return modelAndView;
    }
}
