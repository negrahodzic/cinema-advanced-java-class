/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.njt.webapp.njtbioskopprojekat.converter.GenreConverter;
import rs.njt.webapp.njtbioskopprojekat.converter.MovieConverter;
import rs.njt.webapp.njtbioskopprojekat.converter.ReviewConverter;
import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ReviewEntity;
import rs.njt.webapp.njtbioskopprojekat.model.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.model.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.model.ReviewDto;
import rs.njt.webapp.njtbioskopprojekat.model.UserDto;
import rs.njt.webapp.njtbioskopprojekat.repository.MovieRepository;
import rs.njt.webapp.njtbioskopprojekat.service.MovieService;

/**
 *
 * @author Negra
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<MovieDto> getAll() {
        List<MovieEntity> movies = movieRepository.findAll();
        List<MovieDto> movieDtos = new ArrayList<>();

        for (MovieEntity movie : movies) {
            MovieDto movieDto = MovieConverter.convertFromEntityToDto(movie);
            movieDtos.add(movieDto);
        }

        return movieDtos;
    }

    @Override
    public MovieDto getById(Long movieId) {
        Optional<MovieEntity> movie = movieRepository.findById(movieId);
        
        // movieDto bez liste reviews
        MovieDto movieDto = MovieConverter.convertFromEntityToDto(movie.get());
        
        // Entity -> Dto reviews
        List<ReviewDto> reviewDtos = new ArrayList<>();
        for (ReviewEntity review : movie.get().getReviews()) {
            reviewDtos.add(ReviewConverter.convertFromEntityToDto(review));
        }
        
        // movieDto sa listom reviews
        movieDto.setReviews(reviewDtos);
        
        return movieDto;
    }

}
