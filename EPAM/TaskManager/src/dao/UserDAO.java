package dao;

import beans.User;
import dao.exception.DAOException;

public interface UserDAO {
    boolean authorization(String login, String password) throws DAOException;
    void registration(User user) throws DAOException;
    String show() throws DAOException;
    void deleteUser(String name) throws DAOException;
    User findUser(String name) throws DAOException;
}
