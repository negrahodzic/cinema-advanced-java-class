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
 * Class represents projection reservation with attributes:
 * <ul>
 * <li>id</li>
 * <li>dateTimeOfReservation</li>
 * <li>status</li>
 * <li>ticketQuantity</li>
 * <li>projection</li>
 * <li>user</li>
 * </ul>
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class ReservationDto implements Serializable, Comparable<ReservationDto> {

    /**
     * reservation id
     */
    private Long reservationId;
    /**
     * reservation date and time
     */
    private Date dateTimeOfReservation;
    /**
     * reservation status
     */
    private String status;
    /**
     * reservation ticket quantity
     */
    private int ticketQuantity;
    /**
     * reservation projection
     */
    private ProjectionDto projection;
    /**
     * reservation user
     */
    private UserDto user;

    /**
     * Constructor without parameters
     */
    public ReservationDto() {
    }

    /**
     * Constructor with parameters
     *
     * @param dateTimeOfReservation reservation date and time
     * @param ticketQuantity reservation ticket quantity
     * @param status reservation status
     * @param projection reservation projection
     * @param user reservation user
     */
    public ReservationDto(Date dateTimeOfReservation, int ticketQuantity, String status, ProjectionDto projection, UserDto user) {
        this.dateTimeOfReservation = dateTimeOfReservation;
        this.ticketQuantity = ticketQuantity;
        this.status = status;
        this.projection = projection;
        this.user = user;
    }

    /**
     * Constructor with parameters
     *
     * @param reservationId reservation id
     * @param dateTimeOfReservation reservation date and time
     * @param ticketQuantity reservation ticket quantity
     * @param status reservation status
     * @param projection reservation projection
     * @param user reservation user
     */
    public ReservationDto(Long reservationId, Date dateTimeOfReservation, int ticketQuantity, String status, ProjectionDto projection, UserDto user) {
        this.reservationId = reservationId;
        this.dateTimeOfReservation = dateTimeOfReservation;
        this.ticketQuantity = ticketQuantity;
        this.status = status;
        this.projection = projection;
        this.user = user;
    }

    /**
     * Returns id of reservation.
     *
     * @return reservation id
     */
    public Long getReservationId() {
        return reservationId;
    }

    /**
     * Sets id of reservation.
     *
     * @param reservationId New value of reservation id
     */
    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * Returns date and time of reservation.
     *
     * @return reservation date and time
     */
    public Date getDateTimeOfReservation() {
        return dateTimeOfReservation;
    }

    /**
     * Sets date and time of reservation.
     *
     * @param dateTimeOfReservation  New value of reservation date and time
     */
    public void setDateTimeOfReservation(Date dateTimeOfReservation) {
        this.dateTimeOfReservation = dateTimeOfReservation;
    }

    /**
     * Returns ticket quantity of reservation.
     *
     * @return reservation ticket quantity
     */
    public int getTicketQuantity() {
        return ticketQuantity;
    }

    /**
     * Sets ticket quantity of reservation.
     *
     * @param ticketQuantity  New value of reservation ticket quantity
     */
    public void setTicketQuantity(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }

    /**
     * Returns projection of reservation.
     *
     * @return reservation projection
     */
    public ProjectionDto getProjection() {
        return projection;
    }

    /**
     * Sets projection of reservation.
     *
     * @param projection  New value of reservation projection
     */
    public void setProjection(ProjectionDto projection) {
        this.projection = projection;
    }

    /**
     * Returns user of reservation.
     *
     * @return reservation user
     */
    public UserDto getUser() {
        return user;
    }

    /**
     * Sets user of reservation.
     *
     * @param user New value of reservation user
     */
    public void setUser(UserDto user) {
        this.user = user;
    }

    /**
     * Returns status of reservation.
     *
     * @return reservation status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status of reservation.
     *
     * @param status New value of reservation status
     */
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
    public int compareTo(ReservationDto o) {
        try {
            return DateConverter.convertStringToDate(o.getProjection().getDateTimeOfProjection()).compareTo(DateConverter.convertStringToDate(projection.getDateTimeOfProjection()));

        } catch (ParseException ex) {
            Logger.getLogger(ReservationDto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;

    }
}
