package Arraylist;

import java.util.ArrayList;

class Book{
	String name;
	String author;
	String publisher;
	double price;
	int pages;
	
	Book(String name, String author, String publisher, double price, int pages){
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.pages = pages;
		this.price = price;
		
		
	}
	
}

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> book = new ArrayList<Book>();
		Book b1 = new Book("ABC","Sarmad","V8 Publishers",564.54,211);
		Book b2 = new Book("DEF","GHk","V9 Publishers",5682.54,431);
		Book b3 = new Book("GHI","Abbass","V10 Publishers",56194.54,111);
		Book b4 = new Book("JKL","Wajid","V11 Publishers",53264.54,234);
		Book b5 = new Book("ABC","Mehdi","V12 Publishers",5324.54,2121);
//		Adding instances in ArrayList(Book)
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		book.add(b5);
		int i=1;
		for(Book b : book) {
			System.out.println("Book "+i+" : ");
			System.out.println("--> Name : "+b.name);
			System.out.println("--> Author : "+b.author);
			System.out.println("--> Publisher : "+b.publisher);
			System.out.println("--> Price : "+b.price);
			System.out.println("--> Pages : "+b.pages);
			i++;
		}
		
	}

}
