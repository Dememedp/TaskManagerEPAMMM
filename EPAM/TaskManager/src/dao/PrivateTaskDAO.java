package dao;

import beans.PrivateTask;
import dao.exception.DAOException;

public interface PrivateTaskDAO {
    void addPrivateTask(PrivateTask privateTask) throws DAOException;
}
