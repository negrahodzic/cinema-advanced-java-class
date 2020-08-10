/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Negra
 */
public class ReservationDto implements Serializable {

    private Long reservationId;
    private Date dateTimeOfReservation;
    private int ticketQuantity;

    public ReservationDto() {
    }

    public ReservationDto(Long reservationId, Date dateTimeOfReservation, int ticketQuantity) {
        this.reservationId = reservationId;
        this.dateTimeOfReservation = dateTimeOfReservation;
        this.ticketQuantity = ticketQuantity;
    }
    
    
}
