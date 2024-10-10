package Encapsulation;
class MyData{
	private String name;
	private int age;
//	we cannot directly access these instance variables because they are private these are only accessiblr in class
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
//	IDE can also create getters and setters for you just right click go to source and then click generate getters and setters 
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData Me = new MyData();
		Me.setName("Ghulam Hussain");
		Me.setAge(19);
		System.out.println("My name is "+Me.getName());
		System.out.println("I am "+Me.getAge());

	}

}
