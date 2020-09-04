/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import rs.njt.webapp.njtbioskopprojekat.config.MyWebApplicationContextConfig;


/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 * 
 */
public class MyApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        System.out.println("====================== MyApplicationInitializer ===============================");
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(MyWebApplicationContextConfig.class);
        webApplicationContext.setServletContext(sc);
              
        //konfigurisati DispatcherServlet
        ServletRegistration.Dynamic dispatcherServlet = sc.addServlet("myDispatcherServlet", new DispatcherServlet(webApplicationContext));
        dispatcherServlet.addMapping("/");
        dispatcherServlet.setLoadOnStartup(1);



    }

}
