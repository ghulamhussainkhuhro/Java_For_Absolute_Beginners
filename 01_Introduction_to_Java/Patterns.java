package Myfirstjavaprogram;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Print Rectangle
		System.out.println("Rectangular pattern with 4 rows and 5 columns.");
		int i,j;
		int n=4;
		int m = 5;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		left Triangle
		System.out.println("Left Half Pyramid");
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Hollow Rectangle : ");
		for(i=1;i<=n;i++) {
			for(j=1;j<=m;j++) {
				if(i==1||i==n||j==1||j==m) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Inverted Half Pyramid:");
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
