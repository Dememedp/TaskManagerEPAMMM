package dao;

import beans.SubTask;
import dao.exception.DAOException;

public interface SubTaskDAO {
    void addSubTask(SubTask subTask) throws DAOException;
}
