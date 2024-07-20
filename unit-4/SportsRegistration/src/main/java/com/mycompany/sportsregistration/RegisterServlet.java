package com.mycompany.sportsregistration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String sports = request.getParameter("sports");
        String gender = request.getParameter("gender");

        // Generate a unique registration ID
        String regId = UUID.randomUUID().toString();

        // Set attributes to forward to success page
        request.setAttribute("name", name);
        request.setAttribute("sports", sports);
        request.setAttribute("gender", gender);
        request.setAttribute("regId", regId);

        // Forward to success page
        request.getRequestDispatcher("success.jsp").forward(request, response);
    }
}
