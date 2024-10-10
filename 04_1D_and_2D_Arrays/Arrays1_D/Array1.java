package Arrays1_D;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java arrays are zero-indexed
		
//		int[] marks=new int[5];
//		int marks[]=new int[5];
		
//		marks[0]=81;
//		marks[1]=91;
//		marks[2]=88;
//		marks[3]=72;
//		marks[4]=88;
		
		int marks[]= {81,91,88,72,88};
		
//		Method--->1 to print arrays elements 
//		System.out.println("Marks of Physics : "+marks[0]);
//		System.out.println("Marks of Calculus : "+marks[1]);
//		System.out.println("Marks of English : "+marks[2]);
//		System.out.println("Marks of ICT : "+marks[3]);
//		System.out.println("Marks of Programing : "+marks[4]);
//		Method--->1 to print arrays elements
		for(int i=0; i<=4; i++) {
			System.out.println(marks[i]);
		}
	}

}
