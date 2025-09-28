package Array;

import java.util.Arrays;

public class sort {
    public void ascending(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {3, 9, 6, 5, 2};
        System.out.println("Original array is : " + Arrays.toString(arr));
        sort s = new sort();
        s.ascending(arr);
    }
}