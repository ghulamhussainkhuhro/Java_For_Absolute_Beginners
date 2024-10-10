package Question2a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desi res1 = new Desi("Quetta restaurant","Station Road");
		Fastfood res2 = new Fastfood("Mirchi 360", "Society Phase1");
		
		res1.showMenu();
		res1.cookFood(null);
		res1.serve();
		res1.deliver();
		res1.generateBill();
		
		res2.showMenu();
		res2.cookFood(null);
		res2.serve();
		res2.deliver();
		res2.generateBill();


	}

}
