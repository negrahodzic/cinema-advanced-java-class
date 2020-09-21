/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import rs.njt.webapp.njtbioskopprojekat.config.TestBeanConfig;
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;
import rs.njt.webapp.njtbioskopprojekat.entity.ReservationEntity;
import rs.njt.webapp.njtbioskopprojekat.repository.ReservationRepository;
import rs.njt.webapp.njtbioskopprojekat.service.ProjectionService;
import rs.njt.webapp.njtbioskopprojekat.service.ReservationService;

/**
 *
 * @author Negra
 */
@Transactional
@DirtiesContext
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestBeanConfig.class})
public class ReservationServiceImplTest {

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private ReservationRepository reservationRepository;

    public ReservationServiceImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetAll() {
        assertEquals(reservationService.getAll().size(), 0); // promeni size kad lepo konektujes baze
    }

    @Test(expected = java.lang.Exception.class)
    public void testSaveReservationNull() {
        reservationService.saveReservation(null);
    }

    @Test(expected = java.lang.Exception.class)
    public void saveAllNull() {
        reservationService.saveAll(null);
    }

    @Test
    public void testGetByUserId() {
        assertTrue(4L == reservationService.getByUserId(new UserDto(4L, "", "", "", "", "")).get(0).getUser().getUserId());
    }

    @Test
    public void testGetByUserIdNoValue() {
        assertTrue(reservationService.getByUserId(new UserDto(20L, "", "", "", "", "")).isEmpty());
    }

    @Test(expected = java.lang.Exception.class)
    public void testGetByUserIdIdNull() {
        assertTrue(reservationService.getByUserId(null).isEmpty());
    }

    @Test
    public void testDelete() {
        reservationService.delete(1L);
        
        List<ReservationEntity> reservations = reservationRepository.findAll();
        boolean exists = false;
        
        for (ReservationEntity reservation : reservations) {
            if(reservation.getReservationId() == 1L) exists = true;
        }
        
        assertFalse(exists); 
    }
}



