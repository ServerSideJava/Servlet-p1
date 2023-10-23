package com.example.servletkuy1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if (cookie.getName().equals("username")){
                if(cookie.getValue() !=null){
                    request.setAttribute("username",cookie.getValue());
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/dashboard.jsp");
                    dispatcher.forward(request,response);
                }

            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
        dispatcher.forward(request,response);





    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String pass = request.getParameter("pass");
        Cookie userCookie = new Cookie("username",username);
        Cookie passCookie = new Cookie("pass",pass);
        response.addCookie(userCookie);
        response.addCookie(passCookie);





    }
}