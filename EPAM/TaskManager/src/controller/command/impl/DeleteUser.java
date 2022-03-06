package controller.command.impl;

import controller.command.Command;
import service.UserService;
import service.exception.ServiceException;
import service.factory.ServiceFactory;

public class DeleteUser implements Command {
    @Override
    public String execute(String query) {
        String name = query.split(",")[1];
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();

        String responce;
        try{
            userService.deleteUser(name);
            responce = "Success";
        } catch (ServiceException e){
            e.printStackTrace();
            responce = "Failure";
        }
        return responce;
    }
}
