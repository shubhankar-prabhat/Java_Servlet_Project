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
public class Servlet4 extends HttpServlet {

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
            out.println("<title>Servlet Servlet4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center> <h1 style=\"font-size: 50px; color: rgb(159,43,105)\"><b>THE SUITABLE BOY </b></h1> </center>");
            out.println("<h1>A Suitable Boy (1993) is a novel by Indian author and Stanford economist Vikram Seth. Over 1,400 pages in length, it is a family saga. Critics praised A Suitable Boy for its probing, panoramic look into India’s cultural norms, as well as its combination of satire and romance. Seth received an exceedingly rare 1.1-million-dollar advance for the novel, a fact that caused a sensation in the Indian press. The novel took more than a decade to complete. Due to its length, social scrutiny, and realistic style, A Suitable Boy is often compared to George Eliot’s Middlemarch (1871).\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "A Suitable Boy's themes include the political in the personal, prejudice and forgiveness, conflict amidst social groups and families, changing racial norms, unexpected violence, and inter-generational connectedness. The novel is set in the early 1950s. This was an eventful period for India, as the country won full independence from England in 1947 and resolved several massive Hindu-Muslim conflicts that resulted in the new country of Pakistan being established.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Set in Brahmpur, India (a fictional town), A Suitable Boy concerns the fortunes and trials of four elite families over the course of 18 months: the Mehras, the Kapoors, the Chatterjis and the Khans (the last being the only Muslim family of the group). It especially focuses on the plight of 19-year-old Lata Mehra, a talented student at the local Brahmpur University. Throughout the saga, Lata must decide if she is willing to marry the young Muslim man (Kabir Durrani) she loves, and thus defy (and possibly ostracize herself from) her stern, wealthy Hindu mother, Mrs. Rupa Mehra. While arranged marriages have been the norm across India for dozens of generations, in the more secular and tolerant society led by Jawaharlal Nehru (the first Prime Minister of India), Lata is starting to feel that she can choose for herself who her husband should be.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Lata recently saw her sister, Savita, marry an up-and-coming professor at the local university. His name is Pran Kapoor, and Rupa Mehra blessed the marriage only because Pran comes from a well-respected and wealthy family. Privately, Lata questions whether the two will ever be truly happy, as they were forced into a marriage without ever getting to know one another. She knows that Kabir, the Muslim man she loves, isn’t \"a suitable boy\" according to her mother, and that the two will never be allowed to wed; still, she can’t stop feeling a great passion for Kabir. He is incredibly handsome and kind, and he has inherited great intelligence from his father, who is a highly accomplished (if socially graceless) mathematician at the university. Better still, Kabir is also a star on the university cricket team. Lata's older brother, Arun, is married to Meenakshi, the daughter of a prosperous Muslim family, but Lata is all too aware that she is not afforded the same privileges as a man; for a woman to choose to marry across religious lines is unprecedented.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "One day, one of Rupa’s spies reports to her that Kabir and Lata have been walking around Brahmpur University in public. Rupa is scandalized at this news—if word got out that her daughter consorted with Muslims, no prominent Hindu family would want to talk with her. To keep Lata away from Kabir, Rupa hastily plans a trip to Calcutta, which is hundreds of miles southeast of Brahmpur.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "In Calcutta, Rupa Mehra sets her daughter up with various Hindu boys whom she deems worthy of their caste. But all of the boys Lata's mother digs up are absolute duds. One has been so conditioned by British imperialism that he refers to his hometown of Kanpur with an English accent. Another has such tiny eyes and such bad table manners that Lata hardly considers him to be a civilized human. Not all of them are awful. Amit Chatterji, a well-known poet and writer, gets along well with the worldly and cultured Lata but is probably gay. However, Amit's father is a prominent judge and his mother a polished socialite. Lata is also set up with Haresh, a Hindu man who really likes her and whom she deems to be tolerable but slightly boring. He owns a thriving shoe company.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "In the background of Lata’s marital decision is the foreground for the rest of the world: politics. There is great controversy throughout the country when a Mosque is to be built near a Hindu holy site. After several riots, the project is abandoned. Various family members are also caught up in different political happenings, including the movement for equal rights for “untouchables,” country-wide protests for academic freedom, and the ending of the Zamindar system (a system that favored Indian aristocrats). Within the Kapoor family, the main conflict is that the youngest son, Maan Kapoor, has fallen in love with an infamous prostitute named Saeeda Bai.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "As the saga concludes, Lata Mehra finally makes her decision: she will not marry Kabir. Instead, she marries another “suitable boy”—someone who is good enough, but not someone she’s in love with: Haresh.</h1>");
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
