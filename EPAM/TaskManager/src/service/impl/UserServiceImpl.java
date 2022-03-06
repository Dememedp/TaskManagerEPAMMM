package service.impl;

import beans.Role;
import beans.User;
import dao.UserDAO;

import dao.factory.DAOFactory;
import service.UserService;
import service.exception.ServiceException;

public class UserServiceImpl implements UserService{
    @Override
    public String signIn(String login, String password) throws ServiceException {
        if (login == null || login.isEmpty()){
            throw new ServiceException("Incorrect login");
        }
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoObjectFactory.getUserDAO();
        userDAO.authorization(login, password);
        return "Login";
    }

    @Override
    public void registration(String name, Role role, String  login, String  password) throws ServiceException{
        if (name.equals("")){
            throw new ServiceException("Wrong name");
        }
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoObjectFactory.getUserDAO();
        User user = new User(name, role, login, password);
        userDAO.registration(user);
    }

    @Override
    public String showManagers(){
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoObjectFactory.getUserDAO();
        return userDAO.show();
    }

    @Override
    public void deleteUser(String name){
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoObjectFactory.getUserDAO();
        userDAO.deleteUser(name);
    }
}
