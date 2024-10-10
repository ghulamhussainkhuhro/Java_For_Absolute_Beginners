import java.util.Scanner;

public class Question2 {
	public static void printOddNumbers(int a) {
		System.out.println("Odd numbers upto "+a+" are ");
		for(int i=1; i<=a; i++) {
			System.out.print(i+" ");
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number you want to print odd numbers to : ");
		int a=sc.nextInt();
		printOddNumbers(a);
		
	}

}
