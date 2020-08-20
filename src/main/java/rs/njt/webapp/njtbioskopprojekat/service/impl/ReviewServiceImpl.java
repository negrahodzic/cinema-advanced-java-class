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
import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ReviewEntity;
import rs.njt.webapp.njtbioskopprojekat.model.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.model.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.model.ReviewDto;
import rs.njt.webapp.njtbioskopprojekat.repository.ReviewRepository;
import rs.njt.webapp.njtbioskopprojekat.service.ReviewService;

/**
 *
 * @author Negra
 */
@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;


    @Override
    public List<ReviewDto> getAll() {
        List<ReviewEntity> reviews = reviewRepository.findAll();
        List<ReviewDto> reviewDtos = new ArrayList<>();

        for (ReviewEntity review : reviews) {                        
            reviewDtos.add(new ReviewDto(review.getReviewId(), review.getGrade(), review.getComment()));
        }

        return reviewDtos; 
    }

    @Override
    public void saveReview(Long movieId, String grade, String comment) {
        //dovrsi logiku za save review
        ReviewEntity reviewEntity = new ReviewEntity();
        reviewRepository.save(reviewEntity);
    }


}
