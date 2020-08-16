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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import rs.njt.webapp.njtbioskopprojekat.model.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.model.ProjectionDto;
import rs.njt.webapp.njtbioskopprojekat.service.MovieService;

/**
 *
 * @author remmi
 */
@Controller
@RequestMapping(path = "/searchMovies")
public class MoviesController {
    
//    private final MovieService movieService;
    private ModelAndView modelAndView = new ModelAndView();

//    @Autowired
//    public MoviesController(MovieService movieService) {
//        this.movieService = movieService;
//        System.out.println("+++++++++++++++++++++++++ LandingController(TestService testService, MovieService movieService) +++++++++++++++++++=");
//        // this.modelAndView = new ModelAndView(); // Da li ovako da radimo?
//    }
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
