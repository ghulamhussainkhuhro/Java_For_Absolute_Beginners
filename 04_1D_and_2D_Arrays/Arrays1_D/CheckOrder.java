package Arrays1_D;
import java.util.Scanner;

public class CheckOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter SIze of array : ");
				int size=sc.nextInt();
				
				int numbers[]=new int[size];
//				as in C++ arrays elemets are initialized with garbage values but for java null value is stored in array elements
				
//				for input
				for(int i=0; i<size; i++) {
					System.out.print("Enter value for array index["+i+"] : ");
					numbers[i]=sc.nextInt();
				}
				
//				for checking
				boolean isascending=true;
				for(int i=0; i<numbers.length-1; i++) {
					if(numbers[i]>numbers[i+1]) {
						isascending=false;	
						break;
				}
			}
				if(isascending) {
					System.out.println("The array is in ascending order.");
				}
				else {
					System.out.println("The array is not in ascending order.");
				}
		}


	}

