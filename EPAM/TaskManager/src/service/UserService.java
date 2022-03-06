package service;

import beans.Role;
import service.exception.ServiceException;

public interface UserService {
    String signIn(String login, String password) throws ServiceException;
    
    void registration(String name, Role role, String login, String password) throws ServiceException;

    String showManagers() throws ServiceException;

    void deleteUser(String name) throws ServiceException;
    
    int count();
}
