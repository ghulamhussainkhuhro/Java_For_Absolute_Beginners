package BasicConcepts01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter writer = new FileWriter("Intro.txt");
			writer.write("My name is Ghulam Hussain.\nI study at MUET Jamshoro\nI am doing BE Software Engineering");
			writer.append("\nThis was my intro!");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
