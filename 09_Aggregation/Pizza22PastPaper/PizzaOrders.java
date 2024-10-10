package Pizza22PP;

public class PizzaOrders {
	private PizzaShop orderFrom;
	private String[] pizzaSelected;
	private Short totalAmmount;
	private float deliveryTime;
	
	PizzaOrders(PizzaShop orderFrom){
		this.orderFrom = orderFrom;
	}
	public void displayFlavours() {
		orderFrom.displayFlavoursWithPrice();
		
		
	}
	public void makeOrder(String ...pizzaflavors) {
		
		
	}
	public void calculateTotalAmount() {
		
	}
	public void printOrder() {
		
	}
	

}
