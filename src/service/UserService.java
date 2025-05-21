package service;

import entity.User;

public interface UserService {
    public boolean login(String username, String password);

    public boolean register(User user);
}
