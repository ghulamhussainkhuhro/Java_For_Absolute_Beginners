package Arrays1_D;

public class ItrationThroughForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[4];
		arr[0]=1;
		arr[1]=3;
		arr[2]=5;
		arr[3]=7;
		//method:1--> using for loop
		System.out.println("Using for loop : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//method:1--> using for each loop or enhanced for loop
		System.out.println("Using for each loop : ");
		for(int n : arr) {
			System.out.println(n);
		}
	}

}
