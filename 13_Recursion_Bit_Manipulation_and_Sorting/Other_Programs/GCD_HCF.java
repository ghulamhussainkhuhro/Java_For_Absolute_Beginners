import java.util.Scanner;

public class GCD_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Input the two numbers from the user
		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        // Calculate and print the HCF
		        int hcf = calculateHCF(num1, num2);
		        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

		        scanner.close();
		    }

		    // Function to calculate the HCF using Euclidean Algorithm
		    private static int calculateHCF(int a, int b) {
		        while (b != 0) {
		            int temp = b;
		            b = a % b;
		            a = temp;
		        }
		        return a;
		    }
//Enter the first number: 24
//Enter the second number: 36
//Now, let's walk through the execution step by step:
//
//User inputs: num1 = 24 and num2 = 36.
//
//The program then calls the calculateHCF function with num1 and num2 as arguments.
//
//Inside calculateHCF:
//
//The while loop continues until b becomes 0.
//In the first iteration: temp = 36, b = 24 % 36 = 24, a = 36.
//In the second iteration: temp = 24, b = 36 % 24 = 12, a = 24.
//In the third iteration: temp = 12, b = 24 % 12 = 0, and the loop exits.
//The program prints the HCF using the calculated value of a (which is 12 in this case).
//		

	}


