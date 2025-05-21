package service.impl;

import entity.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    List<User> users = new ArrayList<User>();


    @Override
    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getEmail().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean register(User user) {
        users.add(user);
        return true;
    }
}
