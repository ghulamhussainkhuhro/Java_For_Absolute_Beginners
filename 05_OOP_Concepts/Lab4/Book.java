package Lab4;

import java.util.ArrayList;

public class Book {
	ArrayList <Person>p1;
	String book_name;
	String publisher;
	Person author;
	
	Book(String book, String pub , Person auth ){
		 book_name = book;
		 publisher = pub;
		 author = auth;
	}
	public void displayData() {
		System.out.println(book_name+"  "+publisher+"  "+author);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
