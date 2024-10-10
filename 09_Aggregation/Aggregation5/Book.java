package Aggregation5;

public class Book {
	private String book;
	private Author author;
	Book(String book , Author author){
		this.book = book;
		this.author = author;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getBook(String book) {
	 return book;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Author getAuthor() {
	 return author;
	}
	public void displayInfo() {
		System.out.println("Book title : "+book);
		System.out.println("Author name : "+author.getName());
	}

}
