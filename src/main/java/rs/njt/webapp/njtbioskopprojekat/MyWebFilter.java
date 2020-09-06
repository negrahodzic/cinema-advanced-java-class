/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

/**
 *
 * @author Negra Hodžić 221/16 & Marko Cvijović 168/16
 */
@Component
@WebFilter( urlPatterns = {"/myReservations/*",
                            "/editProfile/*", "/logout/*"})
public class MyWebFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        if (req.getSession().getAttribute("loggedUser") == null) {
            req.getSession().setAttribute("message", "You must login first!");
            req.getRequestDispatcher("/").forward(request, response);
        } else {
            req.getSession().setAttribute("message", "");
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
    }
    
}
