package service.impl;

import beans.Task;
import dao.TaskDAO;
import dao.exception.DAOException;
import dao.factory.DAOFactory;
import service.TaskService;
import service.exception.ServiceException;

import java.util.ArrayList;

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
        String taskList = "";
        ArrayList<Task> tasks = daoTask.showTasks();
        int i;
        if (tasks.size() != 0){
            for (i = 0; i < tasks.size(); i++){
                taskList = taskList + tasks.get(i).toString() + ".\n";
            }
        } else {
            taskList = "There are no tasks";
        }
        return taskList;
    }

    @Override
    public void doTask(String name){
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        TaskDAO taskDAO = daoObjectFactory.getTaskDAO();
        taskDAO.doTask(name);
    }
}