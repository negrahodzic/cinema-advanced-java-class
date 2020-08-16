/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Negra
 */
public class MovieDto implements Serializable {

    private Long movieId;
    private String title;
    private String description;
    private int duration;
    private GenreDto genre;
    private List<ReviewDto> reviews;

    public MovieDto() {
        
    }

    public MovieDto(String title, String description, int duration, GenreDto genre, List<ReviewDto> reviews) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.genre = genre;
        this.reviews = reviews;
    }

    public MovieDto(Long movieId, String title, String description, int duration, GenreDto genre, List<ReviewDto> reviews) {
        this.movieId = movieId;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.genre = genre;
        this.reviews = reviews;
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

    public GenreDto getGenre() {
        return genre;
    }

    public void setGenre(GenreDto genre) {
        this.genre = genre;
    }

    public List<ReviewDto> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewDto> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "MovieDto{" + "movieId=" + movieId + ", title=" + title + ", description=" + description + ", duration=" + duration + ", genre=" + genre + ", reviews=" + reviews + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.movieId);
        hash = 47 * hash + Objects.hashCode(this.title);
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + this.duration;
        hash = 47 * hash + Objects.hashCode(this.genre);
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
        final MovieDto other = (MovieDto) obj;
        if (this.duration != other.duration) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.movieId, other.movieId)) {
            return false;
        }
        if (!Objects.equals(this.genre, other.genre)) {
            return false;
        }
        return true;
    }


    
}
