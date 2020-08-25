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
import rs.njt.webapp.njtbioskopprojekat.entity.GenreEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ProjectionEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ReservationEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ReviewEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.RoomEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.UserEntity;
import rs.njt.webapp.njtbioskopprojekat.model.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.model.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.model.ProjectionDto;
import rs.njt.webapp.njtbioskopprojekat.model.ReservationDto;
import rs.njt.webapp.njtbioskopprojekat.model.ReviewDto;
import rs.njt.webapp.njtbioskopprojekat.model.RoomDto;
import rs.njt.webapp.njtbioskopprojekat.model.UserDto;
import rs.njt.webapp.njtbioskopprojekat.repository.MovieRepository;
import rs.njt.webapp.njtbioskopprojekat.repository.ReservationRepository;
import rs.njt.webapp.njtbioskopprojekat.service.ReservationService;

/**
 *
 * @author Negra
 */
@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public List<ReservationDto> getAll() {
        List<ReservationEntity> reservations = reservationRepository.findAll();
        List<ReservationDto> reservationDtos = new ArrayList<>();

        for (ReservationEntity reservation : reservations) {   
            
            // TODO: ovo napraviti u metodi u review repo ili service 
            List<ReviewEntity> reviews = reservation.getProjection().getMovie().getReviews();   
            List<ReviewDto> reviewDtos = new ArrayList<>();
            
            for (ReviewEntity review : reviews) { 
                reviewDtos.add(new ReviewDto(review.getReviewId(), review.getGrade(), review.getComment()));
            }
            
            reservationDtos.add(new ReservationDto(reservation.getReservationId(), reservation.getDateTimeOfReservation(), 
                                reservation.getTicketQuantity(), 
                                // projectionService.findById(reservation.getProjection().getProjectionId())
                                new ProjectionDto(reservation.getProjection().getProjectionId(), reservation.getProjection().getDateTimeOfProjection(), reservation.getProjection().getTechnology() ,reservation.getProjection().getEdited(), 
                                            new RoomDto(reservation.getProjection().getRoom().getRoomId(), reservation.getProjection().getRoom().getCapacity(), reservation.getProjection().getRoom().getRoomName()), 
                                            new MovieDto(reservation.getProjection().getMovie().getMovieId(), reservation.getProjection().getMovie().getTitle(), reservation.getProjection().getMovie().getDescription(), reservation.getProjection().getMovie().getDuration(), 
                                                        new GenreDto(reservation.getProjection().getMovie().getGenre().getGenreId(), reservation.getProjection().getMovie().getGenre().getGenreName()), 
                                                        reviewDtos)), 
                                new UserDto(reservation.getUser().getUserId(), reservation.getUser().getFirstname(), reservation.getUser().getLastname(), reservation.getUser().getEmail(), reservation.getUser().getUsername(), reservation.getUser().getPassword())
            ));
        }

        return reservationDtos; 
    }

    @Override
    public void delete(Long reservationId) {
        reservationRepository.deleteById(reservationId);
    }

    @Override
    public void saveReservation(ReservationDto reservation) {
        List<ReviewDto> reviewDtos = reservation.getProjection().getMovie().getReviews();
        /*List<ReviewEntity> reviews = new ArrayList<>();
              
        for (ReviewDto review : reviewDtos) { 
                reviews.add(new ReviewEntity(review.getReviewId(), review.getGrade(), review.getComment(),
                        new MovieEntity(review.getMovie().getMovieId(), review.getMovie().getTitle(), review.getMovie().getDescription(), review.getMovie().getDuration(), new GenreEntity(review.getMovie().getGenre().getId(), review.getMovie().getGenre().getGenreName())),
                        new UserEntity(review.getUser().getUserId(), review.getUser().getFirstname(), review.getUser().getLastname(), review.getUser().getEmail(), review.getUser().getUsername(), review.getUser().getPassword())));
            }*/
        ReservationEntity reservationEntity = new ReservationEntity(reservation.getDateTimeOfReservation(), reservation.getTicketQuantity(), new ProjectionEntity(reservation.getProjection().getProjectionId(), reservation.getProjection().getDateTimeOfProjection(), reservation.getProjection().getTechnology() ,reservation.getProjection().getEdited(), 
                                            new RoomEntity(reservation.getProjection().getRoom().getRoomId(), reservation.getProjection().getRoom().getCapacity(), reservation.getProjection().getRoom().getRoomName()), 
                                            new MovieEntity(reservation.getProjection().getMovie().getMovieId(), reservation.getProjection().getMovie().getTitle(), reservation.getProjection().getMovie().getDescription(), reservation.getProjection().getMovie().getDuration(), 
                                                        new GenreEntity(reservation.getProjection().getMovie().getGenre().getId(), reservation.getProjection().getMovie().getGenre().getGenreName()))), 
                                            new UserEntity(reservation.getUser().getUserId(), reservation.getUser().getFirstname(), reservation.getUser().getLastname(), reservation.getUser().getEmail(), reservation.getUser().getUsername(), reservation.getUser().getPassword()));
        reservationRepository.saveAndFlush(reservationEntity);

    }

}
