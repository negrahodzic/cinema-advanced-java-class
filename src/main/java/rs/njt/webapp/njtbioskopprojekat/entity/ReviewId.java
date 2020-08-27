/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Negra
 */
@Embeddable
public class ReviewId implements Serializable {
    
    @Column(name = "movie_MOVIE_ID")
    private Long movieId;
 
    @Column(name = "user_USER_ID")
    private Long userId;
 
    private ReviewId() {
    
    }

    public ReviewId(Long movieId, Long userId) {
        this.movieId = movieId;
        this.userId = userId;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(movieId, userId);
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
// 
//        if (o == null || getClass() != o.getClass())
//            return false;
// 
//        ReviewId that = (ReviewId) o;
//        return Objects.equals(movieId, that.movieId) &&
//               Objects.equals(userId, that.userId);
//    }

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
        final ReviewId other = (ReviewId) obj;
        if (!Objects.equals(this.movieId, other.movieId)) {
            return false;
        }
        if (!Objects.equals(this.userId, other.userId)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.movieId);
        hash = 71 * hash + Objects.hashCode(this.userId);
        return hash;
    }

    
}
