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
public class ReviewDtoTest {
    
    public ReviewDtoTest() {
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
     * Test of getReviewId method, of class ReviewDto.
     */
    @Test
    public void testGetReviewId() {
        System.out.println("getReviewId");
        ReviewDto instance = new ReviewDto();
        Long expResult = null;
        Long result = instance.getReviewId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReviewId method, of class ReviewDto.
     */
    @Test
    public void testSetReviewId() {
        System.out.println("setReviewId");
        Long reviewId = null;
        ReviewDto instance = new ReviewDto();
        instance.setReviewId(reviewId);
    }

    /**
     * Test of getGrade method, of class ReviewDto.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        ReviewDto instance = new ReviewDto();
        int expResult = 0;
        int result = instance.getGrade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGrade method, of class ReviewDto.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        int grade = 0;
        ReviewDto instance = new ReviewDto();
        instance.setGrade(grade);
    }

    /**
     * Test of getComment method, of class ReviewDto.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        ReviewDto instance = new ReviewDto();
        String expResult = null;
        String result = instance.getComment();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComment method, of class ReviewDto.
     */
    @Test
    public void testSetComment() {
        System.out.println("setComment");
        String comment = "";
        ReviewDto instance = new ReviewDto();
        instance.setComment(comment);
    }

    /**
     * Test of getMovie method, of class ReviewDto.
     */
    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        ReviewDto instance = new ReviewDto();
        MovieDto expResult = null;
        MovieDto result = instance.getMovie();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMovie method, of class ReviewDto.
     */
    @Test
    public void testSetMovie() {
        System.out.println("setMovie");
        MovieDto movie = null;
        ReviewDto instance = new ReviewDto();
        instance.setMovie(movie);
    }

    /**
     * Test of getUser method, of class ReviewDto.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        ReviewDto instance = new ReviewDto();
        UserDto expResult = null;
        UserDto result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUser method, of class ReviewDto.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        UserDto user = null;
        ReviewDto instance = new ReviewDto();
        instance.setUser(user);
    }
    
}
