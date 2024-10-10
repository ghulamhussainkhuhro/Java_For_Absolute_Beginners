package SearchEngine;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class Search {

    public static void searchOnWeb(Scanner scanner) throws IOException {
        System.out.print("Enter your search query: ");
        String query = scanner.nextLine();  // Capture the actual search query

        // Encode spaces for proper URL formation
        query = query.replace(" ", "+");
        URI googleSearchUri = URI.create("https://www.google.com/search?q=" + query);

        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(googleSearchUri);
            } catch (IOException e) {
                System.err.println("Error opening web browser: " + e.getMessage());
            }
        } else {
            System.out.println("Web browsing is not supported on your system.");
        }

        // Add the actual query to history after search is complete
        History.addToHistory(query);
    }
}
