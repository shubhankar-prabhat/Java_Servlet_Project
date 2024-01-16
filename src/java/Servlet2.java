/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shubh
 */
public class Servlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center> <h1 style=\"font-size: 50px; color: rgb(159,43,105)\"><b>SUMMARY OF TWO STATES </b></h1> </center>");
            out.println("<h1>2 States: The Story of My Marriage is autobiographical with only names changed. The story is about a couple Krish and Ananya, who hail from two states of India, Punjab and Tamil Nadu, respectively, who are deeply in love and want to marry. It is narrated from a first-person point of view in a humorous tone, often taking digs at both Tamil and Punjabi cultures.\n" +
                            "\n" +
                            "The story begins in the IIM Ahmedabad mess hall where Krish, a Punjabi boy from Delhi sights a beautiful girl Ananya, a Tamilian from Chennai quarreling with the mess staff about the food. Ananya was tagged as the \"Best girl of the fresher batch\". They become friends within a few days. Both graduate and get jobs with serious plans for their wedding. At first, Krish tries to convince his girlfriend Ananya's parents by helping Ananya's brother Manju IIT tuition and by helping her father Swaminathan create his first PowerPoint presentation. He later convinces her mom by helping her fulfill her biggest dream of singing at a concert by arranging for her to perform at the concert organised by Krish's employer City Bank.\n" +
                            "\n" +
                            "With Ananya's parents convinced, the couple then has to convince Krish's mother. But they run into problems as Krish's mother's relatives don't quite like the relationship and do not want Krish to marry a Tamilian. They are won over after Ananya intervenes to help one of Krish's cousins get married. Now as they have convinced both their parents, they decide to make a trip to Goa to give their parents an opportunity to get to know each other. But this too ends badly as Ananya's parents have a fallout with Krish's mother after which they leave, deciding that the families can never get along. Krish returns home and becomes a depressed workaholic.\n" +
                            "\n" +
                            "Throughout the story, Krish was not on good terms with his father and doesn't share a close bond with him. But finally, it is revealed that Krish's father travels to Chennai to meet Ananya's parents and successfully convinces them by spending a day with them. Thus, father and son are reconciled and the novel ends with Ananya giving birth to twin boys. Krish says that the babies belong to a state called 'India', with a thought to end inequality.</h1>");
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
