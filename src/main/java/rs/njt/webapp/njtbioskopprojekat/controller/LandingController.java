/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.controller;

import rs.njt.webapp.njtbioskopprojekat.event.OnRegistrationCompleteEvent;
import java.util.Calendar;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import rs.njt.webapp.njtbioskopprojekat.dto.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.dto.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.entity.UserEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.VerificationToken;
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;
import rs.njt.webapp.njtbioskopprojekat.json.JsonToEntity;
import rs.njt.webapp.njtbioskopprojekat.service.GenreService;
import rs.njt.webapp.njtbioskopprojekat.service.MovieService;
import rs.njt.webapp.njtbioskopprojekat.service.ProjectionService;
import rs.njt.webapp.njtbioskopprojekat.service.ReservationService;
import rs.njt.webapp.njtbioskopprojekat.service.RoomService;
import rs.njt.webapp.njtbioskopprojekat.service.UserService;

/**
 * Class represents controller for requests coming from root path "/".
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Controller
@RequestMapping(path = "/")
public class LandingController {

    /**
     * movie service
     */
    private final MovieService movieService;
    /**
     * user service
     */
    private final UserService userService;
    /**
     * genre service
     */
    private final GenreService genreService;
    /**
     * toast message
     */
    private final String message = "";
    /**
     * model and view
     */
    private final ModelAndView modelAndView;

    /**
     * event publisher
     */
    @Autowired
    ApplicationEventPublisher eventPublisher;

    private final ProjectionService projectionService;
    private final RoomService roomService;
    private final ReservationService reservationService;

    /**
     * Constructor with parameters
     *
     * @param movieService movie service
     * @param userService user service
     * @param genreService genre service
     */
    @Autowired
    public LandingController(MovieService movieService, UserService userService, GenreService genreService, ProjectionService projectionService, RoomService roomService, ReservationService reservationService) {
        this.movieService = movieService;
        this.userService = userService;
        this.genreService = genreService;
        this.modelAndView = new ModelAndView();
        this.projectionService = projectionService;
        this.roomService = roomService;
        this.reservationService = reservationService;
        
//        roomService.saveAll(JsonToEntity.jsonToRoom());
//        userService.saveAll(JsonToEntity.jsonToUser());
//        genreService.saveAll(JsonToEntity.jsonToGenre());
//        movieService.saveAll(JsonToEntity.jsonToMovie());
//        projectionService.saveAll(JsonToEntity.jsonToProjection());
//        reservationService.saveAll(JsonToEntity.jsonToReservation());

    }

    /**
     * Returns model and view of GET request with path "/".
     *
     * @return modelAndView
     */
    @GetMapping
    public ModelAndView landing() {
        modelAndView.setViewName("searchMovies");
        modelAndView.addObject("movies", movieService.getAll());
        return modelAndView;
    }

    /**
     * Returns model and view of GET request with path "landing".
     *
     * @return modelAndView
     */
    @GetMapping(path = "landing")
    public ModelAndView landingLogin() {
        modelAndView.setViewName("landing");
        return modelAndView;
    }

    /**
     * Returns model and view of POST request with path "login".
     *
     * @param request http servlet request
     * @return modelAndView
     */
    @PostMapping(path = "login")
    public ModelAndView login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || username.isEmpty()) {
            request.getSession(true).setAttribute("message", "You didn't enter all fields!");
            modelAndView.setViewName("redirect:/landing");
        } else {
            UserDto user = userService.findByUsername(username);

            if (user == null) {
                request.getSession(true).setAttribute("message", "There is no user with username " + username + "!");
                modelAndView.setViewName("redirect:/landing");
            } else if (!user.getPassword().equals(password)) {
                request.getSession(true).setAttribute("message", "You entered incorrect password!");
                modelAndView.setViewName("redirect:/landing");
            } else {
                request.getSession(true).setAttribute("loggedUser", user);
                modelAndView.setViewName("redirect:/searchMovies");
            }
        }

        return modelAndView;
    }

    /**
     * Returns model and view of GET request with path "register".
     *
     * @return modelAndView
     */
    @GetMapping(path = "register")
    public ModelAndView register() {
        modelAndView.setViewName("register");
        return modelAndView;
    }

    /**
     * Returns model and view of GET request with path "logout".
     *
     * @param request http servlet request
     * @return modelAndView
     */
    @GetMapping(path = "logout")
    public ModelAndView logout(HttpServletRequest request) {
        request.getSession(true).setAttribute("loggedUser", null);
        request.getSession(true).setAttribute("message", "You succesfully logged out!");
        request.getSession(true).invalidate();
        modelAndView.setViewName("landing");
        return modelAndView;
    }

    /**
     * Returns model and view of POST request with path "registration".
     *
     * @param request http servlet request
     * @return modelAndView
     */
    @PostMapping("/registration")
    public ModelAndView registerUserAccount(HttpServletRequest request) {
        UserDto user = new UserDto();

        user.setFirstname(request.getParameter("firstname"));
        user.setLastname(request.getParameter("lastname"));
        user.setEmail(request.getParameter("email"));
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));

        if (user.getFirstname().isEmpty() || user.getLastname().isEmpty() || user.getEmail().isEmpty()
                || equals(user.getUsername().isEmpty() || user.getPassword().isEmpty())) {
            request.getSession(true).setAttribute("message", "You didnt enter all fields!");
            modelAndView.setViewName("redirect:/register");
        } else if (userService.findByUsername(user.getUsername()) != null) {
            request.getSession(true).setAttribute("message", "User with that username already exists!");
            modelAndView.setViewName("redirect:/register");
        } else {
            UserDto registered = userService.registerNewUserAccount(user);

            String appUrl = request.getContextPath();
            eventPublisher.publishEvent(new OnRegistrationCompleteEvent(registered, appUrl));

            modelAndView.setViewName("redirect:/landing");
            request.getSession(true).setAttribute("message", "Succesfully registered, please verify email!");
        }
        return modelAndView;
    }

    /**
     * Returns model and view of GET request with path "registrationConfirm".
     *
     * @param request web request
     * @param token token parameter from web request
     * @return modelAndView
     */
    @GetMapping("/regitrationConfirm")
    public ModelAndView confirmRegistration(WebRequest request, @RequestParam("token") String token) {

        VerificationToken verificationToken = userService.getVerificationToken(token);
        if (verificationToken == null) {
            modelAndView.setViewName("redirect:/error");
            modelAndView.addObject("msg", "verificationToken == null");
            return modelAndView;
        }

        UserEntity user = verificationToken.getUser();
        Calendar cal = Calendar.getInstance();
        if ((verificationToken.getExpiryDate().getTime() - cal.getTime().getTime()) <= 0) {
            modelAndView.setViewName("redirect:/error");
            modelAndView.addObject("msg", "verificationToken == expired");
            return modelAndView;
        }

        user.setEnabled(true);
        userService.saveRegisteredUser(user);
        modelAndView.setViewName("redirect:/landing");
        modelAndView.addObject("msg", "Successfully verifed email!");
        return modelAndView;
    }

    /**
     * Returns model and view of GET request with path "error".
     *
     * @return modelAndView
     */
    @GetMapping(path = "/error")
    public ModelAndView error() {
        modelAndView.setViewName("error");
        return modelAndView;
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
