package dao;

import beans.User;

public interface UserDAO {
    boolean authorization(String login, String password);
    void registration(User user);
    String show();
    void deleteUser(String name);
    User findUser(String name);
}
