package Interface;
interface Shape1 {
    void draw();
//   double getArea(); // Another abstract method
}

class Rectangle implements Shape1 {
	private int length;
	private int width;
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
//  @Override un-commenting this will lead to an error : The method getArea() of type Rectangle must override or implement a supertype method
    public double getArea() {
        // Implementation for calculating rectangle area
    	return length*width;
    }
}

public class Interface3 {
    public static void main(String[] args) {
        Shape1 s = new Rectangle(4,5);
        s.draw();
//      s.getArea(); // Can't call this directly without casting to Rectangle
        //Error: The method getArea() is undefined for the type Shape1
        ((Rectangle) s).getArea();
    }
}
