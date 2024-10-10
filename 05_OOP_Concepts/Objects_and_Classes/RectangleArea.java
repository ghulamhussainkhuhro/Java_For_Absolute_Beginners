package Objects_and_Classes;

import java.util.Scanner;

public class RectangleArea {
	int length;
	int width;
	void setData(int l, int w) {
		length=l;
		width=w;
		
	}
	int getArea(){
		return length*width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		RectangleArea rec1 = new RectangleArea();
		System.out.println("Enter length : ");
		int x = sc.nextInt();
		System.out.println("Enter width : ");
		int y = sc.nextInt();
		rec1.setData(x, y);
		System.out.println("Area of the rectangle is "+rec1.getArea()+" sq:units");

	}

}
