/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class UserDto implements Serializable {

    private Long userId;
    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String password;
    private List<ReviewDto> reviews = new ArrayList<>();

    public UserDto() {
    }

    public UserDto(String username) {
        this.username = username;
    }

    public UserDto(Long userId, String firstname, String lastname, String email, String username, String password) {
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ReviewDto> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewDto> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "UserDto{" + "userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", username=" + username + ", password=" + password + ", reviews=" + reviews + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.userId);
        hash = 79 * hash + Objects.hashCode(this.firstname);
        hash = 79 * hash + Objects.hashCode(this.lastname);
        hash = 79 * hash + Objects.hashCode(this.email);
        hash = 79 * hash + Objects.hashCode(this.username);
        hash = 79 * hash + Objects.hashCode(this.password);
        hash = 79 * hash + Objects.hashCode(this.reviews);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserDto other = (UserDto) obj;
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.userId, other.userId)) {
            return false;
        }
        return true;
    }
    
    

}
