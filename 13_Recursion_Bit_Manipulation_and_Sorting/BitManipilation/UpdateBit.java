package BitManipilation;

import java.util.Scanner;

public class UpdateBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Update the 2nd bit(position=1) of a number n say 5(0101) to 1
//		N.B-->for 0(to update the (i+1)th bit to 0):
//		In this case we will use clear operation
//			bitMask : 1<<i
//			Operation : AND with NOT i.e newNumber=(~bitMask & number);
//		N.B-->for 1(to update the (i+1)th bit to 1):
//		In this case we will use set operation
//			bitMask : 1<<i
//			Operation : bitMask | givenNUmber
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 0  to convert the 2nd bit to 0 and 1 to convert the 2nd bit to 1 : ");
		int operation=sc.nextInt();
//		if operation=1 : set operation if operation = 0 clear operation
		
		int n=5;
		int position=1;
		int bitMask=1<<position;
		if(operation==1) {
			int newNumber = bitMask | n;
			System.out.println("New number : "+newNumber);
		}
		else {
			int notBitMask=~(bitMask);
			int newNumber = notBitMask & n;
			System.out.println("New number : "+newNumber);
		}
		
		

	}

}
