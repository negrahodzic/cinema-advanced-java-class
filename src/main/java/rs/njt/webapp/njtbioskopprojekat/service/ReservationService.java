/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service;

import java.util.List;
import rs.njt.webapp.njtbioskopprojekat.model.ReservationDto;
import rs.njt.webapp.njtbioskopprojekat.model.UserDto;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
public interface ReservationService {

    List<ReservationDto> getAll();

    public void delete(Long reservationId);

    public void saveReservation(ReservationDto reservation);

    public List<ReservationDto> getByUserId(UserDto user);
}
