package com.pdaProjet.Controller;

import com.pdaProjet.Dao.ActiviteDao;
import com.pdaProjet.Entitys.Activite;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;

@WebServlet(name = "addactivite", value = "/addActivite")
public class ActiviteServlet extends HttpServlet {
    /*private String validate=null;*/
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.getServletContext().getRequestDispatcher("/WEB-INF/addActivite.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String titre=req.getParameter("titre");
        String description = req.getParameter("description");
        //String date_debut = req.getParameter("date_debut");
        //String date_fin = req.getParameter("date_fin");

        ActiviteDao activiteDao = new ActiviteDao();
        Activite activite = new Activite();
        activite.setDate_debut(new Date());
        activite.setDate_defin(new Date());
        activite.setDescription(description);
        activite.setTitre(titre);
        activiteDao.insertEntity(activite);



    }
}




















