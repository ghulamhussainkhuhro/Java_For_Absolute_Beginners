package Aggregation1;
class Operation{
	public int square(int a) {
		return a*a;
	}
}
class AreaOfCircle{
	Operation op;
	double pi = 3.14;
	public double area(int a) {
	op = new Operation();
	int rSquare = op.square(a);
		return pi*rSquare;
	}
	}
	
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle aoc = new AreaOfCircle();
		System.out.println(aoc.area(12));

	}

}
