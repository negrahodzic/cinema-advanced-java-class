/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Negra
 */
public class ReviewDto implements Serializable {

    private Long reviewId;
    private int grade;
    private String comment;
    private MovieDto movie;
    private UserDto user;

    public ReviewDto() {
    }

    public ReviewDto(Long reviewId, int grade, String comment) {
        this.reviewId = reviewId;
        this.grade = grade;
        this.comment = comment;
    }

    
    public ReviewDto(int grade, String comment, MovieDto movie, UserDto user) {
        this.grade = grade;
        this.comment = comment;
        this.movie = movie;
        this.user = user;
    }

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

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public MovieDto getMovie() {
        return movie;
    }

    public void setMovie(MovieDto movie) {
        this.movie = movie;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

  

}
