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
import rs.njt.webapp.njtbioskopprojekat.entity.ReservationEntity;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {    
    
    @Query(value = "SELECT r FROM ReservationEntity r WHERE r.user.userId = ?1")
    public List<ReservationEntity> findByUserId(Long userId);

}
