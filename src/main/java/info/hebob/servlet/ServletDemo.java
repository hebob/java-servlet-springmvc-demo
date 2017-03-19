package info.hebob.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Henkka on 19.3.2017.
 */
public class ServletDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // set access control to any
        resp.setHeader("Access-Control-Allow-Origin", "*");

        //write response text
        //resp.getWriter().write(String.format("We had a GET request!, servlet's spirit animal is %s!",getServletConfig().getInitParameter("spiritAnimal")));

        //write response HTML
        resp.getWriter().write(String.format("<h1>We had a GET request!, servlet's spirit animal is %s!</h1>",getServletConfig().getInitParameter("spiritAnimal")));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // set access control to any
        resp.setHeader("Access-Control-Allow-Origin", "*");

        //write response text
        resp.getWriter().write(String.format("We had a POST request!, servlet's spirit animal is %s!",getServletConfig().getInitParameter("spiritAnimal")));

        //write response HTML
        //resp.getWriter().write(String.format("<h1>We had a GET request!, servlet's spirit animal is %s!</h1>",getServletConfig().getInitParameter("spiritAnimal")));

    }
}
