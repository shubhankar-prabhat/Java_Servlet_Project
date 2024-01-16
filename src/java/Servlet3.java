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
 * @author SP
 */
public class Servlet3 extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center> <h1 style=\"font-size: 50px; color: rgb(159,43,105)\"><b>SUMMARY OF FIVE POINT SOMEONE </b></h1> </center>");
            out.println("<h1>It is the story of 3 IIT students. It is clearly the storyline of how they ruined their life in the first 5 semesters and how they finally made into corporate jobs (or what they like) after realization.\n" +
                        "\n" +
                        "Ryan, wise and brilliant, pragmatical-science minded, who hate mug up study and IIT education system as well. Hari, who has no idea what to do in his life, always follows or tries to imitate to be Ryan. And, Alok — came from a poor & traditional family, who worked hard to get into IIT, wants a good corporate job after graduation to support his family and sick father.\n" +
                        "\n" +
                        "\n" +
                        "The story goes as usual. They bunk classes, go to movies on Ryan scooter which is a gift from his parents (even though he hated his rich-parents, he used to get gifts). They eat at the same restaurants (as we all graduates do), they drink alcohol and smoke in rooms. They always try to do things differently as every other Indian engineering student does in their first and second semesters.\n" +
                        "\n" +
                        "They get fewer marks, for an obvious reason. Alok blames Ryan for his ideas (movies, spending time outside). These three people split up and Alok(6+GPA) goes to Venkat(9+GPA) room. Another interesting character, Venkat, who is always-9+ point GPA, always mug up everything, almost every line of academic books(I don’t know, how people read academic books).\n" +
                        "\n" +
                        "On the other hand, Ryan and Hari don’t care about their semester grades. Now, the author introduces a love story of Hari. He fell in love with Neha, who is daughter of HOD of the department, Cherian. This love story mixes up with emotional content such as Neha’s brother died of an accident. They connected each other with every-second-Saturday call. 2 years passed, Alok increases 1 grade and the other two are held there on 5gpa ship, hovering between 5 and 5.5. They are always five-point something.\n" +
                        "\n" +
                        "In the third year, one day, Venkat refuses to help Alok while his father is sick. Ryan helps him. So they three united. They used to attend their favorite professor classes, Prof.Veera, who is young and practical-minded. In their third year course, Cherian teaches the subject. Hari wants to impress him as his love-life depended on him but fails miserably by caught-up drunk red-handed.\n" +
                        "\n" +
                        "Now comes, their biggest mistake, trying to steal question papers of semester exams as there is no way to get good marks quickly. They caught up to security guards. Then, the issue goes to the inter-disciplinary committee. Prof-Veera helps them there, but the committee decides to extend their one year. They were short of a few credits to attend an interview in the last year.\n" +
                        "\n" +
                        "Meanwhile, professor Cherian got to know that his son died of not due to an accident but suicide. Neha's brother did suicide because he can’t make it into IIT. He felt ashamed as a HOD son. Now, Cherian feels ashamed of. He turned into a somewhat good person than he was.\n" +
                        "\n" +
                        "Even though they punished with the one-semester ban, Ryan scooter-lubricants-mix project saves them. Cherian agreed to give credentials to their project. They finally made their engineering degree. Alok, Hari got one corporate job. Ryan didn’t like a corporate job, he settles at Prof. Veera as a research associate on his lubricants project.\n" +
                        "\n" +
                        "Chetan Bhagat, as you know, one of the topmost Indian authors, who love to write contemporary fiction. When I say contemporary fiction, he is really having such a witty style, intentionally kept confusing words, the romance between lovers and all. This is the my first book of Chetan. I should appreciate him for his witty style and metaphoric language. He uses metaphors like “red face like riped tomato”, “Petrified like chicken butcher shop”..etc. This book turned to film that “3-idiots”, one of the best movies in the Bollywood industry. I expected the story because I watched 3-idiots before reading this book. But, the book plot is somewhat different. As I am not being judgemental, I don’t want to give rating to this book. It is a must-read book to who wants to read Chetan Bhagat books.\n" +
                        "\n" +
                        "One thing is he left the story unconvinced for me by keeping untold about Ryan's father, Alok family. That is very well covered in 3-idiots.</h1>");
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
