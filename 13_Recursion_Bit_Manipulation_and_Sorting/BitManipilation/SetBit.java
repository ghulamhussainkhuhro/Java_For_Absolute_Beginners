package BitManipilation;

public class SetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set the 2nd bit(position = 1) of a number say 5 i.e 0101
//		operation : bitMask | givenNumber
		int n=5;//0101
		int position=1;
		int bitMask=1<<position;//0010
		int newNumber=bitMask | n;// 0010 | 0101 = 0111 = 7 in decimal
		System.out.println("Number before setting 2nd bit to 1 : "+n);
		System.out.println("Number after setting 2nd bit to 1 : "+newNumber);

	}

}
