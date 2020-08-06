/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.frontcontroller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Negra
 */
@WebServlet("/app/*")
public class FrontController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        


        String pathInfo = request.getPathInfo();
        String page = "landing.jsp";

        if (pathInfo.equals("/register")) {
            page = register(request);
        }
        if (pathInfo.equals("/home")) {
            page = home(request);
        }
        if (pathInfo.equals("/searchMovies")) {
            page = searchMovies(request);
        }
        if (pathInfo.equals("/searchProjections")) {
            page = searchProjections(request);
        }
        if (pathInfo.equals("/createReservation")) {
            page = createReservation(request);
        }
        if (pathInfo.equals("/myReservations")) {
            page = myReservations(request);
        }
        if (pathInfo.equals("/reviews")) {
            page = reviews(request);
        }
        if (pathInfo.equals("/editProfile")) {
            page = editProfile(request);
        }
        if (pathInfo.equals("/logout")) {
            page = logout(request);
        }

        request.getRequestDispatcher(page).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String register(HttpServletRequest request) {
        return "/WEB-INF/pages/register.jsp";
    }
    private String home(HttpServletRequest request) {
        return "/WEB-INF/pages/home.jsp";
    }
    private String searchMovies(HttpServletRequest request) {
        return "/WEB-INF/pages/searchMovies.jsp";
    }
    private String searchProjections(HttpServletRequest request) {
        return "/WEB-INF/pages/searchProjections.jsp";
    }
    private String createReservation(HttpServletRequest request) {
        return "/WEB-INF/pages/createReservation.jsp";
    }
    private String myReservations(HttpServletRequest request) {
        return "/WEB-INF/pages/myReservations.jsp";
    }
    private String reviews(HttpServletRequest request) {
        return "/WEB-INF/pages/reviews.jsp";
    }
    private String editProfile(HttpServletRequest request) {
        return "/WEB-INF/pages/editProfile.jsp";
    }
    private String logout(HttpServletRequest request) {
        return "/WEB-INF/pages/logout.jsp";
    }

}
