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
public class MovieDto implements Serializable {

    private Long movieId;
    private String title;
    private String description;
    private int duration;
//    private List<Genre> genres;
//    private List<Review> reviews;
//    private List<Projection> projections;

    public MovieDto() {
    }

    public MovieDto(Long movieId, String title, String description, int duration) {
        this.movieId = movieId;
        this.title = title;
        this.description = description;
        this.duration = duration;

    }
    
}
