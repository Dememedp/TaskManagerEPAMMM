package controller.command;

import service.exception.ServiceException;

public interface Command {
    String execute(String query);
}
