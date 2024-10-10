import java.util.Scanner;

public class MaxOfTwo {
	public static void maxOfTwo(int a, int b) {
		if(a>b) {
			System.out.println(a+" is greater.");
		}
		else if(a<b) {
			System.out.println(b+" is greater.");
		}
		else{
			System.out.println("Both numbers are equal.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second number : ");
		int b=sc.nextInt();
		maxOfTwo(a, b);
		

	}

}
