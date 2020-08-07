/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.listener;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import rs.njt.webapp.njtbioskopprojekat.model.Movie;

/**
 * Web application lifecycle listener.
 *
 * @author Negra
 */
public class MyApplicationContextListener implements ServletContextListener {
        public MyApplicationContextListener() {
        System.out.println("=========================================");
        System.out.println("=======MyApplicationContextListener======");
        System.out.println("=========================================");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
                System.out.println("=========================================");
        System.out.println("============contextInitialized===========");
        System.out.println("=========================================");
        
        sce.getServletContext().setAttribute("movies", createMovies());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private List<Movie> createMovies() {
        return new ArrayList<Movie>() {
            {
                add(new Movie("Godfather", "This is godfather movie.", 160, "Crime"));
                add(new Movie("Joker", "This is Joker movie.", 122, "Triller"));
                add(new Movie("Parasit", "This is Parasit movie.", 132, "Comedy"));
            }

        };
    }
}
