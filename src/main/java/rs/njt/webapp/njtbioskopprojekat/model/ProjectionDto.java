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
public class ProjectionDto implements Serializable {

    private Long projectionId;
    private Date dateTimeOfProjection;
    private String technology;
    private String edited; // Titlovano, Sihronizovano
    private RoomDto room;
    private MovieDto movie;

    public ProjectionDto() {
    }

    public ProjectionDto(Date dateTimeOfProjection, String technology, String edited, RoomDto room, MovieDto movie) {
        this.dateTimeOfProjection = dateTimeOfProjection;
        this.technology = technology;
        this.edited = edited;
        this.room = room;
        this.movie = movie;
    }

    public ProjectionDto(Long projectionId, Date dateTimeOfProjection, String technology, String edited, RoomDto room, MovieDto movie) {
        this.projectionId = projectionId;
        this.dateTimeOfProjection = dateTimeOfProjection;
        this.technology = technology;
        this.edited = edited;
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

    @Override
    public String toString() {
        return "ProjectionDto{" + "projectionId=" + projectionId + ", dateTimeOfProjection=" + dateTimeOfProjection + ", technology=" + technology + ", edited=" + edited + ", room=" + room + ", movie=" + movie + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.projectionId);
        hash = 41 * hash + Objects.hashCode(this.dateTimeOfProjection);
        hash = 41 * hash + Objects.hashCode(this.technology);
        hash = 41 * hash + Objects.hashCode(this.edited);
        hash = 41 * hash + Objects.hashCode(this.room);
        hash = 41 * hash + Objects.hashCode(this.movie);
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
        if (!Objects.equals(this.room, other.room)) {
            return false;
        }
        if (!Objects.equals(this.movie, other.movie)) {
            return false;
        }
        return true;
    }

  

}
