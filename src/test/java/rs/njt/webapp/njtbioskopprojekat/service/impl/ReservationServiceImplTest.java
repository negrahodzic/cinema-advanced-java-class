/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import rs.njt.webapp.njtbioskopprojekat.config.MyWebApplicationContextConfig;
import rs.njt.webapp.njtbioskopprojekat.converter.ReservationConverter;
import rs.njt.webapp.njtbioskopprojekat.dto.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.dto.MovieDto;
import rs.njt.webapp.njtbioskopprojekat.dto.ProjectionDto;
import rs.njt.webapp.njtbioskopprojekat.dto.ReservationDto;
import rs.njt.webapp.njtbioskopprojekat.dto.RoomDto;
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;
import rs.njt.webapp.njtbioskopprojekat.entity.GenreEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.MovieEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ProjectionEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.ReservationEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.RoomEntity;
import rs.njt.webapp.njtbioskopprojekat.entity.UserEntity;
import rs.njt.webapp.njtbioskopprojekat.repository.ReservationRepository;
import rs.njt.webapp.njtbioskopprojekat.service.ReservationService;

/**
 *
 * @author Negra
 */
@Transactional
@DirtiesContext
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyWebApplicationContextConfig.class})
@TestPropertySource("classpath:/prop/persistance-njt-test.properties")
public class ReservationServiceImplTest {

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private ReservationRepository reservationRepository;

    ReservationDto rd;
    ReservationEntity re;
    MovieDto md;
    ProjectionDto pd;
    UserDto ud;

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
        rd = new ReservationDto();
        re = new ReservationEntity();
        md = new MovieDto("m", "m", 100, "m", new GenreDto("genre x"));
        pd = new ProjectionDto(1L, "10-10-2020 18:30", "3D", "subtitle", 20, new RoomDto(20, "nova soba"), md);
        ud = new UserDto(1L, "", "", "", "", "");

    }

    @After
    public void tearDown() {
        rd = null;
        re = null;
        md = null;
        pd = null;
        ud = null;
    }

    @Test
    public void testGetAll() {
        assertEquals(reservationService.getAll().size(), 1);
    }

    @Test(expected = java.lang.Exception.class)
    public void testSaveReservationNull() {
        reservationService.saveReservation(null);
    }

    @Test(expected = java.lang.Exception.class)
    public void testSaveReservationProjectionNull() {
        rd.setDateTimeOfReservation(new Date());
        rd.setStatus("active");
        rd.setTicketQuantity(1);
        rd.setProjection(null);
        rd.setUser(ud);

        reservationService.saveReservation(rd);
    }

    @Test(expected = java.lang.Exception.class)
    public void testSaveReservationUserNull() {
        rd.setDateTimeOfReservation(new Date());
        rd.setStatus("active");
        rd.setTicketQuantity(1);
        rd.setProjection(pd);
        rd.setUser(null);
        reservationService.saveReservation(rd);
    }

    @Test
    public void testSaveReservation() {
        rd.setDateTimeOfReservation(new Date());
        rd.setStatus("active");
        rd.setTicketQuantity(1);
        rd.setProjection(pd);
        rd.setUser(ud);
        
        reservationService.saveReservation(rd);
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
        reservationRepository.saveAndFlush(new ReservationEntity(2L, new Date(), 5,
                new ProjectionEntity(1L, new Date(2020, 11, 10, 18, 30), "3D", "Subtitle", 30, new RoomEntity(3L, 30, "Max4K"), new MovieEntity(1L, "The Seven Samurai", "One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin. His room, a proper human room although a little too small, lay peacefully between its four familiar walls.", 90, "book", new GenreEntity(1L, "Fantazy"))),
                new UserEntity(2L, "N", "H", "n@gmail.com", "n", "n")));

        reservationService.delete(2L);

        List<ReservationEntity> reservations = reservationRepository.findAll();
        boolean exists = false;

        for (ReservationEntity reservation : reservations) {
            if (reservation.getReservationId() == 2L) {
                exists = true;
            }
        }

        assertFalse(exists);
    }

    @Test(expected = java.lang.Exception.class)
    public void testDeleteNoValue() {
        reservationService.delete(3L);
    }

    @Test(expected = java.lang.Exception.class)
    public void testDeleteNull() {
        reservationService.delete(null);
    }

    @Test(expected = java.lang.Exception.class)
    public void saveAllNull() {
        reservationService.saveAll(null);
    }
}
