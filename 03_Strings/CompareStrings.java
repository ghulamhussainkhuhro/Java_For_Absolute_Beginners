package StringsBasics;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Compare Strings
		String s1="Ghulam";
		String s2="Ghulam";
		
//		the function string1.compareTo(string2) returns :
//			1--> +ve value if string1 > string2;
//			2--> -ve value if string1 < string2;
//			3-->    0      if string1 == string2;
//		how is this done lets see : 
//			hello>bello because h>b
//			hello<sello because h<s
//			aahello<bbhello because a<b
		
		
		if(s1.compareTo(s2)==0){
			System.out.println("Both Stings are equal.");
		}
		else {
			System.out.println("Strings are not equal.");
		}
//		we could have also compared both strings by eqality operator '==' 
//		but this method fails in some conditions thats why we use compareTo() method
		
	}

}
