package controller.command.impl;

import controller.command.Command;
import service.UserService;
import service.exception.ServiceException;
import service.factory.ServiceFactory;

public class ShowManagers implements Command {
    @Override
    public String execute(String query) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();

        String response = null;
        try {
            response = userService.showManagers();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return response;
    }
}
