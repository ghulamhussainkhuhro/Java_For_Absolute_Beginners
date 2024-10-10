package StaticKeyword;
class Mobile{
	//static variable is shared by all objects at once
	String brand;//instance or non-static variable
	int price;//instance or non-static variable
	static String name;//class or static variable
	public void showData() {
		System.out.println(brand+" : "+price+" : "+name);
	}
}

public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		static variables should be called with class name not object but we can call it through object as well but it will show warning : The static field Mobile.name should be accessed in a static way
		Mobile obj1 = new Mobile();
		obj1.brand="Apple";
		obj1.price=1200;
		Mobile.name="Smartphone";
		Mobile obj2 = new Mobile();
		obj2.brand="Samsung";
		obj2.price=800;
		Mobile.name="Smartphone";
		obj1.showData();
		obj2.showData();
		Mobile.name="Phone";
		obj1.showData();
		obj2.showData();
//		See here we are changing only name of obj1 but due to its static nature it is changed for all objects
		
		

	}

}
