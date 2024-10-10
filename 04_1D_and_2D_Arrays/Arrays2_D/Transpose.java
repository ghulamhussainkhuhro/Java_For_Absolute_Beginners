package Arrays2_D;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int rows=sc.nextInt();
		System.out.print("Enter number of columns : ");
		int cols=sc.nextInt();
		
		int arr[][]=new int[rows][cols];
		
		//for input
		for(int a=0; a<rows; a++) {
			for(int b=0; b<cols; b++) {
				System.out.print("Enter value for array index["+a+"]["+b+"] : ");
				arr[a][b]=sc.nextInt();
			}
		}
		System.out.println("Array is created succefully!");
		System.out.println("Matrix Entered is : ");
		for(int a=0; a<rows; a++) {
			for(int b=0; b<cols; b++) {
				System.out.print(arr[a][b]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose matrix is given by : ");
		
		for(int a=0; a<cols; a++) {
			for(int b=0; b<rows; b++) {
				System.out.print(arr[b][a]+" ");
			}
			System.out.println();
		}

		sc.close();
	}

}
