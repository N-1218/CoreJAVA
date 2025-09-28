package Array;

import java.util.Arrays;

public class decending {

    public static void main(String[] args) {
        int arr[] = {12, 3, 5, 3, 22, 5, 6, 9};

        // Corrected nested loops for bubble sort in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // To sort in descending order, swap if the left element is smaller than the right
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));
    }
}
