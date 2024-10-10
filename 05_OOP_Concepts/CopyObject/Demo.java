package CopyObject;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("GLI", "Toyota", 2013);
		Car car2 = new Car("Mehran", "Suzuki", 2011);
		
		System.out.println(car1.getName()+"  "+car1.getMake()+"  "+car1.getModel());
		System.out.println(car2.getName()+"  "+car2.getMake()+"  "+car2.getModel());
		System.out.println("car1 address : "+car1.hashCode());
		System.out.println("car2 address : "+car2.hashCode());
		
//		Incorrect approach
//		now to make car2 a copy of car1 this approach is wrong
//		car1 = car2;
//		because there will be only one object and both will refer to same address in memory
//		even if all the attributes will be copied

		car2 = car1;
		System.out.println(car1.getName()+"  "+car1.getMake()+"  "+car1.getModel());
		System.out.println(car2.getName()+"  "+car2.getMake()+"  "+car2.getModel());
		System.out.println("car1 address : "+car1.hashCode());
		System.out.println("car2 address : "+car2.hashCode());
		
		Car car3 = new Car(car1); 
		System.out.println(car1.getName()+"  "+car1.getMake()+"  "+car1.getModel());
		System.out.println(car3.getName()+"  "+car3.getMake()+"  "+car3.getModel());
		System.out.println("car1 address : "+car1.hashCode());
		System.out.println("car2 address : "+car2.hashCode());
		System.out.println("car3 address : "+car3.hashCode());
		
		
		
		

	}

}
