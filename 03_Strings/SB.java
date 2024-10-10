package StringsBasics;

public class SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbuilder = new StringBuilder();
		System.out.println("Initial capacity of StringBuilder : "+sbuilder.capacity());
		StringBuilder sb = new StringBuilder("Ghulam"); // Initial capacity: 16 + 6 = 22
		System.out.println("1-->" + sb); // Output: Ghulam

		System.out.println("Charcter at index 0 :" + sb.charAt(0)); // Doesn't change capacity
		sb.setCharAt(1, 'H'); // Replaces character, doesn't change capacity
//				Replacing character at index i with another character
		System.out.println("2-->" + sb); // Output: GHulam (modified)

//				adding a character
		sb.insert(0, 'G'); // Increases length (1), capacity remains 22 (not exceeded)
		System.out.println("3-->" + sb); // Output: GGHulam

		sb.insert(3, 'K'); // Increases length (2), capacity remains 22 (not exceeded)
		System.out.println("4-->" + sb); // Output: GGHKulam

//				deleting characters
		sb.delete(4, sb.length()); // Removes characters, capacity doesn't shrink
		System.out.println("5-->" + sb); // Output: GGHK

		sb.delete(0, 1); // Removes first character, capacity doesn't shrink
		System.out.println("6-->" + sb); // Output: GHK

		System.out.println("7--> Capacity of StringBuilder : " + sb.capacity()); // Still 22

//		Adding new letters at the end of string
		StringBuilder sb1=new StringBuilder("H");
		sb1.append("e");
		sb1.append("l");
		sb1.append("l");
		sb1.append("o");
		sb1.append(" ");
		sb1.append("World");
		System.out.println(sb1);
		System.out.println(sb1.length());
//		set length
		sb1.setLength(20);
		System.out.println(sb1);
		
//		we cannot diectly assign value from StringBuilder to String
//		Error: Type mismatch: cannot convert from StringBuilder to String
		
		String str = sb1.toString();
		System.out.println(str);
//		Note : there is only one difference between StringBuilder and StringBuffer StringBuffer is thread save and StringBuilder is not
//		thread concept will be discussed soon
	}

}
