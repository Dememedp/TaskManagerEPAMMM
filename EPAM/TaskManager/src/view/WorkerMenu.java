package view;

import java.io.IOException;
import java.util.Scanner;

public class WorkerMenu{
    public static void show() throws IOException {
        while (true) {
            System.out.println("""
                    Hi!
                    1. Check my tasks
                    2. Add private task
                    3. Exit""");
            Scanner workerChoiceScanner = new Scanner(System.in);
            int workerChoice = workerChoiceScanner.nextInt();
            switch (workerChoice) {
                case 1 -> TaskMenu.show();
                //case 2 -> TaskMenu.createPrivate();
                case 3 -> Menu.Init();
                default -> System.out.println("Wrong input");
            }
        }
    }
}
