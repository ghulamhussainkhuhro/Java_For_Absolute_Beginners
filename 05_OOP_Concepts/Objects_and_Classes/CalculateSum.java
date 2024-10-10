package Objects_and_Classes;
class FindSum{
	
	int calculateSum(int x, int y) {
		return x+y;
	}
	int calculateSum(int x, int y, int z) {
		return x+y+z;
	}
	double calculateSum(double w ,double x, double y, double z) {
		return w+x+y+z;
	}
	
}

public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSum s1 = new FindSum();
		System.out.println(s1.calculateSum(10, 20));
		System.out.println(s1.calculateSum(10, 20, 30));
		System.out.println(s1.calculateSum(2.34, 651.55, 728.27, 383.3651));
		

	}

}
