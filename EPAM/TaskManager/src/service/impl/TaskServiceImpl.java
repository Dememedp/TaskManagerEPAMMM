package service.impl;

import beans.Task;
import dao.TaskDAO;
import dao.exception.DAOException;
import dao.factory.DAOFactory;
import service.TaskService;
import service.exception.ServiceException;

import java.util.List;

public class TaskServiceImpl implements TaskService{
    DAOFactory daoFactory = DAOFactory.getInstance();
    TaskDAO daoTask = daoFactory.getTaskDAO();

    @Override
    public void addTask(String taskName, String taskDate, String taskNote, String taskCreator) throws ServiceException {
        if (taskName.equals("")){
            throw new ServiceException();
        } else {
            try {
                this.daoTask.addTask(new Task(taskName, taskDate, taskNote, taskCreator));
            } catch (DAOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String showTasks() {
        String taskList = "list";
        List<Task> tasks = daoTask.showTasks();
        Task t = new Task();
        while (tasks.contains(t)){
            taskList = taskList + t.toString() + ".\n";
        }
        return taskList;
    }
}


