/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.service.impl;

import java.util.ArrayList;
import java.util.List;
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
import org.springframework.test.context.web.WebAppConfiguration;
import rs.njt.webapp.njtbioskopprojekat.config.DatabaseConfiguration;
import rs.njt.webapp.njtbioskopprojekat.config.TestBeanConfig;
import rs.njt.webapp.njtbioskopprojekat.converter.GenreConverter;
import rs.njt.webapp.njtbioskopprojekat.dto.GenreDto;
import rs.njt.webapp.njtbioskopprojekat.entity.GenreEntity;
import rs.njt.webapp.njtbioskopprojekat.repository.GenreRepository;
import rs.njt.webapp.njtbioskopprojekat.service.GenreService;

/**
 *
 * @author Negra
 */
@Transactional
@DirtiesContext

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestBeanConfig.class})
public class GenreServiceImplTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private GenreService genreService;

    @Autowired
    private GenreRepository genreRepository;

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
        System.out.println("testGetAll()");
        
        GenreEntity g1 = new GenreEntity(1L, "Fantazy");
        GenreEntity g2 = new GenreEntity(2L, "Comedy");
        GenreEntity g3 = new GenreEntity(3L, "Crime");
        genreRepository.saveAndFlush(g1);
        genreRepository.saveAndFlush(g2);
        genreRepository.saveAndFlush(g3);
        
        List<GenreDto> genres = new ArrayList<>();
        genres.add(GenreConverter.convertFromEntityToDto(g1));
        genres.add(GenreConverter.convertFromEntityToDto(g2));
        genres.add(GenreConverter.convertFromEntityToDto(g3));
        
        assertEquals(genreService.getAll().size(), genres.size());
    }

}
