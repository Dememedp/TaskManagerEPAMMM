package view;

import controller.Controller;
import controller.command.CommandName;

import java.util.Scanner;

public class UserMenu {
    public static void show(){
        Controller controller = new Controller();
        System.out.println(controller.executeTask(CommandName.SHOW_MANAGERS));
    }

    public static void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of manager you want to delete:");
        String name = sc.nextLine();
        Controller controller = new Controller();
        controller.executeTask(CommandName.DELETE_USER + name);
    }
}
