package Question2b;

public abstract class Printer {
	protected String serial;
	protected String model;
	protected int price;
	protected short ppm;
	
	public Printer(String s, String m, int p, short ppm) {
		serial = s;
		model = m;
		price = p;
		this.ppm = ppm;
	}
	
	
	public abstract void print();
	public abstract void refill();
}
