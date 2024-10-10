import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int countZero=0;
		int countPositive=0;
		int countNegative=0;
		
		char i;
		do {
			System.out.println("Enter a number : ");
			a=sc.nextInt();
			if(a<0) {
				countNegative++;	
			}
			else if(a>0) {
				countPositive++;
			}
			else {
				countZero++;
			}
			System.out.println("Do you want to continue? (Y/N)");
			 i = sc.next().charAt(0);
	
		}while(i=='y'||i=='Y');
		System.out.println("You entered "+countPositive+" positive numbers.");
		System.out.println("You entered "+countNegative+" negative numbers.");
		System.out.println("You entered "+countZero+" zeros.");
	}

}
