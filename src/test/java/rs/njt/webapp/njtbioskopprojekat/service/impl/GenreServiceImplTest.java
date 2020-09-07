/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import rs.njt.webapp.njtbioskopprojekat.config.DatabaseConfiguration;
import rs.njt.webapp.njtbioskopprojekat.entity.GenreEntity;
import rs.njt.webapp.njtbioskopprojekat.repository.GenreRepository;
import rs.njt.webapp.njtbioskopprojekat.service.GenreService;

/**
 *
 * @author Negra
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DatabaseConfiguration.class}, loader = AnnotationConfigContextLoader.class)
@Transactional
@DirtiesContext
public class GenreServiceImplTest {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Autowired
    private GenreService fooService;

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
        System.out.println("rs.njt.webapp.njtbioskopprojekat.service.impl.GenreServiceImplTest.testGetAll()");
//        GenreEntity student = new GenreEntity(1L, "Fantazy");
//        genreRepository.save(student);
//
//        GenreEntity student2 = genreRepository.findById(1L).get();
//        assertEquals("name incorrect", student.getGenreName(), student2.getGenreName());

    }

}
