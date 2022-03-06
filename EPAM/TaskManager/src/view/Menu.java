package view;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    public static void Init() throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please choose action:
                1. Log in
                2. Register
                0. Exit
                """);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                LoginMenu.show();
            }
            case 2 -> RegisterMenu.Registration();
            case 0 -> {
                System.out.println("Bye-bye!!!");
                exit(0);
            }
            default -> System.out.println("Wrong input!");
        }
    }
}
