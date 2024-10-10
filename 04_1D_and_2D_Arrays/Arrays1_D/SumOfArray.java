package Arrays1_D;

public class SumOfArray {

	    public static void main(String[] args) {
	        int marks[] = {1,2,3,4,5};

	        // Call the calculateSum method with the marks array
	        int sum = calculateSum(marks);

	        // Print the sum
	        System.out.println("Sum of array elements: " + sum);
	    }

	    // Define the calculateSum method outside of the main method
	    public static int calculateSum(int[] arr) {
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        return sum;
	    }
	}
