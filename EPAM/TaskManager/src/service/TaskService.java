package service;

import service.exception.ServiceException;

public interface TaskService {
    void addTask(String taskName, String taskDate, String taskNote, String taskCreator) throws ServiceException;

    String showTasks();

    void doTask(String name);
}
