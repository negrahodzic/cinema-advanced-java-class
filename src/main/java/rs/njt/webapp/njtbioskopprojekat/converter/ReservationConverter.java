/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.converter;

import java.text.ParseException;
import java.util.Date;
import rs.njt.webapp.njtbioskopprojekat.entity.ReservationEntity;
import rs.njt.webapp.njtbioskopprojekat.model.ReservationDto;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class ReservationConverter {

    public static ReservationDto convertFromEntityToDto(ReservationEntity reservation) {
        ReservationDto reservationDto = new ReservationDto(reservation.getReservationId(), reservation.getDateTimeOfReservation(), reservation.getTicketQuantity(), reservationStatus(reservation),
                                            ProjectionConverter.convertFromEntityToDto(reservation.getProjection()),
                                            UserConverter.convertFromEntityToDto(reservation.getUser()));
        return reservationDto;
    }

    public static ReservationEntity convertFromDtoToEntity(ReservationDto reservationDto) throws ParseException {
        ReservationEntity reservation = new ReservationEntity(reservationDto.getReservationId(), reservationDto.getDateTimeOfReservation(), reservationDto.getTicketQuantity(), 
                                            ProjectionConverter.convertFromDtoToEntity(reservationDto.getProjection()),
                                            UserConverter.convertFromDtoToEntity(reservationDto.getUser()));
        return reservation;
    }
    
    public static String reservationStatus(ReservationEntity reservation){
        if (reservation.getProjection().getDateTimeOfProjection().before(new Date()))
        return "expired";
        else return "active";
    }
}
