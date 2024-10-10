package Inheritance4;

public class Rectangle extends Quadilateral {
	
	public Rectangle(double s1, double s2){
		super(s1,s2,s1,s2);
	}
	
	public double computeArea() {
		return (s1 * s2);
	}

}
