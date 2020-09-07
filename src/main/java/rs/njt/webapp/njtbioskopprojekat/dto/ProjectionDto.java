/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class represents movie projection with attributes:
 * <ul>
 * <li>id</li>
 * <li>dateTimeOfProjection</li>
 * <li>technology</li>
 * <li>edited</li>
 * <li>freeSeats</li>
 * <li>room</li>
 * <li>movie</li>
 * </ul>
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public class ProjectionDto implements Serializable {

    /**
     * projection id
     */
    private Long projectionId;
    /**
     * projection date and time
     */
    private String dateTimeOfProjection;
    /**
     * projection technology
     */
    private String technology;
    /**
     * projection edited
     */
    private String edited;
    /**
     * projection free seats
     */
    private int freeSeats;
    /**
     * projection room
     */
    private RoomDto room;
    /**
     * projection movie
     */
    private MovieDto movie;

    /**
     * Constructor without parameters
     */
    public ProjectionDto() {
    }

    /**
     * Constructor with parameters
     *
     * @param dateTimeOfProjection projection date and time
     * @param technology projection technology
     * @param edited projection edited
     * @param freeSeats projection free seats
     * @param room projection room
     * @param movie projection movie
     */
    public ProjectionDto(String dateTimeOfProjection, String technology, String edited, int freeSeats, RoomDto room, MovieDto movie) {
        this.dateTimeOfProjection = dateTimeOfProjection;
        this.technology = technology;
        this.edited = edited;
        this.freeSeats = freeSeats;
        this.room = room;
        this.movie = movie;
    }

    /**
     * Constructor with parameters
     *
     * @param projectionId projection id
     * @param dateTimeOfProjection projection date and time
     * @param technology projection technology
     * @param edited projection edited
     * @param freeSeats projection free seats
     * @param room projection room
     * @param movie projection movie
     */
    public ProjectionDto(Long projectionId, String dateTimeOfProjection, String technology, String edited, int freeSeats, RoomDto room, MovieDto movie) {
        this.projectionId = projectionId;
        this.dateTimeOfProjection = dateTimeOfProjection;
        this.technology = technology;
        this.edited = edited;
        this.freeSeats = freeSeats;
        this.room = room;
        this.movie = movie;
    }

    /**
     * Returns id of projection.
     *
     * @return projection id
     */
    public Long getProjectionId() {
        return projectionId;
    }
    
    /**
     * Sets id of projection.
     *
     * @param projectionId New value of projection id
     */
    public void setProjectionId(Long projectionId) {
        this.projectionId = projectionId;
    }

    /**
     * Returns date and time of projection.
     *
     * @return projection date and time
     */
    public String getDateTimeOfProjection() {
        return dateTimeOfProjection;
    }

    /**
     * Sets date and time of projection.
     *
     * @param dateTimeOfProjection New value of projection date and time
     */
    public void setDateTimeOfProjection(String dateTimeOfProjection) {
        this.dateTimeOfProjection = dateTimeOfProjection;
    }

    /**
     * Returns technology of projection.
     *
     * @return projection technology
     */
    public String getTechnology() {
        return technology;
    }

    /**
     * Sets technology of projection.
     *
     * @param technology New value of projection technology
     */
    public void setTechnology(String technology) {
        this.technology = technology;
    }

    /**
     * Returns edited of projection.
     *
     * @return projection edited
     */
    public String getEdited() {
        return edited;
    }

    /**
     * Sets edited of projection.
     *
     * @param edited New value of projection edited
     */
    public void setEdited(String edited) {
        this.edited = edited;
    }

    /**
     * Returns room of projection.
     *
     * @return projection room
     */
    public RoomDto getRoom() {
        return room;
    }

    /**
     * Sets room of projection.
     *
     * @param room New value of projection room
     */
    public void setRoom(RoomDto room) {
        this.room = room;
    }

    /**
     * Returns movie of projection.
     *
     * @return projection movie
     */
    public MovieDto getMovie() {
        return movie;
    }

    /**
     * Sets movie of projection.
     *
     * @param movie New value of projection movie
     */
    public void setMovie(MovieDto movie) {
        this.movie = movie;
    }

    /**
     * Returns free seats of projection.
     *
     * @return projection free seats
     */
    public int getFreeSeats() {
        return freeSeats;
    }

    /**
     * Sets free seats of projection.
     *
     * @param freeSeats New value of projection  free seats
     */
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
