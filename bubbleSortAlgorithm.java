package mountainArraySolution;

import java.util.Arrays;

public class bubbleSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1}; // Using a unsorted array to demonstrate the sort
        bubble(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]
    }

    static void bubble(int[] arr){
        boolean swapped;
        // Outer loop for the number of passes
        for (int i = 0; i < arr.length; i++){
            swapped = false; // Reset swapped flag for each pass
            // Inner loop for comparison and swapping
            for (int j = 1; j < arr.length - i; j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // If no swaps occurred in a pass, the array is sorted
            if (!swapped){
                break;
            }
        }
    }
}