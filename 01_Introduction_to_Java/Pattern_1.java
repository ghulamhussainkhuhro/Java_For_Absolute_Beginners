package Myfirstjavaprogram;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("Pattern 1 :");
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Pattern 2 : ");
		System.out.println("Method 1 : ");
		for(int i=n; i>=1; i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Method 2 : ");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		int m=1;
		System.out.println("Pattern 3 : Floyd's Triangle");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
			
		}
		int b=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if((i+j)%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		

	}

}
