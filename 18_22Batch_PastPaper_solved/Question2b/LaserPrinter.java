package Question2b;

public class LaserPrinter extends Printer{
	private String tonerType;
	private Boolean duplexMode;
	private Boolean scanner;

	public LaserPrinter(String s, String m, int p, short ppm,String tonerType, Boolean duplexMode,Boolean scanner ) {
		super(s, m, p, ppm);
		this.tonerType = tonerType;
		this.duplexMode = duplexMode;
		this.scanner = scanner;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Laser Printer is printer shrrrrr....");
		
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		System.out.println("Laser printer is being refilled....");
	}

}
