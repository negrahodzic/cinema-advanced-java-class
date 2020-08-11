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
@RequestMapping(path="/searchMovies")

public class MoviesController {
    @GetMapping
    public String searchMovies(){
        return "searchMovies";
    }
    @GetMapping(path="/seeProjections")
    public String seeProjections(){
        return "searchProjections";
    }
    
    @GetMapping(path="/seeReviews")
    public String reviews(){
        return "reviews";
    }
    
    @GetMapping
    public ModelAndView searchMovies2(){
        System.out.println("==============================================USPELO");
        ModelAndView modelAndView = new ModelAndView("searchMovies");
        return modelAndView; 
    }
    
}
