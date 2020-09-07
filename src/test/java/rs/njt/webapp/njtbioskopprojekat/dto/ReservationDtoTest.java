/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.dto;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Negra
 */
public class ReservationDtoTest {
    
    public ReservationDtoTest() {
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

    /**
     * Test of getReservationId method, of class ReservationDto.
     */
    @Test
    public void testGetReservationId() {
        System.out.println("getReservationId");
        ReservationDto instance = new ReservationDto();
        Long expResult = null;
        Long result = instance.getReservationId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReservationId method, of class ReservationDto.
     */
    @Test
    public void testSetReservationId() {
        System.out.println("setReservationId");
        Long reservationId = null;
        ReservationDto instance = new ReservationDto();
        instance.setReservationId(reservationId);
    }

    /**
     * Test of getDateTimeOfReservation method, of class ReservationDto.
     */
    @Test
    public void testGetDateTimeOfReservation() {
        System.out.println("getDateTimeOfReservation");
        ReservationDto instance = new ReservationDto();
        Date expResult = null;
        Date result = instance.getDateTimeOfReservation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateTimeOfReservation method, of class ReservationDto.
     */
    @Test
    public void testSetDateTimeOfReservation() {
        System.out.println("setDateTimeOfReservation");
        Date dateTimeOfReservation = null;
        ReservationDto instance = new ReservationDto();
        instance.setDateTimeOfReservation(dateTimeOfReservation);
    }

    /**
     * Test of getTicketQuantity method, of class ReservationDto.
     */
    @Test
    public void testGetTicketQuantity() {
        System.out.println("getTicketQuantity");
        ReservationDto instance = new ReservationDto();
        int expResult = 0;
        int result = instance.getTicketQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTicketQuantity method, of class ReservationDto.
     */
    @Test
    public void testSetTicketQuantity() {
        System.out.println("setTicketQuantity");
        int ticketQuantity = 0;
        ReservationDto instance = new ReservationDto();
        instance.setTicketQuantity(ticketQuantity);
    }

    /**
     * Test of getProjection method, of class ReservationDto.
     */
    @Test
    public void testGetProjection() {
        System.out.println("getProjection");
        ReservationDto instance = new ReservationDto();
        ProjectionDto expResult = null;
        ProjectionDto result = instance.getProjection();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProjection method, of class ReservationDto.
     */
    @Test
    public void testSetProjection() {
        System.out.println("setProjection");
        ProjectionDto projection = null;
        ReservationDto instance = new ReservationDto();
        instance.setProjection(projection);
    }

    /**
     * Test of getUser method, of class ReservationDto.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        ReservationDto instance = new ReservationDto();
        UserDto expResult = null;
        UserDto result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser method, of class ReservationDto.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        UserDto user = null;
        ReservationDto instance = new ReservationDto();
        instance.setUser(user);
    }

    /**
     * Test of getStatus method, of class ReservationDto.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        ReservationDto instance = new ReservationDto();
        String expResult = null;
        String result = instance.getStatus();
        assertEquals(expResult, result);

    }

    /**
     * Test of setStatus method, of class ReservationDto.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        ReservationDto instance = new ReservationDto();
        instance.setStatus(status);
    }

    /**
     * Test of compareTo method, of class ReservationDto.
     */
    @Test (expected = java.lang.NullPointerException.class)
    public void testCompareTo() {
        System.out.println("compareTo");
        ReservationDto o = new ReservationDto();
        ReservationDto instance = new ReservationDto();   
        instance.compareTo(o);
    }
    
}
