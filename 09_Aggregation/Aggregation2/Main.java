package Aggregation2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine FerrariEngine = new Engine(2000, 3500);
		Car Ferrari = new Car(2020, "Ferrari", FerrariEngine);
		Ferrari.startEngine();

	}

}
