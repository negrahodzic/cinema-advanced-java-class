/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.njt.webapp.njtbioskopprojekat.converter.ReservationConverter;
import rs.njt.webapp.njtbioskopprojekat.entity.ProjectionEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ReservationEntity;
import rs.njt.webapp.njtbioskopprojekat.dto.ReservationDto;
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;
import rs.njt.webapp.njtbioskopprojekat.repository.ProjectionRepository;
import rs.njt.webapp.njtbioskopprojekat.repository.ReservationRepository;
import rs.njt.webapp.njtbioskopprojekat.service.ReservationService;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ProjectionRepository projectionRepository;


    @Override

    public List<ReservationDto> getAll() {
        List<ReservationEntity> reservations = reservationRepository.findAll();
        List<ReservationDto> reservationDtos = new ArrayList<>();

        for (ReservationEntity reservation : reservations) {
            reservationDtos.add(ReservationConverter.convertFromEntityToDto(reservation));
        }
        Collections.sort(reservationDtos);
        return reservationDtos;
    }

    @Override
    public void delete(Long reservationId) {
        Optional<ReservationEntity> reservation = reservationRepository.findById(reservationId);   
        ProjectionEntity projection = reservation.get().getProjection();
     
        int freeSeats = projection.getFreeSeats() + reservation.get().getTicketQuantity();
        projection.setFreeSeats(freeSeats);
        
        projectionRepository.saveAndFlush(projection);
        reservationRepository.deleteById(reservationId);
    }

    @Override
    public void saveReservation(ReservationDto reservation) {
        try {
            ReservationEntity reservationEntity = ReservationConverter.convertFromDtoToEntity(reservation);
            reservationRepository.saveAndFlush(reservationEntity);
        } catch (ParseException ex) {
            Logger.getLogger(ReservationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<ReservationDto> getByUserId(UserDto user) {
        List<ReservationEntity> reservations = reservationRepository.findByUserId(user.getUserId());
        List<ReservationDto> reservationDtos = new ArrayList<>();

        for (ReservationEntity reservation : reservations) {
            reservationDtos.add(ReservationConverter.convertFromEntityToDto(reservation));
        }
        Collections.sort(reservationDtos);
        return reservationDtos;
    }

    @Override
    public void saveAll(List<ReservationEntity> reservations) {
        reservationRepository.saveAll(reservations);
        reservationRepository.flush();
    }

}
