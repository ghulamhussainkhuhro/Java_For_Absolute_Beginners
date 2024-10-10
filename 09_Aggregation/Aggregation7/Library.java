package Aggregation7;

import java.util.ArrayList;

public class Library {
	private String name;
	private ArrayList<Book> books;
	
	Library(String name){
		this.name = name;
		this.books = new ArrayList<Book>();
	}
	public void addBook(Book book) {
		books.add(book);
	}
	public String getName() {
		return name;
	}
	public void printAvailableBooks() {
		System.out.println("Available books at "+name+" are : ");
		for(Book books : books) {
			System.out.println("Book title : "+books.getTitle()+" Author "+ books.getAuthor());
		}
	}
	
	public boolean searchBook(String title) {
		for(Book books : books) {
			if(books.getTitle().equalsIgnoreCase(title)) {
				System.out.println(title+" is available at "+name);
				return true;
			}
		
		}
		return false;
	}

}
