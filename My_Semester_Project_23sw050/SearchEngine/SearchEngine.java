package SearchEngine;
import java.io.IOException;
import java.util.Scanner;

public class SearchEngine {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        History.initializeHistory(); // Load history on startup

        int choice;
        do {
            choice = Menu.showMenu();

            switch (choice) {
                case 1:
                    Search.searchOnWeb(scanner);
                    History.addToHistory(scanner.nextLine()); // Get query from scanner after search
                    break;
                case 2:
                    History.showHistory();
                    break;
                case 3:
                    History.deleteHistory();
                    break;
                case 4:
                    System.out.println("Exiting Search Engine.");
                    History.saveHistory(); // Save history on exit
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
