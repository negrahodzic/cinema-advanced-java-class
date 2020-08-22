/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import rs.njt.webapp.njtbioskopprojekat.service.MovieService;
import rs.njt.webapp.njtbioskopprojekat.service.ReviewService;

/**
 *
 * @author remmi
 */
@Controller
@RequestMapping(path = "/reviews")
public class ReviewsController {

    private final MovieService movieService;
    private final ReviewService reviewService;
    private ModelAndView modelAndView = new ModelAndView();

    @Autowired
    public ReviewsController(MovieService movieService, ReviewService reviewService) {
        this.movieService = movieService;
        this.reviewService = reviewService;
    }

    @GetMapping
    public ModelAndView reviews() {
        modelAndView.setViewName("reviews");
        return modelAndView;
    }

    @GetMapping(path = "/{movieId}/add")
    public ModelAndView addReview(@PathVariable(name="movieId") Long movieId) { 
        modelAndView.setViewName("reviews/add");
        modelAndView.addObject("movieDto", movieService.getById(movieId));
        return modelAndView;
    }

    @PostMapping(path = "/{movieId}/save")
    public ModelAndView saveReview(@PathVariable(name="movieId") Long movieId, HttpServletRequest request) { 
        String grade = request.getParameter("grade");
        String comment = request.getParameter("comment");
        int gradeInt = Integer.getInteger(grade);
        
        //reviewService.saveReview(movieId, grade, comment);
        
        modelAndView.setViewName("reviews");
        modelAndView.addObject("movieDto", movieService.getById(movieId));
        return modelAndView;
    }

    //TODO: dodati /createReview, /editReview, /save, /delete
    //TODO: negde dodati opciju za davanje ocene tj review
}
