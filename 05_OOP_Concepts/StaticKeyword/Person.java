package StaticKeyword;

import java.util.*;

public class Person {
	
	private String name;
    private int age;
    private ArrayList<Book> writtenBooks = new ArrayList<Book>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public ArrayList<Book> getWrittenBooks() {
        return writtenBooks;
    }

    public void addWrittenBook(Book book) {
        writtenBooks.add(book);
    }

}


