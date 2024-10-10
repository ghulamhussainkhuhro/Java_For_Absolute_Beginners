package JavaException1;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int d;
        int result;
        char ch;

        do {
            System.out.println("Enter a number : ");
            n = sc.nextInt();
            System.out.println("Enter another number (except 0) : ");
            d = sc.nextInt();

            try {
                // Perform division within the try block
                result = n / d;
                System.out.println("Quotient of " + n + "/" + d + " is " + result);
            } catch (ArithmeticException e) {
                // Handle the exception by informing the user and prompting again
                System.out.println("Error: Division by zero is not allowed.");
            }

            System.out.println();
            System.out.println("Do you want to continue? (Y/N)");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
