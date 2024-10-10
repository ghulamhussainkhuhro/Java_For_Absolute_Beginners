package Myfirstjavaprogram;

public class ManyVariablesInForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even : Odd");
		for(int i=0,j=1; i<=20; i+=2,j+=2) {
			if(i<10&&j<10) {
				System.out.println(i+"       "+j);	
			}
			else {
				System.out.println(i+"      "+j);
			}
//			similarly we can use more than 2 initializers at a time
			
		}

	}

}
