package Interface;
interface Drawable{
	void draw(); // abstract method declaration
}
class Circle implements Drawable{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle is drawn!");
	}
	
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable circle = new Circle();
		/* A Circle object is created and assigned to a Drawable reference variable (d). 
		 * This is upcasting, allowing you to treat the Circle object as a generic Drawable.*/
		circle.draw();

	}

}
