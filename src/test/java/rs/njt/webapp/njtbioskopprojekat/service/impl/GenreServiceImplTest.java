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
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import rs.njt.webapp.njtbioskopprojekat.config.MyWebApplicationContextConfig;
import rs.njt.webapp.njtbioskopprojekat.service.GenreService;

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
public class GenreServiceImplTest {

    @Autowired
    private GenreService genreService;

    public GenreServiceImplTest() {
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
     * Test of getAll method, of class GenreServiceImpl.
     */
    @Test
    public void testGetAll() {
        assertEquals(genreService.getAll().size(), 6);
    }

    /**
     * Test of saveAll method, of class GenreServiceImpl when parameter list is
     * null.
     */
    @Test(expected = java.lang.Exception.class)
    public void saveAllNull() {
        genreService.saveAll(null);
    }

}
  