package view;

import java.util.Scanner;

import controller.Controller;
import controller.command.CommandName;

public class TaskMenu {
    public static String show(){
        Controller controller = new Controller();
        return (controller.executeTask(CommandName.SHOW_TASKS + ","));
    }

    public static void create(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task name:");
        String name = scanner.nextLine();
        System.out.println("Due date:");
        String date = scanner.nextLine();
        System.out.println("Task note:");
        String note = scanner.nextLine();
        System.out.println("Task creator:");
        String creator = scanner.nextLine();
        Controller controller = new Controller();
        System.out.println(controller.executeTask(CommandName.ADD_TASK + "," + name + "," + date +
                "," + note + "," + creator));
    }

    public static String doTask() {
        Scanner scanner = new Scanner(System.in);

        Controller controller = new Controller();
        System.out.println("Task name:");
        String name = scanner.nextLine();
        return controller.executeTask(CommandName.DO_TASK + "," + name);
    }
}
