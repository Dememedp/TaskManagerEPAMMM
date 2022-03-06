package dao.factory;

import dao.TaskDAO;
import dao.UserDAO;
import dao.impl.CollectionUserDAO;
import dao.impl.CollectionTaskDAO;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final UserDAO sqlUserImpl = new CollectionUserDAO();
    private final TaskDAO sqlTaskImpl = new CollectionTaskDAO();

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return instance;
    }

    public UserDAO getUserDAO(){
        return sqlUserImpl;
    }

    public TaskDAO getTaskDAO(){ return sqlTaskImpl; }
}