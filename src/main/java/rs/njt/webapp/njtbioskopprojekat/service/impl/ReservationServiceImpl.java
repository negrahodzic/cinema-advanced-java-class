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
import rs.njt.webapp.njtbioskopprojekat.entity.ReservationEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ReviewEntity;
import rs.njt.webapp.njtbioskopprojekat.model.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.model.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.model.ProjectionDto;
import rs.njt.webapp.njtbioskopprojekat.model.ReservationDto;
import rs.njt.webapp.njtbioskopprojekat.model.ReviewDto;
import rs.njt.webapp.njtbioskopprojekat.model.RoomDto;
import rs.njt.webapp.njtbioskopprojekat.model.UserDto;
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

}
