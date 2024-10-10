package ThrowAndThrows;

public class Throw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		int j = 0;
		
		try {
			j = 18/i;
			if(j == 0) {
				throw new ArithmeticException("I don't want value to be zero!");
			}
		}
		catch(ArithmeticException e) {
			j = 18/1;
			System.out.println("That's the default output!" + e);
		}
		catch(Exception e) {
			System.out.println("Something went wrong!");
		}
	}

}
