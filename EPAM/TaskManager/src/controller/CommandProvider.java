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
        repository.put(CommandName.REGISTRATION_WORKER, new RegistrationWorker());
        repository.put(CommandName.REGISTRATION_MANAGER, new RegistrationManager());
        repository.put(CommandName.REGISTRATION_MODERATOR, new RegistrationModerator());
        repository.put(CommandName.ADD_TASK, new AddTask());
        repository.put(CommandName.SHOW_TASKS, new ShowTasks());
        repository.put(CommandName.SHOW_MANAGERS, new ShowManagers());
        repository.put(CommandName.DELETE_USER, new DeleteUser());
    }

    Command getCommand(String commandName) {

        String capsCommandName = null;
        Command command = null;

        capsCommandName = commandName.toUpperCase(Locale.ROOT);
        command = repository.get(capsCommandName);
        return command;
    }
}
