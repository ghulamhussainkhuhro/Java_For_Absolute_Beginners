package Question2b;

public class InkjetPrinter extends Printer {
	private String cartridgeType;

	public InkjetPrinter(String s, String m, int p, short ppm, String cartridgeType) {
		super(s, m, p, ppm);
		this.cartridgeType = cartridgeType;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Inkjet Printer is printing brrrr...");
		
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		System.out.println("Inkjet printer is being refilled.");
		
	}

}
