package JavaException1;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num  = 11;
		try {
			if(num%2==0) {
				int result = num/0;
			}
			else {
				String str = null;
				System.out.println(str.length());
			}
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			catch(NullPointerException npe){
				System.out.println(npe.getMessage());
			}
			/*if you will put this catch block at the top of above two it will generate an error 
			because main Exception can handle all types of exception why try will throw any exception
			it will catch it then other two exceptions will be of no use*/
			catch(Exception e) {
				System.out.println("Unknown exeption");
			}
			finally {
				System.out.println("This Statement will always execute.");
			}
		}

	}


