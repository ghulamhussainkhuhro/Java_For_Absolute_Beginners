package ThrowAndThrows;
class MyException extends Exception{

	public MyException(String string) {
		super(string);
	}

}

public class ThrowCustomExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		int j = 0;
		
		try {
			j = 18/i;
			if(j == 0) {
				throw new MyException("I don't want value to be zero!");
			}
		}
		catch(MyException e) {
			j = 18/1;
			System.out.println("That's the default output!" + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Something went wrong!");
		}
	}

}
