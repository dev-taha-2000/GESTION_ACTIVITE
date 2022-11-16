package com.pdaProjet.Controller;

import com.pdaProjet.Entitys.Role;
import com.pdaProjet.Entitys.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.pdaProjet.Service.UserService;
import java.io.IOException;

@WebServlet(name = "SaveUser", value = "/SaveUser")
public class SaveUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String telephone = request.getParameter("phoneNumber");
        Long role = Long.valueOf(request.getParameter("role"));
        User user = new User();
        Role roleObjet = new Role();

        roleObjet.setId_role(Math.toIntExact(role));
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setTelephone(telephone);
        user.setRole(roleObjet);
        new UserService().add(user);
        response.sendRedirect("/Home");
    }
}
