package Inheritance;

public class ScientifiCalc extends AdvCalc { // ScientifiCalc IS-A AdvCalc IS-A Calc (Multilevel Inheritance)
	public double power(int a, int b) {
		return Math.pow(a, b);
	}

}
