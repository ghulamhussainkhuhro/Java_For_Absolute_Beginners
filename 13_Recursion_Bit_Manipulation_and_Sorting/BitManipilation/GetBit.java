package BitManipilation;

public class GetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      get bit:
//		Get the 3rd bit(position=2) of a number n say 5 i.e 0101 
//		to get the bit we use logical and &
//		operation : bitMask & givenNumber
		
		
		int n=5;//0101
		int position=2;
		int bitMask1=1<<position;//0100
		
//		position indexing will start from 0 on the right size
//		if position=0; --> Bit was one
//		if position=1; --> Bit was zero
//		if position=2; --> Bit was one
//		if position=3; --> Bit was zero
		
		if((bitMask1 & n)==0) {
//			0100 & 0101 =0100 which is not equal to zero so if-condition will not be true else condition will be printed 
			System.out.println("Bit was zero.");
		}
		else {
			System.out.println("Bit was one.");
		}
		
	}

}
