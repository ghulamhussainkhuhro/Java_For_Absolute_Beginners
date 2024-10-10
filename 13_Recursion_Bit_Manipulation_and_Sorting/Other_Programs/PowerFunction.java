import java.util.Scanner;

public class PowerFunction {
	public static int powerFind(int base, int expo) {
		int result=1;
		for(int i=1; i<=expo; i++) {
			result*=base;//result=result*base
		}
		return result;
	
	}
	//We can also use the math class to find the same thing
//	public static int powerFind(int base, int expo) {
//		return (int) Math.pow(base, expo);
//	
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b;
		int e;
		System.out.print("Enter base : ");
		b=sc.nextInt();
		System.out.print("Enter exponent : ");
		e=sc.nextInt();
		
		System.out.println(b+" raised to power "+e+" is "+powerFind(b, e));

	}

}
