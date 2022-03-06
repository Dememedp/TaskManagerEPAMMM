package controller;


import controller.command.Command;
import controller.command.CommandName;
import controller.command.impl.*;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CommandProvider {
    private final Map<String, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.SIGN_IN, new SignIn());
        repository.put(CommandName.REGISTRATION, new Registration());
        repository.put(CommandName.ADD_TASK, new AddTask());
        repository.put(CommandName.SHOW_TASKS, new ShowTasks());
        repository.put(CommandName.SHOW_MANAGERS, new ShowManagers());
        repository.put(CommandName.DELETE_USER, new DeleteUser());
        repository.put(CommandName.DO_TASK, new DoTask());
    }

    Command getCommand(String commandName) {

        String capsCommandName;
        Command command;

        capsCommandName = commandName.toUpperCase(Locale.ROOT);
        command = repository.get(capsCommandName);
        return command;
    }
}
