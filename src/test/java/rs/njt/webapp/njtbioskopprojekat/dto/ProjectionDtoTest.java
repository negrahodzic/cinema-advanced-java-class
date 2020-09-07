/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.dto;

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
public class ProjectionDtoTest {
    
    public ProjectionDtoTest() {
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
     * Test of getProjectionId method, of class ProjectionDto.
     */
    @Test
    public void testGetProjectionId() {
        System.out.println("getProjectionId");
        ProjectionDto instance = new ProjectionDto();
        Long expResult = null;
        Long result = instance.getProjectionId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProjectionId method, of class ProjectionDto.
     */
    @Test
    public void testSetProjectionId() {
        System.out.println("setProjectionId");
        Long projectionId = null;
        ProjectionDto instance = new ProjectionDto();
        instance.setProjectionId(projectionId);
    }

    /**
     * Test of getDateTimeOfProjection method, of class ProjectionDto.
     */
    @Test
    public void testGetDateTimeOfProjection() {
        System.out.println("getDateTimeOfProjection");
        ProjectionDto instance = new ProjectionDto();
        String expResult = null;
        String result = instance.getDateTimeOfProjection();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateTimeOfProjection method, of class ProjectionDto.
     */
    @Test
    public void testSetDateTimeOfProjection() {
        System.out.println("setDateTimeOfProjection");
        String dateTimeOfProjection = "";
        ProjectionDto instance = new ProjectionDto();
        instance.setDateTimeOfProjection(dateTimeOfProjection);
    }

    /**
     * Test of getTechnology method, of class ProjectionDto.
     */
    @Test
    public void testGetTechnology() {
        System.out.println("getTechnology");
        ProjectionDto instance = new ProjectionDto();
        String expResult = null;
        String result = instance.getTechnology();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTechnology method, of class ProjectionDto.
     */
    @Test
    public void testSetTechnology() {
        System.out.println("setTechnology");
        String technology = "";
        ProjectionDto instance = new ProjectionDto();
        instance.setTechnology(technology);
    }

    /**
     * Test of getEdited method, of class ProjectionDto.
     */
    @Test
    public void testGetEdited() {
        System.out.println("getEdited");
        ProjectionDto instance = new ProjectionDto();
        String expResult = null;
        String result = instance.getEdited();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEdited method, of class ProjectionDto.
     */
    @Test
    public void testSetEdited() {
        System.out.println("setEdited");
        String edited = "";
        ProjectionDto instance = new ProjectionDto();
        instance.setEdited(edited);
    }

    /**
     * Test of getRoom method, of class ProjectionDto.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        ProjectionDto instance = new ProjectionDto();
        RoomDto expResult = null;
        RoomDto result = instance.getRoom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRoom method, of class ProjectionDto.
     */
    @Test
    public void testSetRoom() {
        System.out.println("setRoom");
        RoomDto room = null;
        ProjectionDto instance = new ProjectionDto();
        instance.setRoom(room);
    }

    /**
     * Test of getMovie method, of class ProjectionDto.
     */
    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        ProjectionDto instance = new ProjectionDto();
        MovieDto expResult = null;
        MovieDto result = instance.getMovie();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMovie method, of class ProjectionDto.
     */
    @Test
    public void testSetMovie() {
        System.out.println("setMovie");
        MovieDto movie = null;
        ProjectionDto instance = new ProjectionDto();
        instance.setMovie(movie);
    }

    /**
     * Test of getFreeSeats method, of class ProjectionDto.
     */
    @Test
    public void testGetFreeSeats() {
        System.out.println("getFreeSeats");
        ProjectionDto instance = new ProjectionDto();
        int expResult = 0;
        int result = instance.getFreeSeats();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFreeSeats method, of class ProjectionDto.
     */
    @Test
    public void testSetFreeSeats() {
        System.out.println("setFreeSeats");
        int freeSeats = 0;
        ProjectionDto instance = new ProjectionDto();
        instance.setFreeSeats(freeSeats);
    }

}
