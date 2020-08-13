/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Negra
 */
@Entity
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    private Date dateTimeOfReservation;
    private int ticketQuantity;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "PROJECTION_ID")
    private Long projectionId;

//    @ManyToOne
//    @JoinColumn(name = "fk_user")
//    private User user;
    public Reservation() {
    }

    public Reservation(Long reservationId, Date dateTimeOfReservation, int ticketQuantity) {
        this.reservationId = reservationId;
        this.dateTimeOfReservation = dateTimeOfReservation;
        this.ticketQuantity = ticketQuantity;
    }

    public int getTicketQuantity() {
        return ticketQuantity;
    }

    public void setTicketQuantity(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Date getDateTimeOfReservation() {
        return dateTimeOfReservation;
    }

    public void setDateTimeOfReservation(Date dateTimeOfReservation) {
        this.dateTimeOfReservation = dateTimeOfReservation;
    }

}
