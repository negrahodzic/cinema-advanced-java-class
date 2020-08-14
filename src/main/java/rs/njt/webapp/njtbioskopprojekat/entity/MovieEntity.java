/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Negra
 */
@Entity
@Table(name = "MOVIE")
public class MovieEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;
    private String title;
    private String description;
    private int duration;
    
    @ManyToOne // Note: U nasem slucaju, film ima samo jedan zanr 
    @JoinColumn(name = "GENRE_ID", referencedColumnName = "GENRE_ID")
    private GenreEntity genre;
    
    @OneToMany
    @JoinColumn(name = "MOVIE_ID", referencedColumnName = "movieId")
    private List<ProjectionEntity> projections; 
    
    
//    @OneToMany
//    @JoinColumn(name = "MOVIE_ID")
//    private List<ReviewEntity> reviews;


    public MovieEntity() {
        projections = new ArrayList();
    }

    public MovieEntity(Long movieId, String title, String description, int duration) {
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
