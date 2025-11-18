package Array;

import java.util.Arrays;
import java.util.Scanner;

public class length {
	
	public static void main(String[] args) {
		int arr[] = new int[3];
		Scanner sc = new Scanner(System.in); // Create the Scanner object once before the loop
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for index " + i + ":");
			arr[i] = sc.nextInt(); // Store the user input directly into the array at index i
		}
		
		sc.close(); // Close the Scanner object after you are finished using it
		
		System.out.println("The final array is: " + Arrays.toString(arr)); // Print the array after the loop is complete
	}
}
