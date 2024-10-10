package Objects_and_Classes;

import java.util.Scanner;

class Account{
	
	int acNo;
	String acName;
	double ammount;
	
	void setAcNo(int n) {
		this.acNo=n;
	}
	int getAcNo() {
		return acNo;
	}
	void setAcName(String name) {
		this.acName=name;
	}
	String getAcName() {
		return acName;
	}
	void setAmmount(double am) {
		this.ammount=am;
	}
	double getAmmount() {
		return ammount;
	}
	
}

public class BasicBankingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Account a1=new Account();
		int no;
		String name;
		double ammount;
		System.out.println("To create account enter following details : ");
		System.out.print("Enter your name : ");
		name=sc.nextLine();
		System.out.print("Enter account no : ");
		no = sc.nextInt();
		System.out.print("Enter ammount you want to deposit : ");
		ammount = sc.nextDouble();
		a1.setAcName(name);
		a1.setAcNo(no);
		a1.setAmmount(ammount);
		System.out.println("Account Created Successfully!");
		
		char ch;
		do {
			System.out.println("Enter 1 to check balance.");
			System.out.println("Enter 2 to deposit ammount.");
			System.out.println("Enter 3 to withdraw ammount.");
			System.out.println("Enter 4 to see account name.");
			System.out.println("Enter 5 to see account number.");
			int i = sc.nextInt();
			if(i==1) {
				System.out.print("Your ammount is "+a1.ammount);
			}
			else if(i==2) {
				System.out.print("Enter ammount you want to deposit : ");
				ammount=sc.nextDouble();
				a1.ammount+=ammount;
				System.out.println(ammount+"  added successfully!");
			}
			else if(i==3) {
				System.out.print("Enter ammount you want to withdraw : ");
				ammount=sc.nextDouble();
				a1.ammount-=ammount;
				System.out.println(ammount+"  withdrawed successfully!");
			}
			else if(i==4) {
				System.out.print("Your account name is "+a1.acName);
			}
			else if(i==5) {
				System.out.print("Your account number is "+a1.acNo);
			}
			else {
				System.out.println("Please enter a valid choice!");
			}
			System.out.println();
			System.out.println("Do you want to continue...(Press y to continue)");
			ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("Program Ended Successfully.");
	}

}
