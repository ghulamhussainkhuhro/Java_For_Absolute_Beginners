package OOPBasics;

import java.util.Scanner;

public class Table2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number you want to print table of : ");
		int tab = sc.nextInt();
		System.out.print("Enter number you want to print table to : ");
		int tabto = sc.nextInt();
		for(int i=0; i<tabto; i++) {
			System.out.println(tab+" * "+(i+1)+" = "+(i+1)*tab);
		}
	}

}
