package SearchEngine;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class History {

    private static final String HISTORY_FILE = "History.txt";
    private static List<String> searchHistory = new ArrayList<>();

//    public static void addToHistory(String query) throws IOException {
//        searchHistory.add(query);
//        saveHistory();
//    }
    public static void addToHistory(String query) throws IOException {
    	  // 1. Check if query is empty before adding
    	  if (!query.isEmpty()) {
    	    searchHistory.add(query);
    	  }
    	  saveHistory();
    	}

    public static void showHistory() {
        if (searchHistory.isEmpty()) {
            System.out.println("Search history is empty.");
        } else {
            System.out.println("\nSearch History:");
            for (int i = 0; i < searchHistory.size(); i++) {
                System.out.println((i + 1) + ". " + searchHistory.get(i));
            }
        }
    }
    public static void deleteHistory() throws IOException {
        System.out.print("Are you sure you want to delete search history (y/n)? ");
        char confirmation = new Scanner(System.in).nextLine().charAt(0);

        if (confirmation == 'y' || confirmation == 'Y') {
            searchHistory.clear();
            saveHistory();
            System.out.println("Search history deleted.");
        }
    }

    private static void loadHistory() throws IOException {
        searchHistory.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(HISTORY_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                searchHistory.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("History file not found. Creating a new one.");
        }
    }

    static void saveHistory() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(HISTORY_FILE))) {
            for (String query : searchHistory) {
                writer.write(query + "\n");
            }
        }
    }

    public static void initializeHistory() throws IOException {
        loadHistory();
    }
}
