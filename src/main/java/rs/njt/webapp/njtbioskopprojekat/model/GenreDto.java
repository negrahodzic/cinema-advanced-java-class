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

    public GenreDto(Long id, String genreName) {
        this.id = id;
        this.genreName = genreName;
    } 
    
    
}
