/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rs.njt.webapp.njtbioskopprojekat.entity.Genre;
import rs.njt.webapp.njtbioskopprojekat.service.impl.GenreServiceImpl;

/**
 *
 * @author remmi
 */

@Controller
@RequestMapping(path="/")

public class LandingController {
    @PostMapping(path="searchMovies")
    public String login(){
        return "searchMovies";
    }
    @GetMapping(path="register")
    public String register(){
        GenreServiceImpl gs = new GenreServiceImpl();
        List<Genre> gList = gs.getAll();
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("Genre: " + gList.get(0).toString());
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===============================");
        return "register";
    }
    @GetMapping
    public String landing(){
        return "landing";
    }
    @GetMapping(path="logout")
    public String logout(){
        return "landing";
    }
    @PostMapping(path="/register/save")
    public String registerUser(){
        return "landing";
    }
}
