package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet {
    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

        String playerName = request.getParameter("name");
        System.out.println(playerName);
        request.setAttribute("jspPlayerName",playerName);


        request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request,response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            String playerName = request.getParameter("name");
            System.out.println(playerName);
            request.setAttribute("jspPlayerName",playerName);
            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request,response);


        //        PrintWriter writer = response.getWriter();
//        String webview = "<html>\n" +
//                "<head>\n"+
//                "<title>Player</title/>\n"+
//                "</head>\n"+
//                "<body  style=\"background-color:powderblue;\">\n"+
//                "<h1>Welcome to Player Application</h1>\n"+
//                "<h2>Welcome to Player Application</h2>\n"+
//                "<h3>Welcome to Player Application</h3>\n"+
//                "<h4>Welcome to Player Application</h4>\n"+
//                "<h5>Welcome to Player Application</h5>\n"+
//                "<h6>Welcome to Player Application</h6>\n"+
//                "</body>\n"+
//                "</html>";
//        writer.println(webview);
    }

}
