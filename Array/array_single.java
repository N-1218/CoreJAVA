package Array;

import java.util.Arrays;
import java.util.Scanner;

public class array_single {
    
    // Method to accept user input and store it in an array
    public void accept(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " integer values:");
        for (int index = 0; index < arr.length; index++) {
            System.out.print("Enter value for index " + index + ": ");
            arr[index] = sc.nextInt();
        }
        // It's good practice to close the scanner when done, but for this simple program,
        // it's acceptable to leave it open if it will be used again.
        // For a single method, closing is better.
        sc.close(); 
    }
    
    // Method to display the contents of an array
    public void display(int[] arr) {
        System.out.println("Displaying array elements:");
        for (int index = 0; index < arr.length; index++) {
            System.out.println("Element at index " + index + ": " + arr[index]);
        }
        // Alternatively, use the built-in Arrays.toString() for a cleaner output
        // System.out.println("Array contents: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        array_single as = new array_single();
        int[] num = new int[4]; // Declare and initialize the array
        
        as.accept(num);  // Pass the array 'num' to the accept method
        as.display(num); // Pass the array 'num' to the display method
    }
}
