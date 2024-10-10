package StaticKeyword;
class Mobile1{
	//static variable is shared by all objects at once
	String brand;//instance or non-static variable
	int price;//instance or non-static variable
	static String name;//class or static variable
	
	//instance or non-static method
	public void showData() { 
		System.out.println(brand+" : "+price+" : "+name);
	}
	//static or class method
	public static void showdata1(Mobile1 obj) {
		System.out.println("In Static method.");
//		System.out.println(brand+" : "+price+" : "+name);
//		we cannot use a non static variable in a static method
//		to do so we have to pass the object as a parameter in static method
		System.out.println(obj.brand+" : "+obj.price+" : "+name);
		
	}
	
}

public class StaticMethod {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
//				static variables should be called with class name not object but we can call it through object as well but it will show warning : The static field Mobile.name should be accessed in a static way
				Mobile1 obj1 = new Mobile1();
				obj1.brand="Apple";
				obj1.price=1200;
				Mobile1.name="Smartphone";
				Mobile1 obj2 = new Mobile1();
				obj2.brand="Samsung";
				obj2.price=800;
				Mobile1.name="Smartphone";
//				we cannot call nonstatic method or variable through class 
//				it will generate error : Cannot make a static reference to the non-static method showData() from the type Mobile
//				Mobile1.showData();
				
//				we can call static method or variable through class
				Mobile1.showdata1(obj1);
				Mobile1.showdata1(obj2);
//				that is the reason why main is static if it was not 
//				then we had to create an object to iterate through main 
//				but main is the starting point of program before start of a program 
//				how could we create an object thats why main is static
//				
			}
	
	}

