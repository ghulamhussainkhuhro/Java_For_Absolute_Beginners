package BasicsConcepts;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		In previous program we read a file
//		so here is how to delete a file
		
		File myFile = new File("File1.txt");
		if(myFile.delete()) {
			System.out.println("I have deleted the file named "+myFile.getName());
		}
		else {
			System.out.println("Some error occured while deleting the file.");
		}

	}

}
