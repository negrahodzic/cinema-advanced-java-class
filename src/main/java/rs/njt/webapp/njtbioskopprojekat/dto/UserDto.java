/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class represents user with attributes:
 * <ul>
 * <li>id</li>
 * <li>first name</li>
 * <li>last name</li>
 * <li>email</li>
 * <li>username</li>
 * <li>password</li>
 * <li>reviews</li>
 * </ul>
 * 
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class UserDto implements Serializable {

    /**
     * user id
     */
    private Long userId;
    /**
     * user first name
     */
    private String firstname;
    /**
     * user last name
     */
    private String lastname;
    /**
     * user email
     */
    private String email;
    /**
     * user username
     */
    private String username;
    /**
     * user password
     */
    private String password;
    /**
     * user reviews
     */
    private List<ReviewDto> reviews = new ArrayList<>();

    /**
     * Constructor without parameters
     */
    public UserDto() {
    }

    /**
     * Constructor with parameters
     *
     * @param username user username
     */
    public UserDto(String username) {
        this.username = username;
    }

    /**
     * Constructor with parameters
     *
     * @param userId user id
     * @param firstname user first name
     * @param lastname user last name
     * @param email user email
     * @param username user username
     * @param password user password
     */
    public UserDto(Long userId, String firstname, String lastname, String email, String username, String password) {
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    /**
     * Returns id of user.
     *
     * @return user id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets id of user.
     *
     * @param userId New value of user id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Returns first name of user.
     *
     * @return user first name
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets first name of user.
     *
     * @param firstname New value of user first name
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Returns last name of user.
     *
     * @return user last name
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets last name of user.
     *
     * @param lastname New value of user last name
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns email of user.
     *
     * @return user email
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Sets email of user.
     *
     * @param email New value of user email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns username of user.
     *
     * @return user username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username of user.
     *
     * @param username New value of user username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Returns password of user.
     *
     * @return user password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password of user.
     *
     * @param password New value of user password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns reviews of user.
     *
     * @return user reviews
     */
    public List<ReviewDto> getReviews() {
        return reviews;
    }

    /**
     * Sets reviews of user.
     *
     * @param reviews New value of user reviews
     */
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

    /**
     * Enables and disables user.
     *
     * @param b is user enabled
     */
    public void setEnabled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
