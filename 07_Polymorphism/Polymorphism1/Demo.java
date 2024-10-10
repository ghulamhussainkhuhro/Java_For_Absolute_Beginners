package Polymorphism1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat1 = new Boat();
		
//		Car[] racers = {car1, bicycle, b1}; //It will generate error
//		These all are different instances of different classes so cannot be stored in a Array
//		but they are extending Vehicle class that's why they all can be treated as Vehicle
		
//		So this approach is ok 
		Vehicle[] racers = {car1, bicycle, boat1};
		
		for(Vehicle x : racers) {
			x.go();
		}
		
		
		
		
		

	}

}
