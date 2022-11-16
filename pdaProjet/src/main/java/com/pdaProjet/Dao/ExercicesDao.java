package com.pdaProjet.Dao;

import com.pdaProjet.Entitys.Exercices;
import com.pdaProjet.Util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ExercicesDao {
    public void insertEntity(Exercices Exercices){

        EntityManager entityManager =JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(Exercices);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void findEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Exercices exercices = entityManager.find(Exercices.class, id);
        //System.out.println("Exercices id :: " + exercices.getId());
        System.out.println("Exercices Annee :: " +exercices.getAnnee());
        System.out.println("Exercices Date_debut :: " + exercices.getDate_debut());
        System.out.println("Exercices date_fin :: " + exercices.getDate_fin());
        entityManager.getTransaction().commit();
        entityManager.close();
    }



    public void updateEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Exercices exercices = entityManager.find(Exercices.class, id);
        //System.out.println("Exercices id :: " + exercices.getId());
        System.out.println("Exercices Annee :: " +exercices.getAnnee());
        System.out.println("Exercices Date_debut :: " + exercices.getDate_debut());
        System.out.println("Exercices date_fin :: " + exercices.getDate_fin());
        entityManager.merge(exercices);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void removeEntity(long id) {


        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Exercices exercices = entityManager.find(Exercices.class, id);
        //System.out.println("Exercices id :: " + exercices.getId());
        System.out.println("Exercices Annee :: " +exercices.getAnnee());
        System.out.println("Exercices Date_debut :: " + exercices.getDate_debut());
        System.out.println("Exercices date_fin :: " + exercices.getDate_fin());
        entityManager.remove(exercices);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
