/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Negra
 */
public class ReservationDto implements Serializable {

    private Long reservationId;
    private Date dateTimeOfReservation;
    private int ticketQuantity;
    private ProjectionDto projection;
    private UserDto user;

    public ReservationDto() {
    }

    public ReservationDto(Date dateTimeOfReservation, int ticketQuantity, ProjectionDto projection, UserDto user) {
        this.dateTimeOfReservation = dateTimeOfReservation;
        this.ticketQuantity = ticketQuantity;
        this.projection = projection;
        this.user = user;
    }

    public ReservationDto(Long reservationId, Date dateTimeOfReservation, int ticketQuantity, ProjectionDto projection, UserDto user) {
        this.reservationId = reservationId;
        this.dateTimeOfReservation = dateTimeOfReservation;
        this.ticketQuantity = ticketQuantity;
        this.projection = projection;
        this.user = user;
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

    public int getTicketQuantity() {
        return ticketQuantity;
    }

    public void setTicketQuantity(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }

    public ProjectionDto getProjection() {
        return projection;
    }

    public void setProjection(ProjectionDto projection) {
        this.projection = projection;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ReservationDto{" + "reservationId=" + reservationId + ", dateTimeOfReservation=" + dateTimeOfReservation + ", ticketQuantity=" + ticketQuantity + ", projection=" + projection + ", user=" + user + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.reservationId);
        hash = 97 * hash + Objects.hashCode(this.dateTimeOfReservation);
        hash = 97 * hash + this.ticketQuantity;
        hash = 97 * hash + Objects.hashCode(this.projection);
        hash = 97 * hash + Objects.hashCode(this.user);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ReservationDto other = (ReservationDto) obj;
        if (this.ticketQuantity != other.ticketQuantity) {
            return false;
        }
        if (!Objects.equals(this.reservationId, other.reservationId)) {
            return false;
        }
        if (!Objects.equals(this.dateTimeOfReservation, other.dateTimeOfReservation)) {
            return false;
        }
        if (!Objects.equals(this.projection, other.projection)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return true;
    }


}
