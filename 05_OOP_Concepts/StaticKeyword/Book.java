package StaticKeyword;

import java.util.*;

public class Book {
	 private String name;
    private String publisher;
    private ArrayList<Person> authors = new ArrayList<Person>();

    public Book(String name, String publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public ArrayList<Person> getAuthors() {
        return authors;
    }

    public void addAuthor(Person author) {
        authors.add(author);
        author.addWrittenBook(this); // Add this book to the person's authored list
    }
}
