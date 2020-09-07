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
public class GenreDtoTest {
    
    GenreDto genre;
    
    public GenreDtoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        genre = new GenreDto();
    }
    
    @After
    public void tearDown() {
        genre = null;
    }

    /**
     * Test of getId method, of class GenreDto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Long expResult = null;
        Long result = genre.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class GenreDto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        genre.setId(id);
    }

    /**
     * Test of getGenreName method, of class GenreDto.
     */
    @Test
    public void testGetGenreName() {
        System.out.println("getGenreName");
        String expResult = null;
        String result = genre.getGenreName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenreName method, of class GenreDto.
     */
    @Test
    public void testSetGenreName() {
        System.out.println("setGenreName");
        String genreName = "";
        genre.setGenreName(genreName);
    }
    
}
