/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.njt.webapp.njtbioskopprojekat.entity.Reservation;
import rs.njt.webapp.njtbioskopprojekat.repository.ReservationRepository;
import rs.njt.webapp.njtbioskopprojekat.service.ReservationService;

/**
 *
 * @author Negra
 */
@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public List<Reservation> getAll() {
        return reservationRepository.getAll();
    }

    @Override
    public Reservation getById(Long id) {
        return reservationRepository.getById(id);
    }

}
