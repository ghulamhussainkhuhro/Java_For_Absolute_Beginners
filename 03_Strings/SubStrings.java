package StringsBasics;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Note : Strings are immutable means once string is created it can never be modified or changed.
		String sentence="My name is Ghulam Hussain";//indexing will be from 0 as that of array indexing
		String name=sentence.substring(11);// ending index is by default taken by the method otherwise we can also use stringname.lenght(); 
		System.out.println(name);
		name=sentence.substring(11, 17);
		System.out.println(name);
		name=sentence.substring(18, sentence.length());
		System.out.println(name);
		name=sentence.substring(0, 7);
		System.out.println(name);
		
		

	}

}
