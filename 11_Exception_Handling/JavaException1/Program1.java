package JavaException1;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Till now exception is not there...");
		try {
			int except = 100/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code after exception");

	}

}
