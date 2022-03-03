package service.impl;

import beans.Role;
import beans.User;
import dao.UserDAO;

import dao.exception.DAOException;
import dao.factory.DAOFactory;
import service.UserService;
import service.exception.ServiceException;

public class UserServiceImpl implements UserService{
    @Override
    public String signIn(String login, String password) throws ServiceException {
        if (login == null || login.isEmpty()){
            throw new ServiceException("Incorrect login");
        }
        try{
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoObjectFactory.getUserDAO();
            userDAO.authorization(login, password);
        }catch (DAOException e){
            throw new ServiceException(e);
        }
        return "Login";
    }

    @Override
    public void registration(User user) throws ServiceException{
        if (user.getName().equals("")){
            throw new ServiceException("Wrong name");
        }

        try{
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoObjectFactory.getUserDAO();
            userDAO.registration(user);
        }catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public String showManagers() throws ServiceException{
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoObjectFactory.getUserDAO();
        try {
            userDAO.show();
        } catch (DAOException e) {
            throw new ServiceException();
        }
        return null;
    }

    @Override
    public void deleteUser(String name){
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoObjectFactory.getUserDAO();
        try{
            userDAO.deleteUser(name);
        } catch (DAOException e){
            e.printStackTrace();
        }
    }
}
