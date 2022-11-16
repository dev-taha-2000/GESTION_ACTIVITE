package com.pdaProjet.Controller;

import com.pdaProjet.Dao.RoleDao;
import com.pdaProjet.Entitys.Role;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "AddUser", value = "/AddUser")
public class AddUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Role> roles = new RoleDao().getAll();
        System.out.println(roles);
        request.setAttribute("roles",roles);


        this.getServletContext().getRequestDispatcher("/WEB-INF/aduser.jsp").forward(request,response);
    }

}
