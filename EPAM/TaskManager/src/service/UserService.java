package service;

import beans.User;
import service.exception.ServiceException;

public interface UserService {
    String signIn(String login, String password) throws ServiceException;
    void registration(User user) throws ServiceException;

    String showManagers() throws ServiceException;

    void deleteUser(String name) throws ServiceException;
}
