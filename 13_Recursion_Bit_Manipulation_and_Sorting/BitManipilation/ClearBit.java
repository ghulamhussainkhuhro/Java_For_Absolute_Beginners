package BitManipilation;

public class ClearBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Clear the 3rd bit(position =2) of a number n say 5 i.e 0101
//		Operation : AND with NOT i.e newNumber=(~bitMask & number);
		int n=5;//0101
		int position=2;
		int bitMask=1<<position; //0100
		int notBitMask=~(bitMask);//1011
		int newNumber=notBitMask & n; //1011 & 0101 = 0001 = 1 in decimal
		System.out.println("Number before clearing its 3rd bit (to 0) : "+n);
		System.out.println("Number after clearing its 3rd bit (to 0) : "+newNumber);
		

	}

}
