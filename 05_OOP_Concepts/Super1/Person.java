package Super1;

public class Person {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name+"\n"+this.age+"\n";
	}

}
