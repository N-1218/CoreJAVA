package Array;

import java.util.Arrays;

public class min_array {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int min = a[0]; // Initialize min with the first element of the array
		
		for (int i = 1; i < a.length; i++) { // Loop from the second element
			if (a[i] < min) { // Check if the current element is smaller than min
				min = a[i]; // Update min if a smaller element is found
			}
		}

		System.out.println("Original array is: " + Arrays.toString(a));
		System.out.println("The minimum element is: " + min);
	}
}
