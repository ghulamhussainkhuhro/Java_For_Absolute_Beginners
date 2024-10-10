package Aggregation2;

public class Engine {
	int horsePower;
	int cap;
	public Engine(int horsePower, int cap) {
		this.horsePower = horsePower;
		this.cap = cap;
	}
	public void startEng() {
		System.out.println("Engine started brrr....");
		System.out.println("HorsePower : "+horsePower);
		System.out.println("Capacity : "+cap+" cc");
	}
}
