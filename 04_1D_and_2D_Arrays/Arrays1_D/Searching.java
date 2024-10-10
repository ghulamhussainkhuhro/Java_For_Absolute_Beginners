package Arrays1_D;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]= {10,20,30,40,50};
		System.out.print("Enter number You want to search for : ");
		int num=sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			
			//linear search
			if(arr[i]==num) {
				System.out.println("Number "+num+" found at array index["+i+"].");
			}
		}

	}

}
