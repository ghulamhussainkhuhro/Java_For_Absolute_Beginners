package Aggregation4;

public class Engine {
	private String Ename;
	Engine(String n){
		Ename=n;
	}
	void setName(String n) {
		Ename=n;
	}
	void getName() {
		System.out.println(Ename);
	}
}
