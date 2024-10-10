package MethodOverloading;

//By changing data type of arguments

public class Approach2 {
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	public static double add(double a, int b) {
		return a+b;
	}
	public static double add(double a, double b, double c) {
		return a+b+c;
	}
	
//	Note We cannot overload methods by changing their return type only
	/*In java, method overloading is not possible by changing 
	 *the return type of the method only because of ambiguity. 
	 *Let's see how ambiguity may occur:

		class Adder{  
		static int add(int a,int b){return a+b;}  
		static double add(int a,int b){return a+b;}  
		}  
		class TestOverloading3{  
		public static void main(String[] args){  
		System.out.println(Adder.add(11,11));//ambiguity  
		}}  
		Compile Time Error: method add(int,int) is already defined in class Adder
		System.out.println(Adder.add(11,11)); 
		Here, how can java determine which sum() method should be called? */		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(3.14, 20));
		System.out.println(add(2, 5));
		System.out.println(add(32.32, 234.3242, 324.4235));
		System.out.println(add(635, 234, 2342));
		

	}

}
