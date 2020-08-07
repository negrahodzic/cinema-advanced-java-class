/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Negra
 */
public class Projection {
    private Date dateOfProjection;
    private String technology;
    private String subtitle;

    public Projection(Date dateOfProjection, String technology, String subtitle) {
        this.dateOfProjection = dateOfProjection;
        this.technology = technology;
        this.subtitle = subtitle;
    }

    public Date getDateOfProjection() {
        return dateOfProjection;
    }

    public void setDateOfProjection(Date dateOfProjection) {
        this.dateOfProjection = dateOfProjection;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public String toString() {
        return "Projection{" + "dateOfProjection=" + dateOfProjection + ", technology=" + technology + ", subtitle=" + subtitle + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.dateOfProjection);
        hash = 17 * hash + Objects.hashCode(this.technology);
        hash = 17 * hash + Objects.hashCode(this.subtitle);
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
        final Projection other = (Projection) obj;
        if (!Objects.equals(this.dateOfProjection, other.dateOfProjection)) {
            return false;
        }
        return true;
    }

   
    
    
}
