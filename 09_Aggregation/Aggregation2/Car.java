package Aggregation2;

public class Car {
	int model;
	String name;
	Engine engine;
	public Car(int model, String name,Engine engine) {
		this.model = model;
		this.name = name;
		this.engine = engine;
	}
	public void startEngine() {
		engine.startEng();
		System.out.println("Engine of "+name+" of model "+model+" successfully started.");
	}
	
}
