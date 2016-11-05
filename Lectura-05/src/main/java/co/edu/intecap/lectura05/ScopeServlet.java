/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lectura05;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author INTECAP1
 */
@WebServlet(name = "ScopeServlet", urlPatterns = {"*.do"})
public class ScopeServlet extends HttpServlet {

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
        
        Integer visitas = (Integer)getServletContext().getAttribute("VisitasAtr");
        
        if(visitas == null) {
            visitas = new Integer(0);
        }
        
        visitas ++;
        
        getServletContext().setAttribute("VisitasAtr", visitas);
        request.getSession().setAttribute("ValueAtr", request);
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            out.println("<h1>Esto es lo que tienen en el vaul</h1>");
            request.getSession().getAttribute("ValueAtr");
            out.println("<h1>Eres la visita numero: "+visitas+"</h1>");
            out.println("<h1>Tu session es: "+request.getSession().getId() +"</h1>");
            out.println("<form method=\"GET\" action=\"Cristian.do\">");
            out.println("<div style=\"border-radius: 5px;border:1px solid black; width: 30vw;text-align: center;margin: auto; margin-top: 100px;padding: 0 0 20px 0;box-shadow: 5px,5px,5px,5px;\">");
            out.println("<h1>Hola, cual es tu nombre?</h1>");
            out.println("<input type=\"text\" name=\"Nombre\" /><br/><br/>");
            out.println("<input type=\"submit\" value=\"Guardar\" name=\"BtnGuardar\" />");
            out.println("</div>");
            out.println("</form>");        
            
            
            
            
            
          
            out.println("</body>");
            out.println("</html>");
        }
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

}
