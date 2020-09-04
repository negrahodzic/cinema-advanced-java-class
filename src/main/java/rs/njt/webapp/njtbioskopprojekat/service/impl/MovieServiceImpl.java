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
import rs.njt.webapp.njtbioskopprojekat.converter.MovieConverter;
import rs.njt.webapp.njtbioskopprojekat.converter.ReviewConverter;
import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ReviewEntity;
import rs.njt.webapp.njtbioskopprojekat.model.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.model.ReviewDto;
import rs.njt.webapp.njtbioskopprojekat.repository.MovieRepository;
import rs.njt.webapp.njtbioskopprojekat.service.MovieService;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
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
        
        MovieDto movieDto = MovieConverter.convertFromEntityToDto(movie.get());
        
        List<ReviewDto> reviewDtos = new ArrayList<>();
        for (ReviewEntity review : movie.get().getReviews()) {
            reviewDtos.add(ReviewConverter.convertFromEntityToDto(review));
        }

        movieDto.setReviews(reviewDtos);
        
        return movieDto;
    }

    @Override
    public List<MovieDto> searchByTitleAndGenre(String titleFilter, String genreFilter) {
        List<MovieEntity> movies = movieRepository.findAll();
        List<MovieDto> movieDtos = new ArrayList<>();
        
        for(MovieEntity movie: movies){
            if(genreFilter.equals("- Choose genre -")){
                if(movie.getTitle().toLowerCase().startsWith(titleFilter)){
                    movieDtos.add(MovieConverter.convertFromEntityToDto(movie));
                }
            }else if(movie.getGenre().getGenreName().equals(genreFilter)){
                if(titleFilter.equals("")){
                    movieDtos.add(MovieConverter.convertFromEntityToDto(movie));
                }else if(movie.getTitle().toLowerCase().startsWith(titleFilter)){
                    movieDtos.add(MovieConverter.convertFromEntityToDto(movie));
                }
            }
            
            
        }
        return movieDtos;
    }

}
