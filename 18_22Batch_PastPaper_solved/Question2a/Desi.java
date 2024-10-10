package Question2a;

public class Desi implements Restaurant{
	String resName;
	String resLocation;
	String[] foodItems = {"karahi","Beef Pulao"};
	int[] price = {1500,700};
	public Desi(String resName, String resLocation) {
		this.resName = resName;
		this.resLocation = resLocation;
		
	}

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		for(String x:foodItems) {
			System.out.println(x);
		}
		
	}

	@Override
	public void cookFood(String dish) {
		// TODO Auto-generated method stub
		System.out.println(dish+" is being cooked!");
		
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
