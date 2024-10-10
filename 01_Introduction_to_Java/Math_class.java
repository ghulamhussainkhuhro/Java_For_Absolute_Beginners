package Myfirstjavaprogram;

public class Math_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//To find maximum or minimum of two numbers

		double x=32.1234;
		double y=-64.3276;
		
//		For maximum
		double z=Math.max(x, y);
		System.out.println(z);
//		For minimum
		double m=Math.min(x, y);
		System.out.println(m);
		
//		Absolute value
		System.out.println(Math.abs(m));
		
//		Square root function
		System.out.println(Math.sqrt(x));
		
//		Round off
		System.out.println(Math.round(m));
		
//		Ceil---> Rounded Down
		System.out.println(Math.ceil(m));
		
//		Floor---> Rounded Up
		System.out.println(Math.floor(m));
		
//		To Find Hypotenuse
		System.out.println(Math.hypot(x, Math.abs(m)));
		

}
}