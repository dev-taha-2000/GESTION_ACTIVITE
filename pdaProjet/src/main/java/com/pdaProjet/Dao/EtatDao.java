package com.pdaProjet.Dao;

import com.pdaProjet.Entitys.Etat;
import com.pdaProjet.Util.JpaUtil;
import jakarta.persistence.EntityManager;

public class EtatDao {


    public Etat findEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Etat etat = entityManager.find(Etat.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return etat ;
    }


}
