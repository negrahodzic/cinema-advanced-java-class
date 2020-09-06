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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import rs.njt.webapp.njtbioskopprojekat.model.UserDto;
import rs.njt.webapp.njtbioskopprojekat.service.GenreService;
import rs.njt.webapp.njtbioskopprojekat.service.MovieService;
import rs.njt.webapp.njtbioskopprojekat.service.UserService;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Controller
@RequestMapping(path = "/")
public class LandingController {

    private final MovieService movieService;
    private final UserService userService;
    private final GenreService genreService;
    private final String message = "";
    private final ModelAndView modelAndView;

    @Autowired
    public LandingController(MovieService movieService, UserService userService, GenreService genreService) {
        this.movieService = movieService;
        this.userService = userService;
        this.genreService = genreService;
        this.modelAndView = new ModelAndView();
    }

    @GetMapping
    public ModelAndView landing() {
        modelAndView.setViewName("searchMovies");
        modelAndView.addObject("movies", movieService.getAll());
        return modelAndView;
    }

    @GetMapping(path = "landing")
    public ModelAndView landingLogin() {
        modelAndView.setViewName("landing");
        return modelAndView;
    }

    @PostMapping(path = "login")
    public ModelAndView login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || "".equals(username)) {
            request.getSession(true).setAttribute("message", "You didn't enter all fields!");
            modelAndView.setViewName("redirect:/");
        } else {
            UserDto user = userService.findByUsername(username);

            if (user == null) {
                request.getSession(true).setAttribute("message", "There is no user with username " + username + "!");
                modelAndView.setViewName("redirect:/");
            } else if (!user.getPassword().equals(password)) {
                request.getSession(true).setAttribute("message", "You entered incorrect password!");
                modelAndView.setViewName("redirect:/");
            } else {
                request.getSession(true).setAttribute("loggedUser", user);
                modelAndView.setViewName("redirect:/searchMovies");
//                modelAndView.addObject("movies", movieService.getAll());
            }
        }

        return modelAndView;
    }

    @GetMapping(path = "register")
    public ModelAndView register() {
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @GetMapping(path = "logout")
    public ModelAndView logout(HttpServletRequest request) {
        request.getSession(true).setAttribute("loggedUser", null);
        request.getSession(true).setAttribute("message", "You succesfully logged out!");
        request.getSession(true).invalidate();
        modelAndView.setViewName("landing");
        return modelAndView;
    }

    @PostMapping(path = "/register/save")
    public ModelAndView registerUser(HttpServletRequest request) {
        UserDto user = new UserDto();

        user.setFirstname(request.getParameter("firstname"));
        user.setLastname(request.getParameter("lastname"));
        user.setEmail(request.getParameter("email"));
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));

        if ("".equals(user.getFirstname()) || "".equals(user.getLastname()) || "".equals(user.getEmail())
                || "".equals(user.getUsername()) || "".equals(user.getPassword())) {
            request.getSession(true).setAttribute("message", "You didnt enter all fields!");
            modelAndView.setViewName("redirect:/register");
        } else if (userService.findByUsername(user.getUsername()) != null) {
            request.getSession(true).setAttribute("message", "User with that username already exists!");
            modelAndView.setViewName("redirect:/register");
        } else {
            userService.updateUser(user);
            request.getSession(true).setAttribute("message", "You successfully registered!");
            modelAndView.setViewName("redirect:/");
        }

        return modelAndView;
    }

//    @ModelAttribute(name = "message")
//    private String getMessage() {
//        return message;
//    }
}
