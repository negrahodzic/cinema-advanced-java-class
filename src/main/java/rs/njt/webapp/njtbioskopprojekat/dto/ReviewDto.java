/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class represents movie review with attributes:
 * <ul>
 * <li>id</li>
 * <li>grade</li>
 * <li>comment</li>
 * <li>movie</li>
 * <li>user</li>
 * </ul>
 * 
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class ReviewDto implements Serializable {

    /**
     * review id
     */
    private Long reviewId;
    /**
     * review grade
     */
    private int grade;
    /**
     * review comment
     */
    private String comment;
    /**
     * review movie
     */
    private MovieDto movie;
    /**
     * review user
     */
    private UserDto user;

    /**
     * Constructor without parameters
     */
    public ReviewDto() {
    }

    /**
     * Constructor with parameters
     *
     * @param reviewId review id
     * @param grade review grade
     * @param comment review comment
     */
    public ReviewDto(Long reviewId, int grade, String comment) {
        this.reviewId = reviewId;
        this.grade = grade;
        this.comment = comment;
    }

    /**
     * Constructor with parameters
     *
     * @param reviewId review id
     * @param grade review grade
     * @param comment review comment
     * @param user review user
     */
    public ReviewDto(Long reviewId, int grade, String comment, UserDto user) {
        this.reviewId = reviewId;
        this.grade = grade;
        this.comment = comment;
        this.user = user;
    }

    /**
     * Constructor with parameters
     *
     * @param grade review grade
     * @param comment review comment
     * @param movie review movie
     * @param user review user
     */
    public ReviewDto(int grade, String comment, MovieDto movie, UserDto user) {
        this.grade = grade;
        this.comment = comment;
        this.movie = movie;
        this.user = user;
    }

    /**
     * Constructor with parameters
     *
     * @param reviewId review id
     * @param grade review grade
     * @param comment review comment
     * @param movie review movie
     * @param user review user
     */
    public ReviewDto(Long reviewId, int grade, String comment, MovieDto movie, UserDto user) {
        this.reviewId = reviewId;
        this.grade = grade;
        this.comment = comment;
        this.movie = movie;
        this.user = user;
    }

    
    @Override
    public String toString() {
        return "ReviewDto{" + "reviewId=" + reviewId + ", grade=" + grade + ", comment=" + comment + ", movie=" + movie + ", user=" + user + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.reviewId);
        hash = 89 * hash + this.grade;
        hash = 89 * hash + Objects.hashCode(this.comment);
        hash = 89 * hash + Objects.hashCode(this.movie);
        hash = 89 * hash + Objects.hashCode(this.user);
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
        final ReviewDto other = (ReviewDto) obj;
        if (this.grade != other.grade) {
            return false;
        }
        if (!Objects.equals(this.comment, other.comment)) {
            return false;
        }
        if (!Objects.equals(this.reviewId, other.reviewId)) {
            return false;
        }
        if (!Objects.equals(this.movie, other.movie)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return true;
    }

    /**
     * Returns id of review.
     *
     * @return review id
     */
    public Long getReviewId() {
        return reviewId;
    }

    /**
     * Sets id of review.
     *
     * @param reviewId New value of review id
     */
    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    /**
     * Returns comment of review.
     *
     * @return review comment
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Sets grade of review.
     *
     * @param grade New value of review grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Returns comment of review.
     *
     * @return review comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets comment of review.
     *
     * @param comment New value of review comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Returns movie of review.
     *
     * @return review movie
     */
    public MovieDto getMovie() {
        return movie;
    }

    /**
     * Sets movie of review.
     *
     * @param movie New value of review movie
     */
    public void setMovie(MovieDto movie) {
        this.movie = movie;
    }

    /**
     * Returns user of review.
     *
     * @return review user
     */
    public UserDto getUser() {
        return user;
    }

    /**
     * Sets user of review.
     *
     * @param user New value of review user
     */
    public void setUser(UserDto user) {
        this.user = user;
    }

}
