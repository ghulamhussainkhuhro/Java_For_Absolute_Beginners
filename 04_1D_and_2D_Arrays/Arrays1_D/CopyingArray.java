package Arrays1_D;

import java.util.Arrays;

public class CopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,2,1,3};
		int copy1[]=arr;
		
		
		int copy2[]= Arrays.copyOf(arr, arr.length);
		
		Arrays.sort(arr);
		System.out.println("Original array after sorting");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		System.out.println("Array copied through == operator");
		for(int i=0; i<copy1.length;i++) {
			System.out.print(copy1[i]+"  ");
		}
		System.out.println();
		System.out.println("Array copied through copyof()");
		for(int i=0; i<copy2.length;i++) {
			System.out.print(copy2[i]+"  ");
		}

	}

}
