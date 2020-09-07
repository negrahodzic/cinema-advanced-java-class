/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.dto;

import java.util.ArrayList;
import java.util.List;
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
public class UserDtoTest {
    
    public UserDtoTest() {
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
     * Test of getUserId method, of class UserDto.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        UserDto instance = new UserDto();
        Long expResult = null;
        Long result = instance.getUserId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserId method, of class UserDto.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        Long userId = null;
        UserDto instance = new UserDto();
        instance.setUserId(userId);
    }

    /**
     * Test of getFirstname method, of class UserDto.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        UserDto instance = new UserDto();
        String expResult = null;
        String result = instance.getFirstname();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstname method, of class UserDto.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "";
        UserDto instance = new UserDto();
        instance.setFirstname(firstname);
    }

    /**
     * Test of getLastname method, of class UserDto.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        UserDto instance = new UserDto();
        String expResult = null;
        String result = instance.getLastname();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastname method, of class UserDto.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "";
        UserDto instance = new UserDto();
        instance.setLastname(lastname);
    }

    /**
     * Test of getEmail method, of class UserDto.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        UserDto instance = new UserDto();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class UserDto.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        UserDto instance = new UserDto();
        instance.setEmail(email);
    }

    /**
     * Test of getUsername method, of class UserDto.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        UserDto instance = new UserDto();
        String expResult = null;
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class UserDto.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        UserDto instance = new UserDto();
        instance.setUsername(username);
    }

    /**
     * Test of getPassword method, of class UserDto.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        UserDto instance = new UserDto();
        String expResult = null;
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class UserDto.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        UserDto instance = new UserDto();
        instance.setPassword(password);
    }

    /**
     * Test of getReviews method, of class UserDto.
     */
    @Test
    public void testGetReviews() {
        System.out.println("getReviews");
        UserDto instance = new UserDto();
        List<ReviewDto> expResult = new ArrayList<>();
        List<ReviewDto> result = instance.getReviews();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReviews method, of class UserDto.
     */
    @Test
    public void testSetReviews() {
        System.out.println("setReviews");
        List<ReviewDto> reviews = null;
        UserDto instance = new UserDto();
        instance.setReviews(reviews);
    }
    
}
