package Lab4;

import java.util.ArrayList;

public class Person {
	ArrayList <Book>b1;
	int age;
	String name;
	Book book;
	
	Person(int a, String n){
		age = a;
		name = n;
		
	}
	public void addBook(Book book) {
		this.book= book;
	}
	public void diplayData() {
		System.out.println(age + "  "+ name+"  "+ book.book_name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
