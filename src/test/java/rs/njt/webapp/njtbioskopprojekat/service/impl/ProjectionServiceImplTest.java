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
import rs.njt.webapp.njtbioskopprojekat.service.ProjectionService;

/**
 *
 * @author Negra
 */
@Transactional
@DirtiesContext
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestBeanConfig.class})
public class ProjectionServiceImplTest {

    @Autowired
    private ProjectionService projectionService;

    public ProjectionServiceImplTest() {
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
     * Test of getAll method, of class ProjectionServiceImpl.
     */
    @Test
    public void testGetAll() {
        assertEquals(projectionService.getAll().size(), 14);
    }

    /**
     * Test of GetByMovieId method, of class ProjectionServiceImpl.
     */
    @Test
    public void testGetMovieById() {
        assertTrue(1L == projectionService.getByMovieId(1L).get(0).getMovie().getMovieId());
        assertTrue(2L == projectionService.getByMovieId(2L).get(0).getMovie().getMovieId());
    }

    /**
     * Test of GetByMovieId method, of class ProjectionServiceImpl when there is
     * no return value.
     */
    @Test
    public void testGetByMovieIdNoValue() {
        assertTrue(projectionService.getByMovieId(20L).isEmpty());
    }

    /**
     * Test of GetByMovieId method, of class ProjectionServiceImpl when
     * parameter id is null.
     */
    @Test
    public void testGetByMovieIdNull() {
        assertTrue(projectionService.getByMovieId(null).isEmpty());
    }

    /**
     * Test of GetById method, of class ProjectionServiceImpl.
     */
    @Test
    public void testGetById() {
        assertTrue(1L == projectionService.getById(1L).getProjectionId());
        assertTrue(2L == projectionService.getById(2L).getProjectionId());
    }

    /**
     * Test of GetById method, of class ProjectionServiceImpl when there is no
     * return value.
     */
    @Test(expected = java.lang.Exception.class)
    public void testGetByIdNoValue() {
        projectionService.getById(20L);
    }

    /**
     * Test of GetById method, of class ProjectionServiceImpl when parameter id
     * is null.
     */
    @Test(expected = java.lang.Exception.class)
    public void testGetByIdNull() {
        projectionService.getById(null);
    }

    @Test
    public void testSearchByTitleAndDateDateEmpty() {
        String title = projectionService.getById(1L).getMovie().getTitle();

        assertEquals(title, projectionService.searchByTitleAndDate("The Seven Samurai".toLowerCase(), "- Choose date -").get(0).getMovie().getTitle());
    }

    @Test
    public void testSearchByTitleAndDateTitleEmpty() {
        String title = projectionService.getById(1L).getMovie().getTitle();

        assertEquals(title, projectionService.searchByTitleAndDate("".toLowerCase(), "10-09-2020").get(0).getMovie().getTitle());
    }

    @Test
    public void testSearchByTitleAndDate() {
        String title = projectionService.getById(1L).getMovie().getTitle();

        assertEquals(title, projectionService.searchByTitleAndDate("The Seven Samurai".toLowerCase(), "10-09-2020").get(0).getMovie().getTitle());
    }

    @Test
    public void testGetDates() {
        assertEquals(projectionService.getDates().size(), 2);
    }

    @Test(expected = java.lang.Exception.class)
    public void testSaveProjectionNull() {
        projectionService.saveProjection(null);
    }

    @Test(expected = java.lang.Exception.class)
    public void saveAllNull() {
        projectionService.saveAll(null);
    }

}