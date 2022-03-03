package dao.factory;

import dao.PrivateTaskDAO;
import dao.SubTaskDAO;
import dao.TaskDAO;
import dao.UserDAO;
import dao.impl.CollectionUserDAO;
import dao.impl.CollectionTaskDAO;
import dao.impl.SQLSubTaskDAO;
import dao.impl.CollectionPrivateTaskDAO;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final UserDAO sqlUserImpl = new CollectionUserDAO();
    private final TaskDAO sqlTaskImpl = new CollectionTaskDAO();
    private final SubTaskDAO sqlSubTaskImpl = new SQLSubTaskDAO();
    private final PrivateTaskDAO sqlPrivateTaskImpl = new CollectionPrivateTaskDAO();

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return instance;
    }

    public UserDAO getUserDAO(){
        return sqlUserImpl;
    }

    public TaskDAO getTaskDAO(){ return sqlTaskImpl; }

    public SubTaskDAO geSubTaskDAO(){
        return sqlSubTaskImpl;
    }

    public PrivateTaskDAO getPrivateTaskDAO(){
        return sqlPrivateTaskImpl;
    }
}