/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rs.njt.webapp.njtbioskopprojekat.entity.ProjectionEntity;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Repository
public interface ProjectionRepository extends JpaRepository<ProjectionEntity, Long> {     
    @Query(value = "SELECT p FROM ProjectionEntity p WHERE p.movie.movieId = ?1")
    public List<ProjectionEntity> findByMovieId(Long movieId);

}
