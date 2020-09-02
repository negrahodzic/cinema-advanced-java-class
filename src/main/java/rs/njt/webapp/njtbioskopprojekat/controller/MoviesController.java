/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.controller;

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
import rs.njt.webapp.njtbioskopprojekat.model.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.model.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.service.GenreService;
import rs.njt.webapp.njtbioskopprojekat.service.MovieService;
import rs.njt.webapp.njtbioskopprojekat.service.ProjectionService;

/**
 *
 * @author remmi
 */
@Controller
@RequestMapping(path = "/searchMovies")
public class MoviesController {

    private final MovieService movieService;
    private final ModelAndView modelAndView;
    private final ProjectionService projectionService;
    private final GenreService genreService;

    @Autowired
    public MoviesController(MovieService movieService, ProjectionService projectionService, GenreService genreService) {
        this.movieService = movieService;
        this.projectionService = projectionService;
        this.genreService = genreService;
        this.modelAndView = new ModelAndView();
    }

    @GetMapping
    public ModelAndView searchMovies() {
        modelAndView.setViewName("searchMovies");
        modelAndView.addObject("movies", movieService.getAll());
        return modelAndView;
    }

    @GetMapping(path = "/{movieId}/seeProjections")
    public ModelAndView seeProjections(@PathVariable(name = "movieId") Long movieId) {
        modelAndView.setViewName("searchProjections");
        modelAndView.addObject("projections", projectionService.getByMovieId(movieId));
        modelAndView.addObject("dates", projectionService.getDates());
        return modelAndView;
    }

    @GetMapping(path = "/{movieId}/seeReviews")
    public ModelAndView reviews(@PathVariable(name = "movieId") Long movieId) {
        modelAndView.setViewName("reviews");
        modelAndView.addObject("movieDto", movieService.getById(movieId));
        return modelAndView;
    }

    @PostMapping(path = "/search")
    public ModelAndView search(HttpServletRequest request) {

        String titleFilter = request.getParameter("searchMovieTitle");
        String genreFilter = request.getParameter("selectedGenre");

        modelAndView.setViewName("searchMovies");
        modelAndView.addObject("movies", movieService.searchByTitleAndGenre(titleFilter.toLowerCase(), genreFilter));

        return modelAndView;
    }

    @ModelAttribute(name = "movies")
    private List<MovieDto> getMovies() {
        return movieService.getAll();
    }

    @ModelAttribute(name = "genres")
    private List<GenreDto> getGenres() {
        return genreService.getAll();
    }
    
}
