package FinalKeyword;

public class FInalVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("Value of a is : "+a);
		a = 20;
		System.out.println("Updated value of a is : "+a);
		
		// final variable can never be reassigned
		
		final int b = 10;
		System.out.println("Value of b is : "+b+" and can never be changed!");
//		b = 20; 
//		Compile time error : The final local variable b cannot be assigned. 
//		It must be blank and not using a compound assignment
//		System.out.println("Updated value of a is : "+b);

	}

}
