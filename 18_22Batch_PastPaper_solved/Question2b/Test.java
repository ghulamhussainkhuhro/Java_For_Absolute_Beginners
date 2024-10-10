package Question2b;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaserPrinter laserPrinter = new LaserPrinter("24Eb", "s8y2021", 23000, (short) 3, "Bluish Powder dust",true , true);
		InkjetPrinter inkjetPrinter = new InkjetPrinter("65YUIOP", "RB2024", 140000, (short)56, "Nano12we");
		
		laserPrinter.print();
		laserPrinter.refill();
		
		inkjetPrinter.print();
		inkjetPrinter.refill();
	}

}
