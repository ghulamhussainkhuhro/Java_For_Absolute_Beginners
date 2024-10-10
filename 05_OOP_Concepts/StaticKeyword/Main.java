package StaticKeyword;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();

        
        Person ayan = new Person("Ayan", 18);
        persons.add(ayan);

        
        Book b1 = new Book("HP1", "WB");
        Book b2 = new Book("HP2", "WB");
        Book b3 = new Book("HP3", "WB");
        books.add(b1);
        books.add(b2);
        books.add(b3);

        // Add a book to Ayan's written books
        ayan.addWrittenBook(b1);

        // Create another person Zain
        Person zain = new Person("Zain", 18);
        persons.add(zain);

        // Print information using ArrayLists
        for (Person person : persons) {
            System.out.println("Person Name: " + person.getName() + ", Age: " + person.getAge());
            System.out.println("Books written by " + person.getName() + ":");
            ArrayList<Book> writtenBooks = person.getWrittenBooks();
            for (Book book : writtenBooks) {
                System.out.println("Book Name: " + book.getName() + ", Publisher: " + book.getPublisher());
            }
            System.out.println();
        }
    }
}
