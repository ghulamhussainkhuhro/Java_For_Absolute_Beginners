package Abstraction;
abstract class Shape {
	public abstract double claculateArea();
	public abstract double claculatePerimeter();
}

class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		System.out.println("Circle with radius "+radius+" created!");
	}

	@Override
	public double claculateArea() {
		return Math.PI*radius*radius;
	}
	
	@Override
	public double claculatePerimeter() {
		return 2*Math.PI*radius;
	}
	
}

class Square extends Shape {
	private double side;
	
	public Square(double side) {
		this.side = side;
		System.out.println("Square with sides "+side+" created!");
	}
	
	@Override
	public double claculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double claculatePerimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}
	
}
public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		We cannot create object of abstract class
//		Shape obj = new Shape();  this will create error: Cannot instantiate the type A
		
		Shape circle = new Circle(8.9);
		Shape square = new Square(7.4);
		
		System.out.println("Area of circle is "+circle.claculateArea());
		System.out.println("Perimeter/Circumference of circle is "+circle.claculatePerimeter());
		System.out.println("Area of square is "+square.claculateArea());
		System.out.println("Perimeter of square is "+square.claculatePerimeter());
	}

}
