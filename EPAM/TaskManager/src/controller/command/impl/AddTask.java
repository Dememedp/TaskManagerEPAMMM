package controller.command.impl;

import controller.command.Command;
import service.TaskService;
import service.exception.ServiceException;
import service.factory.ServiceFactory;

public class AddTask implements Command {
    @Override
    public String execute(String query) {
        String taskName = query.split(",")[1],
                date = query.split(",")[2],
                taskNote = query.split(",")[3],
                taskCreator = query.split(",")[4];

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        TaskService taskService = serviceFactory.getTaskService();
        try {
            taskService.addTask(taskName, date, taskNote, taskCreator);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return "Task has been added.\n";
    }
}
