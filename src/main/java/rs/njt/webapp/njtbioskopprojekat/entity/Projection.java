/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Negra
 */
@Entity
public class Projection implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectionId;
    private Date dateTimeOfProjection;
    private String technology;
    private String edited; // Titlovano, Sihronizovano
    @Column(name = "MOVIE_ID")
    private Long movieId;
    @OneToMany
    @JoinColumn(name = "PROJECTION_ID")
    private List<Reservation> reservations;
    @Column(name = "ROOM_ID")
    private Long roomId;

    public Projection() {
    }

    public Projection(Long projectionId, Date dateTimeOfProjection, String technology, String edited) {
        this.projectionId = projectionId;
        this.dateTimeOfProjection = dateTimeOfProjection;
        this.technology = technology;
        this.edited = edited;
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
}
