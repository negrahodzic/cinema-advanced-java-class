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
public class RoomDtoTest {
    
    public RoomDtoTest() {
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
     * Test of getRoomId method, of class RoomDto.
     */
    @Test
    public void testGetRoomId() {
        System.out.println("getRoomId");
        RoomDto instance = new RoomDto();
        Long expResult = null;
        Long result = instance.getRoomId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRoomId method, of class RoomDto.
     */
    @Test
    public void testSetRoomId() {
        System.out.println("setRoomId");
        Long roomId = null;
        RoomDto instance = new RoomDto();
        instance.setRoomId(roomId);
    }

    /**
     * Test of getCapacity method, of class RoomDto.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        RoomDto instance = new RoomDto();
        int expResult = 0;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacity method, of class RoomDto.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 0;
        RoomDto instance = new RoomDto();
        instance.setCapacity(capacity);
    }

    /**
     * Test of getRoomName method, of class RoomDto.
     */
    @Test
    public void testGetRoomName() {
        System.out.println("getRoomName");
        RoomDto instance = new RoomDto();
        String expResult = null;
        String result = instance.getRoomName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRoomName method, of class RoomDto.
     */
    @Test
    public void testSetRoomName() {
        System.out.println("setRoomName");
        String roomName = "";
        RoomDto instance = new RoomDto();
        instance.setRoomName(roomName);
    }
    
}
