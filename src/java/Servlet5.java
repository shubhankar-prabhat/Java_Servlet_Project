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
public class Servlet5 extends HttpServlet {

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
            out.println("<title>Servlet Servlet5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center> <h1 style=\"font-size: 50px; color: rgb(159,43,105)\"><b>SUMMARY OF THE GOLDEN GATE </b></h1> </center>");
            out.println("<h1>Renowned novelist and poet Vikram Seth published his first novel, The Golden Gate, in 1986. Taking inspiration from Alexander Pushkin’s classic nineteenth-century Russian saga in verse, Eugene Onegin, Seth transposed the characters and action of that work onto a modern California setting. Like Pushkin, Seth also composed in verse, structuring his own work using Pushkin’s extraordinarily complex meter and rhyme schemes. The Golden Gate is written in 590 Onegin stanzas – a special kind of sonnet (a fourteen-line poem) that uses iambic tetrameter (each line has four sets of stress-unstress syllable combinations). Within each sonnet, lines one, three, five, six, nine, and twelve add an extra unstressed syllable; lines with the added syllables create double feminine rhymes (rhymes that end on unstressed syllables, like “awful” and “jaw-full” or “whining” and “dining”), while lines without the added syllable create masculine rhymes (rhymes that end on stressed syllables like “behead” and “to bed”). The rhyme scheme is AbAbCCddEffEgg – the uppercase letters are the feminine rhymes and the lowercase the masculine ones. The entire book maintains this sonnet form; even Seth’s “Dedication,” “Acknowledgements,” “Contents,” and “About the Author” sections are written in verse.\n" +
                        "\n" +
                        "The novel contrasts its lofty epic style with the mostly everyday events it chronicles. Seth follows the lives of a group of successful yuppie friends in San Francisco in 1980. Their lives are financially stable, so the dramas and stresses they experience tend to be romantic, political, and philosophic in nature. Critics describe the novel as a love letter to the Northern California of this time, before the full ascension of Silicon Valley and the growing economic gap between the haves and have-nots in San Francisco itself.\n" +
                        "\n" +
                        "The novel opens on John Brown, a twenty-six-year-old computer engineer, who, well established in his growing field, now realizes that he would like to be in a relationship. When he complains about his loneliness to his friend and former girlfriend Janet Hayakawa, a sculptor and a drummer for a band called Liquid Sheep, she advises him to advertise in the classified section of the newspaper. John laughs off the idea, but Jan does it anyway, describing him in the Bay Guardian as a “Well-rounded and well-meaning square/ Lusting for love.”\n" +
                        "\n" +
                        "John gets many responses; the one that sticks out is from Liz Dorati, a trial lawyer who went to Stanford. John and Liz get together, their relationship, at first, amazing because they are extremely sexually compatible. They get an apartment, and at first, their only disagreements stem from John’s dislike of Liz’s cat, Charlemagne.\n" +
                        "\n" +
                        "We then encounter Liz’s brother Ed, who is in the middle of an existential crisis – he is both a staunch Catholic and a closeted gay man. He is living in a vicious cycle: having secret passionate sex with his lover, then feeling terrible self-hatred afterward for having committed a sin.\n" +
                        "\n" +
                        "We also meet John’s recently divorced friend Phil, who is raising his young son, Paul, as a single parent, since his wife decided to move back to the East Coast. Trying to find himself, Phil quits his solid job in order to join the movement protesting nuclear weapons. He spends his days at rallies, much to John’s confusion – why couldn’t Phil just do his protesting as a side hobby?\n" +
                        "\n" +
                        "Liz and John throw a party in their new apartment to celebrate their engagement. There, Phil meets Ed, and they end up in bed together. From there, their relationship grows into a romance. Meanwhile, Liz and John marry.\n" +
                        "\n" +
                        "The two couples discuss their various philosophies of life, united in a shared purpose of trying to find personal fulfillment through self-actualization. Soon, however, the honeymoon period of these relationships ends, as both couples face irreconcilable problems and difficulties.\n" +
                        "\n" +
                        "Phil realizes that Ed can never fully commit to their relationship because Ed can never fully overcome the self-hatred that he feels as a Christian. Over time, it becomes clear that Ed doesn’t even really want to try. The couple’s breakup becomes inevitable.\n" +
                        "\n" +
                        "Liz and John, meanwhile, find themselves arguing more and more over their radically different political views. John has left his IT job in order to work for a defense contractor, while Liz has grown increasingly involved with the same anti-nuclear movement that Phil has embraced. While Liz cannot wrap her mind around John’s ability to work for a government willing to develop such horrific weaponry, John falls victim to unfounded jealousy. Their marriage dissolves.\n" +
                        "\n" +
                        "Still, although these first relationships fall apart, the group of friends reshuffles into new couples that are much more destined for long-term happiness and success. Liz and Phil connect over their shared activism, eventually falling in love and getting married. Meanwhile, John confides about his marriage to Janet, and these old friends find themselves once again falling in love as they had when they were very young. John’s newfound happiness is palpable, but the novel resists giving him a happy ending. Instead, abruptly, Janet is killed in a car accident. A grieving John is invited by Phil and Liz to be their newborn son’s godfather.</h1>");
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
