package view;

import java.io.IOException;
import java.util.Scanner;

public class ModeratorMenu {
    public static void ModeratorMenuInit() throws IOException {
        while (true) {
            System.out.println("""
                    Hi!
                    1. Show all managers
                    2. Delete manager
                    3. Exit""");
            Scanner moderatorChoiceScanner = new Scanner(System.in);
            int moderatorChoice = moderatorChoiceScanner.nextInt();
            switch (moderatorChoice) {
                case 1 -> UserMenu.show();
                case 2 -> UserMenu.delete();
                case 3 -> Menu.Init();
                default -> System.out.println("Wrong input");
            }
        }
    }
}
