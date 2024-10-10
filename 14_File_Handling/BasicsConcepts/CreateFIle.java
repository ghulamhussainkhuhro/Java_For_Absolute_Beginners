package BasicsConcepts;

import java.io.File;
import java.io.IOException;

public class CreateFIle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		code to create a new file
		File myFile = new File("File1.txt");
		try {
			myFile.createNewFile();
			System.out.println("File named "+myFile.getName()+" is created successfully!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Unable to create the file!");
		}

	}

}
