package controller.command.impl;

import beans.Role;
import controller.command.Command;
import service.UserService;
import service.exception.ServiceException;
import service.factory.ServiceFactory;

public class Registration implements Command {
    @Override
    public String execute(String request){
        String name = request.split(",")[1];
        Role role = Role.valueOf(request.split(",")[2]);
        String login = request.split(",")[3],
                password = request.split(",")[4];

        String responce;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();
        try {
            userService.registration(name, role, login, password);
            responce = "Welcome, " + name + " !";
        } catch (ServiceException e) {
            e.printStackTrace();
            responce = "Registration failed";
        }
        return responce;
    }
}
