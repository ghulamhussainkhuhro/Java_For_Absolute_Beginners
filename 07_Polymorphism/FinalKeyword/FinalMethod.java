package FinalKeyword;
class Calculator{
	public final void madyBy() { // final ,ethod cannot be overridden
		System.out.println("This calculator is made by : Ghulam Hussain");
	}
	
	public void add(int a, int b) {
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
	}
}
class AdvanceCalculator extends Calculator{
//	this will generate CTE : Cannot override the final method from Calculator
	
//	public final void madyBy() {
//		System.out.println("This calculator is made by : Muhammad Achar");
//	}
	
	
//	Now Muhammad Achar cannot take credit of Ghulam Hussain of making calculator 
}

public class FinalMethod {
	public static void main(String[] args) {
		AdvanceCalculator ac = new AdvanceCalculator();
		ac.add(15, 20);
		ac.madyBy();
	}

}
