package com.pdaProjet.Dao;

import com.pdaProjet.Entitys.Activite;
import com.pdaProjet.Util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ActiviteDao {

    public Activite insertEntity(Activite activite){

        EntityManager entityManager =JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(activite);
        entityManager.getTransaction().commit();
        entityManager.close();
        return activite;
    }

    public void findEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Activite Activité = entityManager.find(Activite.class, id);
        System.out.println("Activité id :: " + Activité.getId());
        System.out.println("Activité getDate_debut :: " +Activité.getDate_debut());
        System.out.println("Activité getDate_defin :: " + Activité.getDate_defin());
        System.out.println("Activité Description :: " + Activité.getDescription());
        System.out.println("Activité titre :: " + Activité.getTitre());
        entityManager.getTransaction().commit();
        entityManager.close();
    }



    public void updateEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Activite Activité = entityManager.find(Activite.class, id);
        System.out.println("Activité id :: " + Activité.getId());
        System.out.println("Activité getDate_debut :: " +Activité.getDate_debut());
        System.out.println("Activité getDate_defin :: " + Activité.getDate_defin());
        System.out.println("Activité Description :: " + Activité.getDescription());
        System.out.println("Activité titre :: " + Activité.getTitre());
        entityManager.merge(Activité);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void removeEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Activite Activité = entityManager.find(Activite.class, id);
        System.out.println("Activité id :: " + Activité.getId());
        System.out.println("Activité getDate_debut :: " +Activité.getDate_debut());
        System.out.println("Activité getDate_defin :: " + Activité.getDate_defin());
        System.out.println("Activité Description :: " + Activité.getDescription());
        System.out.println("Activité titre :: " + Activité.getTitre());
        entityManager.remove(Activité);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
