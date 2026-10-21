package ro.ulbs.ingprog.lab3;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", value = "/CounterServlet")
public class CounterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        Integer counterGet = (Integer)
                request.getSession().getAttribute("CounterGetName");
        if (counterGet == null) {
            counterGet = 0;
        }
        String increment = request.getParameter("inc");
        if (increment != null) {
            counterGet ++;
        }
        request.getSession().setAttribute("CounterGetName", counterGet);
        status(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer counterPost = (Integer)
                request.getSession().getAttribute("CounterPostName");
        if (counterPost == null) {
            counterPost = 0;
        }
        String increment = request.getParameter("inc");
        if (increment != null) {
            counterPost ++;
        }
        request.getSession().setAttribute("CounterPostName", counterPost);
        status(request, response);
    }


    private void status(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h2>Welcome to Counter Servlet</h2>");

        Integer counterGet = (Integer)
                request.getSession().getAttribute("CounterGetName");
        printWriter.println("<br> Counter for GET: " + counterGet);
        Integer counterPost = (Integer)
                request.getSession().getAttribute("CounterPostName");
        printWriter.println("<br> Counter for POST: " + counterPost);
    }




}