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
import rs.njt.webapp.njtbioskopprojekat.model.ProjectionDto;
import rs.njt.webapp.njtbioskopprojekat.service.ProjectionService;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Controller
@RequestMapping(path = "/searchProjections")
public class ProjectionsController {

    private final ProjectionService projectionService;
    private final ModelAndView modelAndView;

    @Autowired
    public ProjectionsController(ProjectionService projectionService) {
        this.projectionService = projectionService;
        this.modelAndView = new ModelAndView();
        modelAndView.addObject("dates", projectionService.getDates());
    }

    @GetMapping
    public ModelAndView searchProjections() {
        modelAndView.setViewName("searchProjections");
        modelAndView.addObject("projections", projectionService.getAll());
        return modelAndView;
    }

    @GetMapping(path = "/{projectionId}/createReservation")
    public ModelAndView createReservation(@PathVariable(name = "projectionId") Long projectionId) {
        modelAndView.setViewName("createReservation");
        modelAndView.addObject("projectionDto", projectionService.getById(projectionId));
        return modelAndView;
    }

    @PostMapping(path = "/search")
    public ModelAndView search(HttpServletRequest request) {
        String titleFilter = request.getParameter("searchMovieTitle");
        String dateFilter = request.getParameter("selectedDate");

        modelAndView.setViewName("searchProjections");
        modelAndView.addObject("projections", projectionService.searchByTitleAndDate(titleFilter.toLowerCase(), dateFilter));
        
        return modelAndView;
    }

    // Model Attributes
    @ModelAttribute(name = "projections")
    private List<ProjectionDto> getProjections() {
        return projectionService.getAll();
    }

    @ModelAttribute(name = "dates")
    private List<String> getDates() {
        return projectionService.getDates();
    }
}
