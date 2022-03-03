package controller.command.impl;

import controller.command.Command;
import service.TaskService;
import service.factory.ServiceFactory;

public class ShowTasks implements Command {
    @Override
    public String execute(String query) {
        String response;
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        TaskService taskService = serviceFactory.getTaskService();

        response = taskService.showTasks();
        return response;
    }
}
