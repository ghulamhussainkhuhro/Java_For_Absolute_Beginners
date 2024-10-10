package Question2a;

public class Fastfood implements Restaurant{
	String resName;
	String resLocation;
	String[] foodItems = {"Zinger Cheese Burger","Masala Fries"};
	int[] price= {400,220};
	
	public Fastfood(String resName, String resLocation) {
		this.resName = resName;
		this.resLocation = resLocation;
		
	}

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cookFood(String dish) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String deliver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String serve() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generateBill() {
		// TODO Auto-generated method stub
		
	}

}
