package Inheritance4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quadilateral q1 = new Quadilateral(1,2,3,4);
		System.out.println("Area of Quadilateral is "+q1.computeArea());
		
		Square s1  = new Square(4);
		s1.computeArea();
		System.out.println("Area of square is "+s1.computeArea());
		
		Rectangle r1 = new Rectangle(4, 5);
		r1.computeArea();
		System.out.println("Area of Rectangle is "+r1.computeArea());
		
		Quadilateral refvar = s1;
		
		
		

	}

}
