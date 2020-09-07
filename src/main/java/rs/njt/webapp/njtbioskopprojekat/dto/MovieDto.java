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
 * Class represents movie with attributes:
 * <ul>
 * <li>id</li>
 * <li>title</li>
 * <li>description</li>
 * <li>duration</li>
 * <li>image</li>
 * <li>genre</li>
 * <li>list of reviews</li>
 * </ul>
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class MovieDto implements Serializable {

    /**
     * movie id
     */
    private Long movieId;
    /**
     * movie title
     */
    private String title;
    /**
     * movie description
     */
    private String description;
    /**
     * movie duration
     */
    private int duration;
    /**
     * movie image
     */
    private String image;
    /**
     * movie genre
     */
    private GenreDto genre;
    /**
     * movie reviews
     */
    private List<ReviewDto> reviews;

    /**
     * Constructor without parameters
     */
    public MovieDto() {
    }

    /**
     * Constructor with parameters
     *
     * @param title movie title
     * @param description movie description
     * @param duration movie duration
     * @param image movie image
     * @param genre movie genre
     */
    public MovieDto(String title, String description, int duration, String image, GenreDto genre) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.image = image;
        this.genre = genre;
        this.reviews = new ArrayList<>();
    }

    /**
     * Constructor with parameters
     *
     * @param movieId movie id
     * @param title movie title
     * @param description movie description
     * @param duration movie duration
     * @param image movie image
     * @param genre movie genre
     */
    public MovieDto(Long movieId, String title, String description, int duration, String image, GenreDto genre) {
        this.movieId = movieId;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.image = image;
        this.genre = genre;
        this.reviews = new ArrayList<>();
    }

    /**
     * Returns id of movie.
     *
     * @return movie id
     */
    public Long getMovieId() {
        return movieId;
    }

    /**
     * Sets id of movie.
     *
     * @param movieId New value of movie id
     */
    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    /**
     * Returns title of movie.
     *
     * @return movie title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title of movie.
     *
     * @param title New value of movie title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns description of movie.
     *
     * @return movie description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description of movie.
     *
     * @param description New value of movie description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns duration of movie.
     *
     * @return movie duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets duration of movie.
     *
     * @param duration New value of movie duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Returns genre of movie.
     *
     * @return movie genre
     */
    public GenreDto getGenre() {
        return genre;
    }

    /**
     * Sets genre of movie.
     *
     * @param genre New value of movie genre
     */
    public void setGenre(GenreDto genre) {
        this.genre = genre;
    }

    /**
     * Returns reviews of movie.
     *
     * @return movie reviews
     */
    public List<ReviewDto> getReviews() {
        return reviews;
    }

    /**
     * Sets reviews of movie.
     *
     * @param reviews New value of movie reviews
     */
    public void setReviews(List<ReviewDto> reviews) {
        this.reviews = reviews;
    }

    /**
     * Returns image of movie.
     *
     * @return movie image
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets image of movie.
     *
     * @param image New value of movie image
     */
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.movieId);
        hash = 83 * hash + Objects.hashCode(this.title);
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + this.duration;
        hash = 83 * hash + Objects.hashCode(this.image);
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
        if (!Objects.equals(this.image, other.image)) {
            return false;
        }
        if (!Objects.equals(this.movieId, other.movieId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MovieDto{" + "movieId=" + movieId + ", title=" + title + ", description=" + description + ", duration=" + duration + ", image=" + image + '}';
    }

}
