package view;

import controller.Controller;
import controller.command.CommandName;

import java.io.IOException;
import java.util.Scanner;

public class LoginMenu{
    public static void show() throws IOException{
        final String WORKER = "1", MANAGER = "2", MODERATOR = "3";

        Scanner loginScanner = new Scanner(System.in);
        System.out.println("Welcome back!");
        System.out.println("Role:\n");
        System.out.println("1 - Worker, 2 - Manager, 3 - Moderator\n");
        String role = loginScanner.nextLine();
        System.out.println("Login:\n");
        String login = loginScanner.nextLine();
        System.out.println("Password:");
        String password = loginScanner.nextLine();
        Controller controller = new Controller();
        controller.executeTask(CommandName.SIGN_IN + "," + login + "," + password);
        switch (role) {
            case WORKER -> WorkerMenu.show();
            case MANAGER -> ManagerMenu.ManagerMenuInit();
            case MODERATOR -> ModeratorMenu.ModeratorMenuInit();
            default -> throw new IllegalStateException("Unexpected value: " + role);
        }
    }
}
