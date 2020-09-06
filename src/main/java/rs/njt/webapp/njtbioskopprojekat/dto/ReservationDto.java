/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.dto;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import rs.njt.webapp.njtbioskopprojekat.converter.DateConverter;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class ReservationDto implements Serializable, Comparable<ReservationDto> {

    private Long reservationId;
    private Date dateTimeOfReservation;
    private String status;
    private int ticketQuantity;
    private ProjectionDto projection;
    private UserDto user;

    public ReservationDto() {
    }

    public ReservationDto(Date dateTimeOfReservation, int ticketQuantity, String status, ProjectionDto projection, UserDto user) {
        this.dateTimeOfReservation = dateTimeOfReservation;
        this.ticketQuantity = ticketQuantity;
        this.status = status;
        this.projection = projection;
        this.user = user;
    }

    public ReservationDto(Long reservationId, Date dateTimeOfReservation, int ticketQuantity, String status, ProjectionDto projection, UserDto user) {
        this.reservationId = reservationId;
        this.dateTimeOfReservation = dateTimeOfReservation;
        this.ticketQuantity = ticketQuantity;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ReservationDto{" + "reservationId=" + reservationId + ", dateTimeOfReservation=" + dateTimeOfReservation + ", status=" + status + ", ticketQuantity=" + ticketQuantity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.reservationId);
        hash = 41 * hash + Objects.hashCode(this.dateTimeOfReservation);
        hash = 41 * hash + Objects.hashCode(this.status);
        hash = 41 * hash + this.ticketQuantity;
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
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.reservationId, other.reservationId)) {
            return false;
        }
        if (!Objects.equals(this.dateTimeOfReservation, other.dateTimeOfReservation)) {
            return false;
        }
        return true;
    }



    @Override
    public int compareTo(ReservationDto o){
        try {
            return DateConverter.convertStringToDate(o.getProjection().getDateTimeOfProjection()).compareTo(DateConverter.convertStringToDate(projection.getDateTimeOfProjection()));

        } catch (ParseException ex) {
            Logger.getLogger(ReservationDto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;

    }
}
