package Inheritance;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScientifiCalc ac = new ScientifiCalc();
		int r1 = ac.add(3, 4);
		int r2 = ac.sub(3, 4);
		int r3 = ac.multi(3, 4);
		int r4 = ac.div(3, 4);
		double r5 = ac.power(3, 4);
		System.out.println("Sum : " + r1);
		System.out.println("Difference : " + r2);
		System.out.println("Product : " + r3);
		System.out.println("Qoutient : " + r4);
		System.out.println("Power : "+ r5);
		
	}

}
