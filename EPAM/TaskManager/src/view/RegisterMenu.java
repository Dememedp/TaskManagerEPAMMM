package view;

import beans.Role;
import controller.Controller;
import controller.command.CommandName;

import java.io.IOException;
import java.util.Scanner;

public class RegisterMenu {
    public static void Registration() throws IOException {
        final String worker = "1", manager = "2", moderator = "3";

        Scanner registrationScanner = new Scanner(System.in);
        System.out.println("""
                Welcome to creating your account!
                Name:
                """);
        String name = registrationScanner.nextLine();
        System.out.println("Role:");
        System.out.println("1 - Worker, 2 - Manager, 3 - Moderator");
        String choice = registrationScanner.nextLine();
        Role role = null;
        switch (choice) {
            case worker -> role = Role.WORKER;
            case manager -> role = Role.MANAGER;
            case moderator -> role = Role.MODERATOR;
        }
        System.out.println("Hi, " + name + "! Create login and password!");
        System.out.println("Login:\n");
        String login = registrationScanner.nextLine();
        System.out.println("Password:");
        String password = registrationScanner.nextLine();
        Controller controller = new Controller();
        controller.executeTask(CommandName.REGISTRATION + "," + name + "," + role + "," + login + "," + password);
        if (role != null) {
            switch (role) {
                case WORKER -> WorkerMenu.show();
                case MANAGER -> ManagerMenu.ManagerMenuInit();
                case MODERATOR -> ModeratorMenu.ModeratorMenuInit();
            }
        }
    }
}
