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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.UserEntity;
import rs.njt.webapp.njtbioskopprojekat.repository.GenreRepository;
import rs.njt.webapp.njtbioskopprojekat.service.MovieService;
import rs.njt.webapp.njtbioskopprojekat.service.UserService;
import rs.njt.webapp.njtbioskopprojekat.service.impl.MovieServiceImpl;

/**
 *
 * @author remmi
 */
@Controller
@RequestMapping(path = "/")
public class LandingController {

    private final UserService userService;
    private ModelAndView modelAndView = new ModelAndView();

    @Autowired
    public LandingController(UserService userService) {
        this.userService = userService;

        // this.modelAndView = new ModelAndView(); // Da li ovako da radimo?
    }

    @GetMapping
    public ModelAndView landing() {
        modelAndView.setViewName("landing");
        return modelAndView;
    }

    @PostMapping(path = "login")
    public ModelAndView login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserEntity user = userService.findByUsername(username);

        if (user == null) { 
            modelAndView.setViewName("redirect:/");
        } else if (user.getPassword().equals(password)) {
            request.getSession(true).setAttribute("loggedUser", user);
            modelAndView.setViewName("searchMovies");
        }
        modelAndView.setViewName("searchMovies"); // privrmeno, bez logovanja
        return modelAndView;
    }

    @GetMapping(path = "register")
    public ModelAndView register() {
        MovieServiceImpl ms = new MovieServiceImpl();
        ms.getAll();
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @GetMapping(path = "logout")
    public ModelAndView logout() {
        //TODO: izlogovati, obrisati session
        modelAndView.setViewName("landing");
        return modelAndView;
    }

    //TODO: promeni u model and view + dodaj logiku
    @PostMapping(path = "/register/save")
    public String registerUser() {
        return "landing";
    }
}

//        GenreServiceImpl gs = new GenreServiceImpl();
//        List<Genre> gList = gs.getAll();
//        List<Genre> genreList = genreRepository.getAll();
//    GenreDto genreDto = new GenreDto("crime");
//        User user = userService.findByUsername("marko");
//        for (Genre genre : genreList) {
//            System.out.println("===============================");
//            System.out.println("===============================");
//            System.out.println("**************** Genre: " + genre.getGenreName());
//            System.out.println("**************** User: " + user.getEmail());
//            System.out.println("===============================");
//            System.out.println("===============================");
//        }
//
//        UserServiceImpl us = new UserServiceImpl();
//        List<User> gList = us.getAll();
//        int i = 0;
//         for (User user : gList) {
//            System.out.println("===============================");
//            System.out.println("===============================");
//            System.out.println("**************** User email: " + user.getEmail());
//            System.out.println("**************** User first name: " + user.getFirstname());
//            System.out.println("**************** User List: " + user.getReservations().get(i));
//            i++;
//            System.out.println("===============================");
//            System.out.println("===============================");
//        }

