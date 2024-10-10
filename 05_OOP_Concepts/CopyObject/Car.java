package CopyObject;

public class Car {
	String name;
	String make;
	int model;
	
	public Car(String name, String make, int model) {
		this.name = name;
		this.make = make;
		this.model = model;
	}
	
	public Car(Car x) {
		this.copy(x);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(int model) {
		this.model = model;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMake() {
		return make;
	}

	public int getModel() {
		return model;
	}
	
//	Copy method
	
	public void copy(Car x) {
		this.setName(x.getName());
		this.setMake(x.getMake());
		this.setModel(x.getModel());
	}
	


}
