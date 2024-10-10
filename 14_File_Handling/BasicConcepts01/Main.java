package BasicConcepts01;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("MyFile.txt");
//		this is when file exists in your project
//		but what if it exists somewhere else but not in project so see code after if else
		if(file.exists()) {
			System.out.println("File exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());// checks whether the file is a file not a folder
//			file.delete(); deletes the file
		}
		else {
			System.out.println("File doesn't exist");
		}
//		so if file does not exists in project add complete path
		File file1 = new File("C:\\Users\\Administrator\\OneDrive\\Desktop\\SystemFile.txt");
		
		if(file1.exists()) {
			System.out.println("File exists");
			System.out.println(file1.getPath());
			System.out.println(file1.getAbsolutePath());
			System.out.println(file1.isFile());
		}
		else {
			System.out.println("File doesn't exist");
		}
	}

}
