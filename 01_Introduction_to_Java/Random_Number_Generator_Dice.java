package Myfirstjavaprogram;
import java.util.Random;
public class Random_Number_Generator_Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int x = random.nextInt(6)+1;
//		it will generate random numbers between -ve 2 billion to +ve 2 billion if there is no any parameter but giving it a number will set its range from 0 to parameter-1.
		System.out.println(x);

//		To generate a random double value 
	
		double y = random.nextDouble();
		System.out.println(y);
//		It will generate numbers between 0 and 1.
	

//		To generate a random boolean value

		boolean z = random.nextBoolean();
		System.out.println(z);
		
	}

}
