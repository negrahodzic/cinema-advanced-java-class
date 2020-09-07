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
import rs.njt.webapp.njtbioskopprojekat.dto.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.dto.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.service.GenreService;
import rs.njt.webapp.njtbioskopprojekat.service.MovieService;
import rs.njt.webapp.njtbioskopprojekat.service.ProjectionService;

/**
 * Class represents controller for requests coming from root path
 * "/searchMovies".
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Controller
@RequestMapping(path = "/searchMovies")
public class MoviesController {

    /**
     * movie service
     */
    private final MovieService movieService;
    /**
     * projection service
     */
    private final ProjectionService projectionService;
    /**
     * genre service
     */
    private final GenreService genreService;
    /**
     * model and view
     */
    private final ModelAndView modelAndView;

    /**
     * Constructor with parameters
     *
     * @param movieService movie service
     * @param projectionService projection service
     * @param genreService genre service
     */
    @Autowired
    public MoviesController(MovieService movieService, ProjectionService projectionService, GenreService genreService) {
        this.movieService = movieService;
        this.projectionService = projectionService;
        this.genreService = genreService;
        this.modelAndView = new ModelAndView();
    }

    /**
     * Returns model and view of GET request with path "/searchMovies".
     *
     * @return modelAndView
     */
    @GetMapping
    public ModelAndView searchMovies() {
        modelAndView.setViewName("searchMovies");
        modelAndView.addObject("movies", movieService.getAll());
        return modelAndView;
    }

    /**
     * Returns model and view of GET request with path
     * "/searchMovies/{movieId}/seeProjections".
     *
     * @param movieId id of movie extracted from request path
     * @return modelAndView
     */
    @GetMapping(path = "/{movieId}/seeProjections")
    public ModelAndView seeProjections(@PathVariable(name = "movieId") Long movieId) {
        modelAndView.setViewName("searchProjections");
        modelAndView.addObject("projections", projectionService.getByMovieId(movieId));
        modelAndView.addObject("dates", projectionService.getDates());
        return modelAndView;
    }

    /**
     * Returns model and view of GET request with path
     * "/searchMovies/{movieId}/seeReviews".
     *
     * @param movieId id of movie extracted from request path
     * @return modelAndView
     */
    @GetMapping(path = "/{movieId}/seeReviews")
    public ModelAndView reviews(@PathVariable(name = "movieId") Long movieId) {
        modelAndView.setViewName("reviews");
        modelAndView.addObject("movieDto", movieService.getById(movieId));
        return modelAndView;
    }

    /**
     * Returns model and view of POST request with path "/searchMovies/search".
     *
     * @param request http servlet request
     * @return modelAndView
     */
    @PostMapping(path = "/search")
    public ModelAndView search(HttpServletRequest request) {

        String titleFilter = request.getParameter("searchMovieTitle");
        String genreFilter = request.getParameter("selectedGenre");

        modelAndView.setViewName("searchMovies");
        modelAndView.addObject("movies", movieService.searchByTitleAndGenre(titleFilter.toLowerCase(), genreFilter));

        return modelAndView;
    }

    /**
     * Returns list of all movies and binds them to model as attribute "movies".
     *
     * @return list of all MovieDtos
     */
    @ModelAttribute(name = "movies")
    private List<MovieDto> getMovies() {
        return movieService.getAll();
    }

    /**
     * Returns list of all genres and binds them to model as attribute "genres".
     *
     * @return list of all GenreDtos
     */
    @ModelAttribute(name = "genres")
    private List<GenreDto> getGenres() {
        return genreService.getAll();
    }

}
