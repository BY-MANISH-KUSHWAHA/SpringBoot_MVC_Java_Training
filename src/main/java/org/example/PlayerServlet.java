package org.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        String webview = "<html>\n" +
                "<head>\n"+
                "<title>Player</title/>\n"+
                "</head>\n"+
                "<body  style=\"background-color:powderblue;\">\n"+
                "<h1>Welcome to Player Application</h1>\n"+
                "<h2>Welcome to Player Application</h2>\n"+
                "<h3>Welcome to Player Application</h3>\n"+
                "<h4>Welcome to Player Application</h4>\n"+
                "<h5>Welcome to Player Application</h5>\n"+
                "<h6>Welcome to Player Application</h6>\n"+
                "</body>\n"+
                "</html>";
        writer.println(webview);
//        writer.println("<html>");
//        writer.println("<head>" +
//                        "<title>Player</title/>"+
//                "</head>");
//        writer.println("<body>"+
//                "<h1>Welcome to Player Application1</h1>"+
//                "</body>");
//        writer.println("</html>");
    }

}
