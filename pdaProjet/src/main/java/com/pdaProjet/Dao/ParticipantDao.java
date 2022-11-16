package com.pdaProjet.Dao;

import com.pdaProjet.Entitys.Participants;
import com.pdaProjet.Util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ParticipantDao {
    public void insertEntity(Participants Participants){
        EntityManager entityManager =JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(Participants);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void findEntity(long id) {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Participants Participants = entityManager.find(Participants.class, id);
        System.out.println("Participants id :: " + Participants.getId());
        System.out.println("Participants getDate_debut :: " +Participants.getDomaine());
        System.out.println("Participants getDate_defin :: " + Participants.getStructure());
        entityManager.getTransaction().commit();
        entityManager.close();
    }



    public void updateEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Participants Participants = entityManager.find(Participants.class, id);
        System.out.println("Participants id :: " + Participants.getId());
        System.out.println("Participants getDate_debut :: " +Participants.getDomaine());
        System.out.println("Participants getDate_defin :: " + Participants.getStructure());
        entityManager.merge(Participants);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void removeEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Participants Participants = entityManager.find(Participants.class, id);
        System.out.println("Participants id :: " + Participants.getId());
        System.out.println("Participants getDate_debut :: " +Participants.getDomaine());
        System.out.println("Participants getDate_defin :: " + Participants.getStructure());
        entityManager.remove(Participants);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
