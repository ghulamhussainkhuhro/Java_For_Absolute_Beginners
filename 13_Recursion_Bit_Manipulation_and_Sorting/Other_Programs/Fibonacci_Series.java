import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//First two terms of fibonacci series
		int a=0;
		int b=1;
		int n;
		System.out.print("Enter number of terms you want to print of fibonacci series : ");
		n=sc.nextInt();
		System.out.println("First "+n+" terms of fibonacci series : ");
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
				int temp=a;
				       a=b;
				       b=temp+a;
				       
		}
		

	}

}
