/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Entity
@Table(name = "GENRE")
public class GenreEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GENRE_ID")
    private Long genreId;
    private String genreName;

    public GenreEntity() {
    }

    public GenreEntity(Long genreId, String genreName) {
        this.genreId = genreId;
        this.genreName = genreName;
    }

    public GenreEntity(String genreName) {
        this.genreName = genreName;
    }

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String toString() {
        return "GenreEntity{" + "genreId=" + genreId + ", genreName=" + genreName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.genreId);
        hash = 23 * hash + Objects.hashCode(this.genreName);
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
        final GenreEntity other = (GenreEntity) obj;
        if (!Objects.equals(this.genreName, other.genreName)) {
            return false;
        }
        if (!Objects.equals(this.genreId, other.genreId)) {
            return false;
        }
        return true;
    }

}
