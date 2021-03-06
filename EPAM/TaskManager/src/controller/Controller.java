package controller;

import controller.command.Command;

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    public String executeTask(String query){
        String commandName;
        Command executionCommand;

        char delimiter = ',';
        commandName = query.substring(0, query.indexOf(delimiter));
        executionCommand = provider.getCommand(commandName);

        String response;
        response = executionCommand.execute(query);
        return response;
    }
}
