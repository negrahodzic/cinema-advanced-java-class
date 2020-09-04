/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.converter;

import rs.njt.webapp.njtbioskopprojekat.entity.GenreEntity;
import rs.njt.webapp.njtbioskopprojekat.model.GenreDto;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class GenreConverter {

    public static GenreDto convertFromEntityToDto(GenreEntity genre) {
        GenreDto genreDto = new GenreDto(genre.getGenreId(), genre.getGenreName());
        return genreDto;
    }

    public static GenreEntity convertFromDtoToEntity(GenreDto genreDto) {
        GenreEntity genre = new GenreEntity(genreDto.getId(), genreDto.getGenreName());
        return genre;
    }

}
