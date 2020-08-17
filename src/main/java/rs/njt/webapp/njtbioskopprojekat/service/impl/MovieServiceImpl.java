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

            // TODO: ovo napraviti u metodi u review repo ili service 
            List<ReviewEntity> reviews = movie.getReviews();
            List<ReviewDto> reviewDtos = new ArrayList<>();

            for (ReviewEntity review : reviews) {
                reviewDtos.add(new ReviewDto(review.getReviewId(), review.getGrade(), review.getComment()));
            }

            movieDtos.add(new MovieDto(movie.getMovieId(), movie.getTitle(), movie.getDescription(),
                    movie.getDuration(), new GenreDto(movie.getGenre().getGenreId(), movie.getGenre().getGenreName()),
                    reviewDtos));
        }

        return movieDtos;
    }

    @Override
    public MovieDto getById(Long movieId) {
        Optional<MovieEntity> movie = movieRepository.findById(movieId);

        List<ReviewEntity> reviews = movie.get().getReviews();
        List<ReviewDto> reviewDtos = new ArrayList<>();

        for (ReviewEntity review : reviews) {
            reviewDtos.add(new ReviewDto(review.getReviewId(), review.getGrade(), review.getComment(), 
                    new UserDto(review.getUser().getUsername())));
        }

        MovieDto movieDto = new MovieDto(movie.get().getMovieId(), movie.get().getTitle(), movie.get().getDescription(),
                movie.get().getDuration(), new GenreDto(movie.get().getGenre().getGenreId(), movie.get().getGenre().getGenreName()),
                reviewDtos);
        
        return movieDto;
    }

}
