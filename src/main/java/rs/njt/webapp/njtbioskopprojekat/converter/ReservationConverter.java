/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.converter;

import rs.njt.webapp.njtbioskopprojekat.entity.ReservationEntity;
import rs.njt.webapp.njtbioskopprojekat.model.ReservationDto;

/**
 *
 * @author Negra
 */
public class ReservationConverter {

    public static ReservationDto convertFromEntityToDto(ReservationEntity reservation) {
        ReservationDto reservationDto = new ReservationDto(reservation.getReservationId(), reservation.getDateTimeOfReservation(), reservation.getTicketQuantity(), 
                                            ProjectionConverter.convertFromEntityToDto(reservation.getProjection()),
                                            UserConverter.convertFromEntityToDto(reservation.getUser()));
        return reservationDto;
    }

    public static ReservationEntity convertFromDtoToEntity(ReservationDto reservationDto) {
        ReservationEntity reservation = new ReservationEntity(reservationDto.getReservationId(), reservationDto.getDateTimeOfReservation(), reservationDto.getTicketQuantity(), 
                                            ProjectionConverter.convertFromDtoToEntity(reservationDto.getProjection()),
                                            UserConverter.convertFromDtoToEntity(reservationDto.getUser()));
        return reservation;
    }
}
