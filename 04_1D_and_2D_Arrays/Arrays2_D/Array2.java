package Arrays2_D;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int i=sc.nextInt();
		System.out.print("Enter number of columns : ");
		int j=sc.nextInt();
		
		int arr[][]=new int[i][j];
		
		//for input
		for(int a=0; a<i; a++) {
			for(int b=0; b<j; b++) {
				System.out.print("Enter value for array index["+a+"]["+b+"] : ");
				arr[a][b]=sc.nextInt();
			}
		}
		
//		for output
		for(int a=0; a<i; a++) {
			for(int b=0; b<j; b++) {
				System.out.println("Value at array index["+a+"]["+b+"] is "+arr[a][b]);
			}
		}

	}

}
