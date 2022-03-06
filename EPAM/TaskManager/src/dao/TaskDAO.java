package dao;

import beans.Task;
import dao.exception.DAOException;

import java.util.ArrayList;

public interface TaskDAO {
    void addTask(Task task) throws DAOException;

    ArrayList<Task> showTasks();

    void doTask(String name);

    Task findTask(String name);
}
