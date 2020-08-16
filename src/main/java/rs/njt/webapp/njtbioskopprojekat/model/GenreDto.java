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
public class GenreDto implements Serializable {

    private Long id;
    private String genreName;

    public GenreDto() {
    }

    public GenreDto(String genreName) {
        this.genreName = genreName;
    }

    public GenreDto(Long id, String genreName) {
        this.id = id;
        this.genreName = genreName;
    } 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
    
    
    
}
