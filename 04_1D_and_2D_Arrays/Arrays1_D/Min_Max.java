package Arrays1_D;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14,2,4,3,9,12};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		//we can also assume the first element as smallest as well as largest
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Largest number in array list is : "+max);
		System.out.println("Smallest number in array list is : "+min);
		

	}

}
