/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            RequestDispatcher rd;
            String s1=request.getParameter("s1");
            String s2=request.getParameter("s2");
            if(s1.equals("CHETANBHAGAT") && s2.equals("TWOSTATES"))
            {
                rd=request.getRequestDispatcher("Servlet2");
                rd.forward(request, response);
            }
            else if(s1.equals("CHETANBHAGAT") && s2.equals("FIVEPOINTSOMEONE"))
            {
                rd=request.getRequestDispatcher("Servlet3");
                rd.forward(request, response);
            }
            else if(s1.equals("VIKRAMSETH") && s2.equals("THESUITABLEBOY"))
            {
                rd=request.getRequestDispatcher("Servlet4");
                rd.forward(request, response);
            }
            else if(s1.equals("VIKRAMSETH") && s2.equals("THEGOLDENGATE"))
            {
                rd=request.getRequestDispatcher("Servlet5");
                rd.forward(request, response);
            }
            else
            {
                out.println("incorrect author and book name");
                rd=request.getRequestDispatcher("/index.html");
                rd.include(request,response);
            }
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
