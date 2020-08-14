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
@RequestMapping(path = "/searchMovies")
public class MoviesController {

    private ModelAndView modelAndView = new ModelAndView();

    @GetMapping
    public ModelAndView searchMovies() {
        modelAndView.setViewName("searchMovies");
        return modelAndView;
    }

    @GetMapping(path = "/seeReviews")
    public ModelAndView reviews() { //TODO: dodati logiku, reviews za izabran film
        modelAndView.setViewName("reviews");
        return modelAndView;
    }

    @GetMapping(path = "/seeProjections")
    public ModelAndView seeProjections() { //TODO: dodati logiku, projections za izabran film
        modelAndView.setViewName("searchProjections");
        return modelAndView;
    }

}
