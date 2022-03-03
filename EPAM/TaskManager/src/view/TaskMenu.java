package view;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import beans.Task;
import controller.Controller;
import controller.command.CommandName;

public class TaskMenu {
    public static void show(){
        Controller controller = new Controller();
        controller.executeTask(CommandName.SHOW_TASKS + ",");
    }

    public static void create() throws IOException{
        Scanner scanner = new Scanner(System.in);
        //Task task = new Task(taskName, taskDate, taskNote, taskCreator);

        System.out.println("Task name:");
        String name = scanner.nextLine();
        System.out.println("Due date:");
        String date = scanner.nextLine();
        Date taskDate = null;
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");
        try {
            taskDate= format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Task note:");
        String note = scanner.nextLine();
        System.out.println("Task creator:");
        String creator = scanner.nextLine();
        Controller controller = new Controller();
        System.out.println(controller.executeTask(CommandName.ADD_TASK + "," + name + "," + date +
                "," + note + "," + creator));

    }
}
