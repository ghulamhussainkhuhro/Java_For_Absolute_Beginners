package Abstraction;
interface Calculator{

	public int add(int a,int b);
	public int subtract(int a,int b);
	public int multiply(int a,int b);
	public int divide(int a,int b);
}
class Casio implements Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	public double getPercentage(int marksObtained, int totalMarks) {
		return (marksObtained*100/totalMarks);
		
	}
	
}
class TemperatureCalculator extends Casio{
//	celcius to fahernhiet vice versa
	
}
public class Abstraction4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator casio = new Casio();
		System.out.println("Addition : "+casio.add(10, 30));
		System.out.println("Subtraction : "+casio.subtract(10, 30));
		System.out.println("Multiplication : "+casio.multiply(10, 30));
		System.out.println("Divide : "+casio.divide(10, 30));
		//interface can extend interface only
		// finaly cannot be extended--> In this class 
		//Can we declare attributes in main methods
		System.out.println("Percentage : "+((Casio) casio).getPercentage(775, 850));
		

	}

}
