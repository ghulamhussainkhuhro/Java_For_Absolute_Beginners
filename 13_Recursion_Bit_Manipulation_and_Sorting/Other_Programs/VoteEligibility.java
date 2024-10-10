import java.util.Scanner;

public class VoteEligibility {
public static void voteCheck(int a) {
	if(a>=18) {
		System.out.println("You are eligible to vote.");
	}
	else {
		System.out.println("You are not eligible to vote.");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age : ");
		int a=sc.nextInt();
		voteCheck(a);

	}

}
