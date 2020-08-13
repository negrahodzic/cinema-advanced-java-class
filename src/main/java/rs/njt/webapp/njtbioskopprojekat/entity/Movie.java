/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Negra
 */
@Entity
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;
    private String title;
    private String description;
    private int duration;
    @OneToMany
    @JoinColumn(name = "MOVIE_ID")
    private List<Genre> genres;
    @OneToMany
    @JoinColumn(name = "MOVIE_ID")
    private List<Review> reviews;
    @OneToMany
    @JoinColumn(name = "MOVIE_ID")
    private List<Projection> projections;

    public Movie() {
    }

    public Movie(Long movieId, String title, String description, int duration) {
        this.movieId = movieId;
        this.title = title;
        this.description = description;
        this.duration = duration;

    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
