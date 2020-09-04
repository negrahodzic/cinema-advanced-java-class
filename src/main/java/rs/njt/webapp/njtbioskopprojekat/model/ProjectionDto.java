/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class ProjectionDto implements Serializable {

    private Long projectionId;
    private String dateTimeOfProjection;
    private String technology;
    private String edited; // Titlovano, Sihronizovano
    private int freeSeats;
    private RoomDto room;
    private MovieDto movie;

    public ProjectionDto() {
    }

    public ProjectionDto(String dateTimeOfProjection, String technology, String edited, int freeSeats, RoomDto room, MovieDto movie) {
        this.dateTimeOfProjection = dateTimeOfProjection;
        this.technology = technology;
        this.edited = edited;
        this.freeSeats = freeSeats;
        this.room = room;
        this.movie = movie;
    }

    public ProjectionDto(Long projectionId, String dateTimeOfProjection, String technology, String edited, int freeSeats, RoomDto room, MovieDto movie) {
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

    public String getDateTimeOfProjection() {
        return dateTimeOfProjection;
    }

    public void setDateTimeOfProjection(String dateTimeOfProjection) {
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

    public RoomDto getRoom() {
        return room;
    }

    public void setRoom(RoomDto room) {
        this.room = room;
    }

    public MovieDto getMovie() {
        return movie;
    }

    public void setMovie(MovieDto movie) {
        this.movie = movie;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.projectionId);
        hash = 23 * hash + Objects.hashCode(this.dateTimeOfProjection);
        hash = 23 * hash + Objects.hashCode(this.technology);
        hash = 23 * hash + Objects.hashCode(this.edited);
        hash = 23 * hash + this.freeSeats;
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
        final ProjectionDto other = (ProjectionDto) obj;
        if (this.freeSeats != other.freeSeats) {
            return false;
        }
        if (!Objects.equals(this.dateTimeOfProjection, other.dateTimeOfProjection)) {
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
        return true;
    }

    @Override
    public String toString() {
        return "ProjectionDto{" + "projectionId=" + projectionId + ", dateTimeOfProjection=" + dateTimeOfProjection + ", technology=" + technology + ", edited=" + edited + ", freeSeats=" + freeSeats + '}';
    }

  

}
