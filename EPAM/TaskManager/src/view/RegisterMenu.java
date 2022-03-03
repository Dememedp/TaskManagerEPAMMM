package view;

import controller.Controller;
import controller.command.CommandName;

import java.io.IOException;
import java.util.Scanner;

public class RegisterMenu {
    public static void Registration() throws IOException {
        Scanner registrationScanner = new Scanner(System.in);
        System.out.println("""
                Welcome to creating your account!
                Name:
                """);
        String name = registrationScanner.nextLine();
        System.out.println("Role:");
        String role = registrationScanner.nextLine();
        System.out.println("Hi, " + name + "! Create login and password!");
        System.out.println("Login:\n");
        String login = registrationScanner.nextLine();
        System.out.println("Password:");
        String password = registrationScanner.nextLine();
        Controller controller = new Controller();
        controller.executeTask(CommandName.REGISTRATION_MANAGER + "_Login_" + login + "_Password_" + password);
        switch (role) {
            case "Worker" -> WorkerMenu.show();
            case "Manager" -> ManagerMenu.ManagerMenuInit();
            case "Moderator" -> ModeratorMenu.ModeratorMenuInit();
        }
    }
}
