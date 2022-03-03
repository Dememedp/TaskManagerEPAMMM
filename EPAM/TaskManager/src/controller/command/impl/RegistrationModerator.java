package controller.command.impl;

import beans.User;
import controller.command.Command;
import service.UserService;
import service.exception.ServiceException;
import service.factory.ServiceFactory;

public class RegistrationModerator implements Command {
    @Override
    public String execute(String request){
//        String username = request.split(",")[2],
//                name = request.split(",")[4],
//                pass = request.split(",")[6];
//        int age = Integer.parseInt(request.split(",")[8]);
//
//        ServiceFactory serviceFactory = ServiceFactory.getInstance();
//        UserService employeeService = serviceFactory.getUserService();
//        employeeService.registration(new User.UserBuilder());
        return null;
    }
}
