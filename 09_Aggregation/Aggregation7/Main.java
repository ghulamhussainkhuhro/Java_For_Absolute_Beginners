package Aggregation7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library muetCL = new Library("MUET CL");
		Book b1 = new Book("ABC", "Sarmad");
		Book b2 = new Book("def", "Zain");
		Book b3 = new Book("GhI", "Mehdi");
		
		muetCL.addBook(b1);
		muetCL.addBook(b2);
		muetCL.addBook(b3);
		
		System.out.println("Name of Library is "+muetCL.getName());
		
		muetCL.printAvailableBooks();
		
		muetCL.searchBook("aBc");
	}

}
