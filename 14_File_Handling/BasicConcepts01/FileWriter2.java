package BasicConcepts01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter2 {
  public static void main(String[] args) {
    try {
      File myFile = new File("myfile.txt");
      PrintWriter writer = new PrintWriter(myFile);
      writer.println("This is some data to write to the file.");
      writer.close();
      System.out.println("Successfully wrote to the file.");
    } catch (FileNotFoundException e) {
      System.err.println("Error writing to file: " + e.getMessage());
    }
  }
}
