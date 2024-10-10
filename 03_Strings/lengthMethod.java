package StringsBasics;

public class lengthMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname="Ghulam";
		String lname="Hussain";
		String fullname=fname+" "+lname;
		System.out.println("Your full name is "+fullname+".");
		System.out.println("Length of your full name is "+fullname.length());
		System.out.println("Characters in full name : ");
		for(int i=0; i<fullname.length(); i++) {
			System.out.print(fullname.charAt(i)+"  ");
		}
		System.out.println("Character at position 6 is : "+fullname.charAt(5));//because indexing is from zero
	}

}
