package com.pdaProjet.Dao;

import com.pdaProjet.Entitys.User;
import com.pdaProjet.Util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UserDao {

    public User insertEntity(User user){
        //user.getRole().setUsers(new ArrayList<User>() );
        EntityManager entityManager =JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();

        return user ;

    }

    public void findEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        System.out.println("user id :: " + user.getId_user());
        System.out.println("User password :: " +user.getPassword());
        System.out.println("User lastname :: " + user.getName());
        System.out.println("User email :: " + user.getEmail());
        entityManager.getTransaction().commit();
        entityManager.close();
    }



    public void updateEntity(long id) {


        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        User user = entityManager.find(User.class, id);
        System.out.println("student id :: " + user.getId_user());
        System.out.println("student firstname :: " + user.getName());
        System.out.println("student email :: " + user.getEmail());
        System.out.println("student password :: " + user.getPassword());
        entityManager.merge(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void removeEntity(long id) {

        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        System.out.println("student id :: " + user.getId_user());
        System.out.println("student name :: " + user.getName());
        System.out.println("student email :: " + user.getEmail());
        System.out.println("student password :: " + user.getPassword());
        entityManager.remove(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }


}