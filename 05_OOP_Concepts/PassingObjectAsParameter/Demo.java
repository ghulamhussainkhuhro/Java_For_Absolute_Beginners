package PassingObjectAsParameter;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garrage garrage = new Garrage();
		
		Car car1 = new Car("Mehran");
		Car car2 = new Car("Ferrari");
		
		garrage.park(car1);
		garrage.park(car2);
	
				

	}

}
