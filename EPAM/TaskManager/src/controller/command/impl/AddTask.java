package controller.command.impl;

import beans.Task;
import controller.command.Command;
import service.TaskService;
import service.exception.ServiceException;
import service.factory.ServiceFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddTask implements Command {
    @Override
    public String execute(String query) {
        String taskName = query.split(",")[1],
                date = query.split(",")[2],
                taskNote = query.split(",")[3],
                taskCreator = query.split(",")[4];
        System.out.println(taskName + date + taskNote + taskCreator);

//        Date taskDate = null;
//        SimpleDateFormat format = new SimpleDateFormat();
//        format.applyPattern("dd.MM.yyyy");
//        try {
//            taskDate = format.parse(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

        //Date date1 = new Date();

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
