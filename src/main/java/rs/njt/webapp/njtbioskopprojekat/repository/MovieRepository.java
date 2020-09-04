/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {

    
}
