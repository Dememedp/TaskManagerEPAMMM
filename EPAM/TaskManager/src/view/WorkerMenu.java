package view;

import java.io.IOException;
import java.util.Scanner;

public class WorkerMenu{
    public static void show() throws IOException {
        while (true) {
            System.out.println("""
                    Hi!
                    1. Check my tasks
                    2. Do the Task
                    3. Exit""");
            Scanner workerChoiceScanner = new Scanner(System.in);
            int workerChoice = workerChoiceScanner.nextInt();
            switch (workerChoice) {
                case 1 -> System.out.println(TaskMenu.show());
                case 2 -> System.out.println(TaskMenu.doTask());
                case 3 -> Menu.Init();
                default -> System.out.println("Wrong input");
            }
        }
    }
}
