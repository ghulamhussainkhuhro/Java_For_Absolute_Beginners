package Inheritance4;

public class Square extends Quadilateral {
	
	public Square(double s1){
		super(s1,s1,s1,s1);
	}
	
	public double computeArea() {
		return (s1 * s1);
	}

}
