/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.event;

import org.springframework.context.ApplicationEvent;
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class OnRegistrationCompleteEvent extends ApplicationEvent {

    private String appUrl;
    private UserDto user;

    public OnRegistrationCompleteEvent(UserDto user, String appUrl) {
        super(user);

        this.user = user;
        this.appUrl = appUrl;
    }

    public OnRegistrationCompleteEvent(Object source) {
        super(source);
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    
}
