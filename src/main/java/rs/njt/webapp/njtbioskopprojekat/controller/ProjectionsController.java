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
import rs.njt.webapp.njtbioskopprojekat.dto.ProjectionDto;
import rs.njt.webapp.njtbioskopprojekat.service.ProjectionService;

/**
 * Class represents controller for requests coming from root path
 * "/searchProjections".
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Controller
@RequestMapping(path = "/searchProjections")
public class ProjectionsController {

    /**
     * projection service
     */
    private final ProjectionService projectionService;
    /**
     * model and view
     */
    private final ModelAndView modelAndView;

    /**
     * Constructor with parameters
     *
     * @param projectionService projection service
     */
    @Autowired
    public ProjectionsController(ProjectionService projectionService) {
        this.projectionService = projectionService;
        this.modelAndView = new ModelAndView();
        modelAndView.addObject("dates", projectionService.getDates());
    }

    /**
     * Returns model and view of GET request with path "/searchProjections".
     *
     * @return modelAndView
     */
    @GetMapping
    public ModelAndView searchProjections() {
        modelAndView.setViewName("searchProjections");
        modelAndView.addObject("projections", projectionService.getAll());
        return modelAndView;
    }

    /**
     * Returns model and view of GET request with path
     * "/searchProjections/{projectionId}/createReservation".
     *
     * @param projectionId id of projection extracted from request path
     * @return modelAndView
     */
    @GetMapping(path = "/{projectionId}/createReservation")
    public ModelAndView createReservation(@PathVariable(name = "projectionId") Long projectionId) {
        modelAndView.setViewName("createReservation");
        modelAndView.addObject("projectionDto", projectionService.getById(projectionId));
        return modelAndView;
    }

    /**
     * Returns model and view of POST request with path
     * "/searchProjections/search".
     *
     * @param request http servlet request
     * @return modelAndView
     */
    @PostMapping(path = "/search")
    public ModelAndView search(HttpServletRequest request) {
        String titleFilter = request.getParameter("searchMovieTitle");
        String dateFilter = request.getParameter("selectedDate");

        modelAndView.setViewName("searchProjections");
        modelAndView.addObject("projections", projectionService.searchByTitleAndDate(titleFilter.toLowerCase(), dateFilter));

        return modelAndView;
    }

    /**
     * Returns list of all projections and binds them to model as attribute
     * "projections".
     *
     * @return list of all ProjectionDtos
     */
    @ModelAttribute(name = "projections")
    private List<ProjectionDto> getProjections() {
        return projectionService.getAll();
    }

    /**
     * Returns list of all dates and binds them to model as attribute
     * "dates".
     *
     * @return list of all dates 
     */
    @ModelAttribute(name = "dates")
    private List<String> getDates() {
        return projectionService.getDates();
    }
}
