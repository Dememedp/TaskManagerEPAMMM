package service.factory;

import service.UserService;
import service.TaskService;
import service.PrivateTaskService;
import service.SubTaskService;
import service.impl.PrivateTaskServiceImpl;
import service.impl.SubTaskServiceImpl;
import service.impl.TaskServiceImpl;
import service.impl.UserServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final UserService userService = new UserServiceImpl();
    private final TaskService taskService = new TaskServiceImpl();
    private final SubTaskService subTaskService = new SubTaskServiceImpl();
    private final PrivateTaskService privateTaskService = new PrivateTaskServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){ return instance; }

    public UserService getUserService(){
        return userService;
    }

    public TaskService getTaskService(){
        return taskService;
    }

    public SubTaskService getSubTaskService(){
        return subTaskService;
    }

    public PrivateTaskService getPrivateTaskService(){
        return privateTaskService;
    }
}
