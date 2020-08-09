/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import rs.njt.webapp.njtbioskopprojekat.config.MyWebApplicationContextConfig;

/**
 *
 * @author remmi
 */
public class MyApplicationInitializer implements WebApplicationInitializer{
    
//    private List<Movie> createMovies() {
//        return new ArrayList<Movie>() {
//            {
//                add(new Movie("Godfather", "This is godfather movie.", 160, "Crime"));
//                add(new Movie("Joker", "This is Joker movie.", 122, "Triller"));
//                add(new Movie("Parasit", "This is Parasit movie.", 132, "Comedy"));
//                add(new Movie("Godfather", "This is godfather movie.", 160, "Crime"));
//                add(new Movie("Joker", "This is Joker movie.", 122, "Triller"));
//                add(new Movie("Parasit", "This is Parasit movie.", 132, "Comedy"));
//            }
//
//        };
//    }
//    private List<Projection> createProjections() {
//        return new ArrayList<Projection>() {
//            {
//                add(new Projection(new Date(2020, 8, 10, 18, 30), "3D", "titlovano"));
//                add(new Projection(new Date(2020, 8, 10, 18, 30), "3D", "sihronizovano"));
//                add(new Projection(new Date(2020, 8, 10, 18, 30), "3D", "/"));
//                add(new Projection(new Date(2020, 8, 10, 18, 30), "3D", "titlovano"));
//                add(new Projection(new Date(2020, 8, 10, 18, 30), "3D", "sihronizovano"));
//                add(new Projection(new Date(2020, 8, 10, 18, 30), "3D", "/"));
//
//            }
//
//        };
//    }
    
    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        System.out.println("====================== MyApplicationInitializer ===============================");
        AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(MyWebApplicationContextConfig.class);
        webApplicationContext.setServletContext(sc);
        
        //konfigurisati DispatcherServlet
        ServletRegistration.Dynamic dispatcherServlet = sc.addServlet("myDispatcherServlet", new DispatcherServlet(webApplicationContext));
        dispatcherServlet.addMapping("/");
        dispatcherServlet.setLoadOnStartup(1);
        
//        List<Movie> listMovies = createMovies();
//        sc.setAttribute("movies", listMovies);
//        
//        List<Projection> listProjections = createProjections();
//        sc.setAttribute("projections", listProjections);
        
    }
    
}
