/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.converter;

import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;
import rs.njt.webapp.njtbioskopprojekat.model.MovieDto;

/**
 *
 * @author Negra
 */
public class MovieConverter {

    public static MovieDto convertFromEntityToDto(MovieEntity movie) {
        MovieDto movieDto = new MovieDto(movie.getMovieId(), movie.getTitle(), movie.getDescription(), movie.getDuration(),
                                GenreConverter.convertFromEntityToDto(movie.getGenre()),
                                ReviewConverter.convertListFromEntityToDto(movie.getReviews()));
        return movieDto;
    }

    public static MovieEntity convertFromDtoToEntity(MovieDto movieDto) {
        MovieEntity movie = new MovieEntity(movieDto.getMovieId(), movieDto.getTitle(), movieDto.getDescription(), movieDto.getDuration(),
                                GenreConverter.convertFromDtoToEntity(movieDto.getGenre()));
        return movie;
    }
}
