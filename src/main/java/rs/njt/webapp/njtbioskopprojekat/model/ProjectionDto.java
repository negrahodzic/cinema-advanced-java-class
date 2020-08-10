/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Negra
 */
public class ProjectionDto implements Serializable {

    private Long projectionId;
    private Date dateTimeOfProjection;
    private String technology;
    private String edited; // Titlovano, Sihronizovano
//    private List<Reservation> reservations;

    public ProjectionDto() {
    }

    public ProjectionDto(Long projectionId, Date dateTimeOfProjection, String technology, String edited) {
        this.projectionId = projectionId;
        this.dateTimeOfProjection = dateTimeOfProjection;
        this.technology = technology;
        this.edited = edited;
    }

}
