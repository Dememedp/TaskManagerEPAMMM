package view;

import java.io.IOException;
import java.util.Scanner;

public class ManagerMenu {
    public static void ManagerMenuInit() throws IOException{
        while (true) {
            System.out.println("""
                    Hi!
                    1. Show all tasks
                    2. Add task
                    3. Exit""");
            Scanner managerChoiceScanner = new Scanner(System.in);
            int managerChoice = managerChoiceScanner.nextInt();
            switch (managerChoice) {
                case 1 -> {
                    System.out.println(TaskMenu.show());
                }
                case 2 -> {
                    TaskMenu.create();
                }
                case 3 -> Menu.Init();
                default -> System.out.println("Wrong input");
            }
        }
    }
}
