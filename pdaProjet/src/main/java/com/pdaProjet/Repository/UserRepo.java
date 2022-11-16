package com.pdaProjet.Repository;

import com.pdaProjet.Dao.RoleDao;
import com.pdaProjet.Dao.UserDao;
import com.pdaProjet.Entitys.Role;
import com.pdaProjet.Entitys.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.query.Query;

public class UserRepo {

   private UserDao userDao = new UserDao();
    public User add(User user) {

        if(user.getRole().getName() == null){
            Role role = new RoleDao().find(user.getRole().getId_role());
            user.setRole(role);
            System.out.println(user);
        }
        return userDao.insertEntity(user);

    }

    public int login(String Email, String Password) {
        // a mettre au service
        User user = new UserRepo().findByEmail(Email);
        if(user.getEmail() == null){return 0;}
        return  (user.getPassword().equals(Password)) ? 1 : 2;
    }

    public User findByEmail(String Email) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCE");
        EntityManager entityManager = emf.createEntityManager();
        Query<User> query = (Query<User>) entityManager.createQuery("from User where email =:email",User.class);
        query.setParameter("email", Email);

        User user = query.getSingleResult();

        entityManager.close();

        return user;
    }



}
