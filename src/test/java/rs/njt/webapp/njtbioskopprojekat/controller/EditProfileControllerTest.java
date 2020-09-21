///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package rs.njt.webapp.njtbioskopprojekat.controller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.web.servlet.ModelAndView;
//import rs.njt.webapp.njtbioskopprojekat.config.TestBeanConfig;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultMatcher;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
//import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//import rs.njt.webapp.njtbioskopprojekat.dto.UserDto;
//
///**
// *
// * @author Negra
// */
//@WebAppConfiguration
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {TestBeanConfig.class})
//public class EditProfileControllerTest {
//
//    @Autowired
//    private EditProfileController controller;
//
//    private MockMvc mockMvc;
//
//    @Autowired
//    private WebApplicationContext wac;
//
//    @Before
//    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//        DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
//        this.mockMvc = builder.build();
//    }
//
//    @Test
//    public void editProfile() {
//        ModelAndView mav = controller.editProfile();
//        Assert.assertEquals("editProfile", mav.getViewName());
//    }
//
//    @Test
//    public void saveChanges() throws Exception {
//        ResultMatcher ok =  MockMvcResultMatchers.status().isOk();
//        ResultMatcher registerView = MockMvcResultMatchers.view()
//                                                          .name("editProfile");
//        ResultMatcher doneView = MockMvcResultMatchers.view()
//                                                      .name("editProfile");
//
//        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/editProfile");
//        this.mockMvc.perform(builder).andExpect(ok).andExpect(registerView);
//
//        builder = MockMvcRequestBuilders.post("/editProfile/save")
//                                        .param("firstname", "Negra")
//                                        .param("lastname", "Hodzic")
//                                        .param("email", "negra.hodzicgmail.com")
//                                        .param("username", "negra")
//                                        .param("password", "n")
//                                        .sessionAttr("loggedUser", new UserDto(1L, "", "", "", "", ""));
//        this.mockMvc.perform(builder)
//                    .andExpect(ok)
//                    .andExpect(doneView);
//    }
//
//}
