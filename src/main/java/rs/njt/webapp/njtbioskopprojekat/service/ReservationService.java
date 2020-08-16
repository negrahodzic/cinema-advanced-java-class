/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service;

import java.util.List;
import rs.njt.webapp.njtbioskopprojekat.model.ReservationDto;

/**
 *
 * @author Negra
 */
public interface ReservationService {

    List<ReservationDto> getAll();

//    ReservationEntity getById(Long id);
}
