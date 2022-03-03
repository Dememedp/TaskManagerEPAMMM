package dao;

import beans.Task;
import dao.exception.DAOException;

import java.util.Date;
import java.util.List;

public interface TaskDAO {
    public void addTask(Task task) throws DAOException;

    List<Task> showTasks();
}
