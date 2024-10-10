package ThrowAndThrows;

public class Throw1 {
	public static void checkElegibility(int age) {
		
			if(age < 18) {
				throw new ArithmeticException("Not eligible to vote!");
			}
			else {
				System.out.println("You are eligible to vote");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkElegibility(18); // this will be printed
		checkElegibility(2);  // this will not be printed
		checkElegibility(20); // this will not be printed
		
	}

}
