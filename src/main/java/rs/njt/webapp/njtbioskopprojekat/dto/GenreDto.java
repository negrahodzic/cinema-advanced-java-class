/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.dto;

import java.io.Serializable;

/**
 * Class represents movie genre with attributes:
 * <ul>
 * 	<li>id</li>
 * 	<li>genre name</li>
 * </ul>
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class GenreDto implements Serializable {

    /**
     * genre id
     */
    private Long id;
    /**
     * genre name
     */
    private String genreName;

    /**
     * Constructor without parameters
     */
    public GenreDto() {
    }

    /**
     * Constructor with parameters
     *
     * @param genreName genre name
     */
    public GenreDto(String genreName) {
        this.genreName = genreName;
    }

    /**
     * Constructor with parameters
     *
     * @param id genre id
     * @param genreName genre name
     */
    public GenreDto(Long id, String genreName) {
        this.id = id;
        this.genreName = genreName;
    }

    /**
     * Returns id of genre.
     *
     * @return genre id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id of genre.
     *
     * @param id New value of genre id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns name of genre.
     *
     * @return genre name
     */
    public String getGenreName() {
        return genreName;
    }

    /**
     * Sets name of genre.
     *
     * @param genreName New value of genre name
     */
    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

}
