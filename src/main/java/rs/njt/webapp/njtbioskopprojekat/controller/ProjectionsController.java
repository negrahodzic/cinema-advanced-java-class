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
import rs.njt.webapp.njtbioskopprojekat.model.ProjectionDto;
import rs.njt.webapp.njtbioskopprojekat.service.ProjectionService;

/**
 *
 * @author remmi
 */
@Controller
@RequestMapping(path = "/searchProjections")
public class ProjectionsController {

    private final ProjectionService projectionService;
    private ModelAndView modelAndView = new ModelAndView();

    @Autowired
    public ProjectionsController(ProjectionService projectionService) {

        this.projectionService = projectionService;
        System.out.println("+++++++++++++++++++++++++ ProjectionsController(ProjectionService projectionService) +++++++++++++++++++=");
        // this.modelAndView = new ModelAndView(); // Da li ovako da radimo?
    }

    @GetMapping
    public ModelAndView searchProjections() {
        modelAndView.setViewName("searchProjections");
        return modelAndView;
    }

    @GetMapping(path = "/createReservation")
    public ModelAndView createReservation() {
        modelAndView.setViewName("createReservation");
        return modelAndView;
    }

    @ModelAttribute(name = "projections")
    private List<ProjectionDto> getProjections() {
        return projectionService.getAll();
    }
}
