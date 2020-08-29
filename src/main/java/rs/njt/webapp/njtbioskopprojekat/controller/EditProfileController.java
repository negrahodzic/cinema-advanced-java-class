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
import rs.njt.webapp.njtbioskopprojekat.service.UserService;

/**
 *
 * @author remmi
 */
@Controller
@RequestMapping(path="/editProfile")
public class EditProfileController {
    
    private ModelAndView modelAndView = new ModelAndView();
    private final UserService userService;
    
    @GetMapping
    public ModelAndView editProfile(){
         modelAndView.setViewName("editProfile");
        return modelAndView;
    }
    
    @Autowired
    public EditProfileController(UserService userService) {
        
        this.userService = userService;
        
    }
    
    
    @PostMapping(path="/save")
    public ModelAndView saveChanges(HttpServletRequest request){
        
        UserDto user = (UserDto) request.getSession(true).getAttribute("loggedUser");
        
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        user.setFirstname(firstName);
        user.setLastname(lastName);
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password);
        
        userService.updateUser(user);      

        request.getSession(true).setAttribute("message", "Saved changes!");
        modelAndView.setViewName("redirect:/editProfile");
        return modelAndView;
    }
}
