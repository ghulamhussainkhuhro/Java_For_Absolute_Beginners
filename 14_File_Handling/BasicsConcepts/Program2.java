package BasicsConcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		In Program1.java we wrote in file
//		so we will go now for Reading a file
		File myFile = new File("File1.txt");
		try {
			Scanner sc = new Scanner(myFile);
			
			while(sc.hasNextLine()) {
				String line  = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
