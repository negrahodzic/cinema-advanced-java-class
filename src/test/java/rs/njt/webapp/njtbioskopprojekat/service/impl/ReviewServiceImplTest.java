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
import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;
import rs.njt.webapp.njtbioskopprojekat.service.ReviewService;
//import rs.njt.webapp.njtbioskopprojekat.entity.ReviewEntity;

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
public class ReviewServiceImplTest {

    @Autowired
    private ReviewService reviewService;

    public ReviewServiceImplTest() {
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

    @Test
    public void testGetAll() {
        assertEquals(reviewService.getAll().size(), 3);
    }

//    @Test(expected = java.lang.Exception.class)
//    public void saveAllNull() {
//        reviewService.saveAll(null);
//    }
    
    @Test(expected = java.lang.Exception.class)
    public void testSaveReviewMovieIdNull() {
        reviewService.saveReview(null, 5, "komentar test", new UserDto(1L, "", "", "", "", ""));
    }

    @Test(expected = java.lang.Exception.class)
    public void testSaveReviewUserNull() {
        reviewService.saveReview(3L, 5, "komentar test", null);
    }

    @Test
    public void testSaveReview() {
        reviewService.saveReview(4L, 5, "komentar test", new UserDto(1L, "", "", "", "", ""));
    }
}
