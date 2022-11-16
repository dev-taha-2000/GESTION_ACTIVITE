package com.pdaProjet.Controller;

import com.pdaProjet.Service.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet {
    private UserService auth;
    @Override
    public void init() {
        auth = new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("hello taha !!!");

        String name = request.getParameter("name");
        out.println("hello "+name);
        //out.println("hello "+name);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           PrintWriter out = response.getWriter();
          String email = request.getParameter("email");
          String password = request.getParameter("password");
          out.println(email+" "+password);

        System.out.println(auth.login(email, password));
        if (auth.login(email, password) == 1){
            long userId = new UserService().findByEmail(email).getId_user();
            HttpSession session = request.getSession();
            session.setAttribute("UserId" , userId );

            response.sendRedirect("/pdaLastVersion_war/Home");
        } else {

            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
            rd.include(request,response);
            response.sendRedirect("/pdaLastVersion_war");
        }
    }
}
