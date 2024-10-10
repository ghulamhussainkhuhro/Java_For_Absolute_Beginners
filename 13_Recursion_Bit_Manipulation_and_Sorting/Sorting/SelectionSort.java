package Sorting;

public class SelectionSort {
    // Utility method to print the elements of an array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Initialize an array
        int arr[] = { 7, 8, 3, 1, 2 };

        System.out.println("Before sorting : ");
        // Print the array before sorting
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Selection Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the current index is the smallest
            int smallest = i;

            // Find the index of the smallest element in the unsorted part of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            // Swap the smallest element with the first element in the unsorted part
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After sorting : ");
        // Print the array after sorting
        printArray(arr);
    }
}
