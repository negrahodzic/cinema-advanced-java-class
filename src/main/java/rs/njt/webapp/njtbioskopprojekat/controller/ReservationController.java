/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author remmi
 */
@Controller
@RequestMapping(path = "/myReservations")
public class ReservationController {

    private ModelAndView modelAndView = new ModelAndView();

    @GetMapping
    public ModelAndView myReservations() {
        modelAndView.setViewName("myReservations");
        return modelAndView;
    }
    
    //TODO: dodati /details, /delete
}
