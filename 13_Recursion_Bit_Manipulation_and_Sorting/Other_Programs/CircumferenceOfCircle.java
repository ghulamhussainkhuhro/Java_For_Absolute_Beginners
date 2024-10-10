import java.util.Scanner;

public class CircumferenceOfCircle {
	public static double circumference(double a) {
		return 2*Math.PI*a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr radius of circle : ");
		double a=sc.nextDouble();
		System.out.println("Circumference of circle with radius "+a+" is "+circumference(a)+" units.");
	}

}
