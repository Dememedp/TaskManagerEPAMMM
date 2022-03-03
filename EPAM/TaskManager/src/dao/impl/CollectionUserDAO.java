package dao.impl;

import beans.User;
import dao.UserDAO;
import dao.exception.DAOException;

import java.util.List;

public class CollectionUserDAO implements UserDAO{
    private List<User> users;

    @Override
    public boolean authorization(String login, String password) throws DAOException {
        return false;
    }

    @Override
    public void registration(User user) {
        this.users.add(user);
    }

    @Override
    public String show() throws DAOException {
        String userList = "";
        User user = new User();
        while (users.contains(user)){
            userList = userList + user + "\n";
        }
        return userList;
    }

    @Override
    public void deleteUser(String name) throws DAOException{
        users.remove(findUser(name));
    }

    @Override
    public User findUser(String name) throws DAOException{
        User user = new User();
        while (users.contains(user)){
            if (user.getName().equals(name)){
                break;
            }
        }
        return user;
    }
}
