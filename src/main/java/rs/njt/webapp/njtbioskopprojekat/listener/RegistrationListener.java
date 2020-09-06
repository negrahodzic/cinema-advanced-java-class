/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.listener;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import rs.njt.webapp.njtbioskopprojekat.event.OnRegistrationCompleteEvent;
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;
import rs.njt.webapp.njtbioskopprojekat.service.UserService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Component
public class RegistrationListener implements 
  ApplicationListener<OnRegistrationCompleteEvent> {
 
    @Autowired
    private UserService service;
 
//    @Autowired
//    private MessageSource messages;
// 
    @Autowired
    private JavaMailSender mailSender;
 
    @Override
    public void onApplicationEvent(OnRegistrationCompleteEvent event) {
        this.confirmRegistration(event);
    }
 
    private void confirmRegistration(OnRegistrationCompleteEvent event) {
        UserDto user = event.getUser();
        String token = UUID.randomUUID().toString();
        service.createVerificationToken(user, token);
        
        System.out.println("===============================================");
        System.out.println("============== confirmRegistration ============");
        System.out.println("===============================================");
        
        String recipientAddress = user.getEmail();
        String subject = "Registration Confirmation";
        String confirmationUrl 
          = event.getAppUrl() + "/regitrationConfirm.html?token=" + token;
//        String message = messages.getMessage("message.regSucc", null, event.getLocale());
        
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        email.setText(" message.regSucc " + "\r\n" + "http://localhost:8080" + confirmationUrl);
        mailSender.send(email);
     
    }
}
