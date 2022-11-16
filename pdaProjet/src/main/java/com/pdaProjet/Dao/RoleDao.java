package com.pdaProjet.Dao;

import com.pdaProjet.Entitys.Role;
import com.pdaProjet.Util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;

public class RoleDao {

        public ArrayList<Role> getAll(){
            EntityManager entityManager=JpaUtil.getEntityManagerFactory().createEntityManager();
            ArrayList<Role> roles = (ArrayList<Role>)  entityManager.createQuery("select a from Role a",Role.class).getResultList();
            return roles;
        }

    public Role find(long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCE");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Role role = entityManager.find(Role.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return role;
    }
}
