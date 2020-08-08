/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author remmi
 */
@Controller
@RequestMapping(path="/searchProjections")
public class ProjectionsController {
    @GetMapping
    public String searchProjections(){
        return "searchProjections";
    }
    @GetMapping(path="/createReservation")
    public String createReservation(){
        return "createReservation";
    }
    @GetMapping(path="/landing")
    public String logout(){
        return "landing";
    }
}
