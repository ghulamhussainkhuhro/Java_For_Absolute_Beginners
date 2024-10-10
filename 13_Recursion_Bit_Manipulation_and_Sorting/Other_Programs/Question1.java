import java.util.Scanner;

public class Question1 {
	public static int printAverage(int a, int b, int c) {
		return (a+b+c)/3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second number : ");
		int b=sc.nextInt();
		System.out.print("Enter Third number : ");
		int c=sc.nextInt();
		System.out.println("The average of three numbers is "+printAverage(a, b, c));
		
	}

}
