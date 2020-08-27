/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.converter;

import java.util.ArrayList;
import java.util.List;
import rs.njt.webapp.njtbioskopprojekat.entity.ReviewEntity;
import rs.njt.webapp.njtbioskopprojekat.model.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.model.ReviewDto;
import rs.njt.webapp.njtbioskopprojekat.model.UserDto;

/**
 *
 * @author Negra
 */
public class ReviewConverter {

    public static ReviewDto convertFromEntityToDto(ReviewEntity review) {
        MovieDto movieDto = new MovieDto(review.getMovie().getMovieId(), review.getMovie().getTitle(), review.getMovie().getDescription(), review.getMovie().getDuration(),
                GenreConverter.convertFromEntityToDto(review.getMovie().getGenre()));
        UserDto userDto = UserConverter.convertFromEntityToDto(review.getUser());
        ReviewDto reviewDto = new ReviewDto(review.getGrade(), review.getComment(),
                movieDto,
                userDto);
        return reviewDto;
    }

    public static ReviewEntity convertFromDtoToEntity(ReviewDto reviewDto) {
        ReviewEntity review = new ReviewEntity( reviewDto.getGrade(), reviewDto.getComment(),
                MovieConverter.convertFromDtoToEntity(reviewDto.getMovie()),
                UserConverter.convertFromDtoToEntity(reviewDto.getUser()));
        return review;
    }

//    public static List<ReviewDto> convertListFromEntityToDto(List<ReviewEntity> reviews) {
//
//        List<ReviewDto> reviewDtos = new ArrayList<>();
//
//        for (ReviewEntity review : reviews) {
//            MovieDto movieDto = new MovieDto(review.getMovie().getMovieId(), review.getMovie().getTitle(), review.getMovie().getDescription(), review.getMovie().getDuration(),
//                                    GenreConverter.convertFromEntityToDto(review.getMovie().getGenre()),
//                                    reviewDtos);
//            reviewDtos.add(ReviewConverter.convertFromEntityToDto(review));
//        }
//
//        return reviewDtos;
//    }
//
//    public static List<ReviewEntity> convertListFromDtoToEntity(List<ReviewDto> reviewDtos) {
//        List<ReviewEntity> reviews = new ArrayList<>();
//
//        for (ReviewDto reviewDto : reviewDtos) {
//            reviews.add(ReviewConverter.convertFromDtoToEntity(reviewDto));
//        }
//
//        return reviews;
//    }
}
