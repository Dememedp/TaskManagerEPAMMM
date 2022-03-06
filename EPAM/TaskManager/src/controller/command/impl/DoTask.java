package controller.command.impl;

import controller.command.Command;
import service.TaskService;
import service.factory.ServiceFactory;

public class DoTask implements Command {
    @Override
    public String execute(String query) {
        String name = query.split(",")[1];
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        TaskService taskService = serviceFactory.getTaskService();
        taskService.doTask(name);
        return "Success";
    }
}
