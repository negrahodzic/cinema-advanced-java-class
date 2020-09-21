/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import javax.transaction.Transactional;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
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
import rs.njt.webapp.njtbioskopprojekat.service.MovieService;

/**
 *
 * @author Negra
 */
@Transactional
@DirtiesContext
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestBeanConfig.class})
public class MovieServiceImplTest {

    @Autowired
    private MovieService movieService;

    public MovieServiceImplTest() {
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
     * Test of getAll method, of class MovieServiceImpl.
     */
    @Test
    public void testGetAll() {
        assertEquals(movieService.getAll().size(), 12);
    }

    /**
     * Test of GetById method, of class MovieServiceImpl.
     */
    @Test
    public void testGetById() {
        assertEquals("The Seven Samurai", movieService.getById(1L).getTitle());
        assertEquals("Bonnie and Clyde", movieService.getById(2L).getTitle());
    }

    /**
     * Test of GetById method, of class MovieServiceImpl.
     */
    @Test(expected = java.lang.Exception.class)
    public void testGetByIdNoValue() {
        movieService.getById(20L);
    }

    /**
     * Test of GetById method, of class MovieServiceImpl.
     */
    @Test(expected = java.lang.Exception.class)
    public void testGetByIdNull() {
        movieService.getById(null);
    }

    /**
     * Test of SearchByTitleAndGenre method, of class MovieServiceImpl when
     * parameter genre is empty.
     */
    @Test
    public void testsearchByTitleAndGenreGenreEmpty() {
        String title = movieService.getById(1L).getTitle();

        assertEquals(title, movieService.searchByTitleAndGenre("The Seven Samurai".toLowerCase(), "- Choose genre -").get(0).getTitle());
    }

    /**
     * Test of SearchByTitleAndGenre method, of class MovieServiceImpl when
     * parameter title is empty.
     */
    @Test
    public void testsearchByTitleAndGenreTitleEmpty() {
        String title = movieService.getById(1L).getTitle();

        assertEquals(title, movieService.searchByTitleAndGenre("".toLowerCase(), "Fantazy").get(0).getTitle());
    }

    /**
     * Test of SearchByTitleAndGenre method, of class MovieServiceImpl.
     */
    @Test
    public void testsearchByTitleAndGenre() {
        String title = movieService.getById(1L).getTitle();

        assertEquals(title, movieService.searchByTitleAndGenre("The Seven Samurai".toLowerCase(), "Fantazy").get(0).getTitle());
    }

    /**
     * Test of saveAll method, of class MovieServiceImpl when parameter list is
     * null.
     */
    @Test(expected = java.lang.Exception.class)
    public void saveAllNull() {
        movieService.saveAll(null);
    }
}
