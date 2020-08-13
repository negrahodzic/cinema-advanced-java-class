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
import rs.njt.webapp.njtbioskopprojekat.entity.Genre;
import rs.njt.webapp.njtbioskopprojekat.entity.User;
import rs.njt.webapp.njtbioskopprojekat.repository.GenreRepository;
import rs.njt.webapp.njtbioskopprojekat.service.GenreService;
import rs.njt.webapp.njtbioskopprojekat.service.UserService;
import rs.njt.webapp.njtbioskopprojekat.service.impl.GenreServiceImpl;
import rs.njt.webapp.njtbioskopprojekat.service.impl.UserServiceImpl;

/**
 *
 * @author remmi
 */
@Controller
@RequestMapping(path = "/")

public class LandingController {

    private final GenreRepository genreRepository;
    private final UserService userService;

    @Autowired
    public LandingController(GenreRepository genreRepository, UserService userService) {
        this.genreRepository = genreRepository;
        this.userService = userService;
    }

    @PostMapping(path = "searchMovies") // promeni u login
    public ModelAndView login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        System.out.println("===== Pozvana LoginAction =====");
        System.out.println("===== username:"+username+" =====");
        
        User user = userService.findByUsername(username);
        
        ModelAndView modelAndView =  new ModelAndView("redirect:/");
        if(user == null) {
            System.out.println("===== USER DOES NOT EXIST =====");
        }
        else {
            //proveri sifru
            if(user.getPassword().equals(password)){
                modelAndView.setViewName("searchMovies");
                return modelAndView; 
            }
//            request.getSession(true).setAttribute("loggedUser", user);
//            System.out.println("===== username:"+username+" =====");
        }
        System.out.println(" POGRRESNA SIFRAAAA");
        //return "redirect:/";
        
        return modelAndView;
    }

    @GetMapping(path = "register")
    public String register() {
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
        
        return "register";
    }

    @GetMapping
    public String landing() {
        return "landing";
    }

    /*@GetMapping(path = "logout")
    public String logout() {
        return "landing";
    }*/

    @PostMapping(path = "/register/save")
    public String registerUser() {
        return "landing";
    }
    
    @GetMapping(path = "logout")
    public ModelAndView logout(){
        System.out.println("==============================================USPELO");
        ModelAndView modelAndView = new ModelAndView("landing");
        return modelAndView; 
    }
}
