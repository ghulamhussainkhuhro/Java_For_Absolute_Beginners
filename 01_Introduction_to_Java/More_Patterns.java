package Myfirstjavaprogram;

public class More_Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inverted half pyramid rotated at 180 degree :");
		
		int n=4;
		for(int i=1; i<=n; i++) {
//			inner loop to print spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
				
			}
//			inner loop to print stars
			for(int j=1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
