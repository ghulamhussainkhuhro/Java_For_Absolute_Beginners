package Arrays1_D;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String names[]=new String[3];
//		takes input
		for(int i=0; i<names.length; i++) {
			System.out.print("Enter name of student "+i+" : ");
			names[i]=sc.nextLine();
		}
//		prints output
		for(int i=0; i<names.length; i++) {
			System.out.println("Name of student "+i+" : "+names[i]);
		}
	}

}
