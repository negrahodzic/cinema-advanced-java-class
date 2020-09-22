/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.njt.webapp.njtbioskopprojekat.converter.ReviewConverter;
import rs.njt.webapp.njtbioskopprojekat.converter.UserConverter;
import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ReviewEntity;
import rs.njt.webapp.njtbioskopprojekat.dto.ReviewDto;
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;
import rs.njt.webapp.njtbioskopprojekat.repository.MovieRepository;
import rs.njt.webapp.njtbioskopprojekat.repository.ReviewRepository;
import rs.njt.webapp.njtbioskopprojekat.service.ReviewService;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<ReviewDto> getAll() {
        List<ReviewEntity> reviews = reviewRepository.findAll();
        List<ReviewDto> reviewDtos = new ArrayList<>();

        for (ReviewEntity review : reviews) {
            reviewDtos.add(ReviewConverter.convertFromEntityToDto(review));
        }

        return reviewDtos;
    }

    /*
    @Override
    public void saveReview(Long movieId, String grade, String comment) {
        //dovrsi logiku za save review
        ReviewEntity reviewEntity = new ReviewEntity();
        reviewRepository.save(reviewEntity);
    }

     */
    @Override
    public void saveReview(Long movieId, int gradeInt, String comment, UserDto user) {

//        ReviewEntity review = new ReviewEntity(gradeInt, comment);
        MovieEntity movie = movieRepository.findById(movieId).get();
        ReviewEntity review = new ReviewEntity(movie, UserConverter.convertFromDtoToEntity(user));
        review.setGrade(gradeInt);
        review.setComment(comment);
        movie.addReviewUser(UserConverter.convertFromDtoToEntity(user), review);

        // ne radi ako vec postoji review sa istim id (movieid i userid)
        movieRepository.saveAndFlush(movie);

    }

    @Override
    public void saveAll(List<ReviewEntity> reviews) {
        reviewRepository.saveAll(reviews);
        reviewRepository.flush();
    }
}
