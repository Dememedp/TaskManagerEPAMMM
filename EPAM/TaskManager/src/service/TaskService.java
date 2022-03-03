package service;

import beans.Task;
import service.exception.ServiceException;

import java.util.Date;

public interface TaskService {
    void addTask(String taskName, String taskDate, String taskNote, String taskCreator) throws ServiceException;

    String showTasks();
}
