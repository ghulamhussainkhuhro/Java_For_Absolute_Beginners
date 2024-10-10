package BasicsConcepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File1.txt was created in previous program CreateFile.java
//		code to write in a file
		try {
			FileWriter fileWriter = new FileWriter("File1.txt");
			fileWriter.write("This is the content of the file.");
			fileWriter.write("\nMy name is Ghulam Hussain");
			fileWriter.close();
			System.out.println("Content written successfully!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not able to write in the file!");
		}



	}

}
