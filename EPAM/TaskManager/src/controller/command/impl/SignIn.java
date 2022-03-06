package controller.command.impl;

import controller.command.Command;
import service.UserService;
import service.exception.ServiceException;
import service.factory.ServiceFactory;

public class SignIn implements Command {
    @Override
    public String execute(String request) {
        String login = request.split(",")[1],
                password = request.split(",")[2];

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();
        String response;
        try {
            response = userService.signIn(login, password);
        } catch (ServiceException exception) {
            response = exception.getMessage();
        }

        return response;
    }
}
