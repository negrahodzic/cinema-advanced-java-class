/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.dto;

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
public class MovieDtoTest {
    
    public MovieDtoTest() {
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
     * Test of getMovieId method, of class MovieDto.
     */
    @Test
    public void testGetMovieId() {
        System.out.println("getMovieId");
        MovieDto instance = new MovieDto();
        Long expResult = null;
        Long result = instance.getMovieId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMovieId method, of class MovieDto.
     */
    @Test
    public void testSetMovieId() {
        System.out.println("setMovieId");
        Long movieId = null;
        MovieDto instance = new MovieDto();
        instance.setMovieId(movieId);
    }

    /**
     * Test of getTitle method, of class MovieDto.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        MovieDto instance = new MovieDto();
        String expResult = null;
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class MovieDto.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        MovieDto instance = new MovieDto();
        instance.setTitle(title);
    }

    /**
     * Test of getDescription method, of class MovieDto.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        MovieDto instance = new MovieDto();
        String expResult = null;
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescription method, of class MovieDto.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        MovieDto instance = new MovieDto();
        instance.setDescription(description);
    }

    /**
     * Test of getDuration method, of class MovieDto.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        MovieDto instance = new MovieDto();
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDuration method, of class MovieDto.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        int duration = 0;
        MovieDto instance = new MovieDto();
        instance.setDuration(duration);
    }

    /**
     * Test of getGenre method, of class MovieDto.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        MovieDto instance = new MovieDto();
        GenreDto expResult = null;
        GenreDto result = instance.getGenre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenre method, of class MovieDto.
     */
    @Test
    public void testSetGenre() {
        System.out.println("setGenre");
        GenreDto genre = null;
        MovieDto instance = new MovieDto();
        instance.setGenre(genre);
    }

    /**
     * Test of getReviews method, of class MovieDto.
     */
    @Test
    public void testGetReviews() {
        System.out.println("getReviews");
        MovieDto instance = new MovieDto();
        List<ReviewDto> expResult = null;
        List<ReviewDto> result = instance.getReviews();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReviews method, of class MovieDto.
     */
    @Test
    public void testSetReviews() {
        System.out.println("setReviews");
        List<ReviewDto> reviews = null;
        MovieDto instance = new MovieDto();
        instance.setReviews(reviews);
    }

    /**
     * Test of getImage method, of class MovieDto.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        MovieDto instance = new MovieDto();
        String expResult = null;
        String result = instance.getImage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setImage method, of class MovieDto.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        String image = null;
        MovieDto instance = new MovieDto();
        instance.setImage(image);
    }
    
}
