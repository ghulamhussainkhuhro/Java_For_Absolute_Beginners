package Interface;
interface Shape{
	public void draw();
	public double calculateArea();
}

class Circle1 implements Shape{
	private double radius;
	
	public Circle1(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle is drawn!");
		
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
		
	}
	
}
class Sqaure1 implements Shape{
	private double side;
	public Sqaure1(double side) {
		this.side = side;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square is drawn!");
		
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}
	
}

public class Interface2 {
	public static void main(String[] args) {
		Shape circle = new Circle1(7);
		Shape square = new Sqaure1(5);
		
		circle.draw();
		System.out.println("Area of circle is : "+circle.calculateArea());
		
		square.draw();
		System.out.println("Area of square is : "+square.calculateArea());
		
	}

}
