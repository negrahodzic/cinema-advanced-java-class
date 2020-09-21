/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
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
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Entity
@Table(name = "PROJECTION")
public class ProjectionEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROJECTION_ID")
    private Long projectionId;
    private Date dateTimeOfProjection;
    private String technology;
    private String edited; // Titlovano, Sihronizovano
    private int freeSeats;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH) // Note: U nasem slucaju, projekcija ima samo jednu salu
    @JoinColumn(name = "ROOM_ID", referencedColumnName = "ROOM_ID")
    private RoomEntity room;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH) // Note: U nasem slucaju, projekcija ima samo jedan film
    @JoinColumn(name = "MOVIE_ID", referencedColumnName = "MOVIE_ID")
    private MovieEntity movie;
    
    public ProjectionEntity() {

    }

    public ProjectionEntity(Long projectionId, Date dateTimeOfProjection, String technology, String edited, int freeSeats,RoomEntity room, MovieEntity movie) {
        this.projectionId = projectionId;
        this.dateTimeOfProjection = dateTimeOfProjection;
        this.technology = technology;
        this.edited = edited;
        this.freeSeats = freeSeats;
        this.room = room;
        this.movie = movie;
    }

    public Long getProjectionId() {
        return projectionId;
    }

    public void setProjectionId(Long projectionId) {
        this.projectionId = projectionId;
    }

    public Date getDateTimeOfProjection() {
        return dateTimeOfProjection;
    }

    public void setDateTimeOfProjection(Date dateTimeOfProjection) {
        this.dateTimeOfProjection = dateTimeOfProjection;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }
    
    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }
    
    public RoomEntity getRoom() {
        return room;
    }

    public void setRoom(RoomEntity room) {
        this.room = room;
    }

    public MovieEntity getMovie() {
        return movie;
    }

    public void setMovie(MovieEntity movie) {
        this.movie = movie;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.projectionId);
        hash = 83 * hash + Objects.hashCode(this.dateTimeOfProjection);
        hash = 83 * hash + Objects.hashCode(this.technology);
        hash = 83 * hash + Objects.hashCode(this.edited);
        hash = 83 * hash + this.freeSeats;
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
        final ProjectionEntity other = (ProjectionEntity) obj;
        if (this.freeSeats != other.freeSeats) {
            return false;
        }
        if (!Objects.equals(this.technology, other.technology)) {
            return false;
        }
        if (!Objects.equals(this.edited, other.edited)) {
            return false;
        }
        if (!Objects.equals(this.projectionId, other.projectionId)) {
            return false;
        }
        if (!Objects.equals(this.dateTimeOfProjection, other.dateTimeOfProjection)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProjectionEntity{" + "projectionId=" + projectionId + ", dateTimeOfProjection=" + dateTimeOfProjection + ", technology=" + technology + ", edited=" + edited + ", freeSeats=" + freeSeats + '}';
    }

}
