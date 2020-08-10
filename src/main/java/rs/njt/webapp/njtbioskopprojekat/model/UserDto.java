/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.model;

import java.io.Serializable;

/**
 *
 * @author Negra
 */
public class UserDto implements Serializable {

    private Long userId;
    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String password;
    // private List<Reservation> reservations;
    //private List<Review> reviews;

    public UserDto() {
    }

    public UserDto(Long userId, String firstname, String lastname, String email, String username, String password) {
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
        this.password = password;

    }

}
