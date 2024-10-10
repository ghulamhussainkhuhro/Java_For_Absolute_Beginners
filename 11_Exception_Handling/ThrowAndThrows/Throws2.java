package ThrowAndThrows;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws2 {
	
	public static int getInput() throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int num = getInput();
			System.out.println("You entered : " + num);
		}catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("Error : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		
	}

}
