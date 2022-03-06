package service.factory;

import service.UserService;
import service.TaskService;
import service.impl.TaskServiceImpl;
import service.impl.UserServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final UserService userService = new UserServiceImpl();
    private final TaskService taskService = new TaskServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){ return instance; }

    public UserService getUserService(){
        return userService;
    }

    public TaskService getTaskService(){
        return taskService;
    }
}
