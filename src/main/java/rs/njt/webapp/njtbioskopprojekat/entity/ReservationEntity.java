/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Negra
 */
@Entity
@Table(name = "RESERVATION")
public class ReservationEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESERVATION_ID")
    private Long reservationId;
    private Date dateTimeOfReservation;
    private int ticketQuantity;

    @ManyToOne(fetch = FetchType.EAGER) // Note: U nasem slucaju, rezervacija ima samo jednu projekciju
    @JoinColumn(name = "PROJECTION_ID", referencedColumnName = "PROJECTION_ID")
    private ProjectionEntity projection;
    
    @ManyToOne(fetch = FetchType.EAGER) // Note: U nasem slucaju, rezervacija ima samo jednog korisnika
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    private UserEntity user;

    public ReservationEntity() {
    }

    public ReservationEntity(Long reservationId, Date dateTimeOfReservation, int ticketQuantity, ProjectionEntity projection, UserEntity user) {
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

    public ProjectionEntity getProjection() {
        return projection;
    }

    public void setProjection(ProjectionEntity projection) {
        this.projection = projection;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ReservationEntity{" + "reservationId=" + reservationId + ", dateTimeOfReservation=" + dateTimeOfReservation + ", ticketQuantity=" + ticketQuantity + ", projection=" + projection + ", user=" + user + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.reservationId);
        hash = 53 * hash + Objects.hashCode(this.dateTimeOfReservation);
        hash = 53 * hash + this.ticketQuantity;
        hash = 53 * hash + Objects.hashCode(this.projection);
        hash = 53 * hash + Objects.hashCode(this.user);
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
        final ReservationEntity other = (ReservationEntity) obj;
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
