package SearchEngine;

import java.util.Scanner;

public class Menu {

    public static int showMenu() {
        System.out.println("\nSearch Engine Menu:");
        System.out.println("1. Search for something on the web");
        System.out.println("2. Show search history");
        System.out.println("3. Delete search history");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
