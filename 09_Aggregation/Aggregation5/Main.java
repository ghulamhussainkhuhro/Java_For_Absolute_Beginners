package Aggregation5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1 = new Author("Amy Morin");
		Book b1 = new Book("13 Things Mentally Strong people dont do!", a1);
		b1.displayInfo();
		Author a2 = new Author("Shiv Khera");
		b1.setBook("Who will cry when you die");
		b1.setAuthor(a2);
		b1.displayInfo();
		

	}

}
