package com.pdaProjet.Service;
import com.pdaProjet.Entitys.User;
import com.pdaProjet.Repository.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();
    public User add(User user) {
        return userRepo.add(user);
    }

    public int login(String Email, String Password) {

        return userRepo.login(Email,Password);
    }

    public User findByEmail(String Email) {

        return userRepo.findByEmail(Email);
    }
}
