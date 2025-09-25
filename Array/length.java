package array;

import java.util.Arrays;
import java.util.Scanner;

public class length {
	
	public static void main(String[] args) {
		int arr[]=new int[3];
		for (int i=0;i<arr.length;i++) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value: ");
		int num= sc.nextInt();
		sc.nextLine();
		}
		System.out.println(Arrays.toString(arr));
	}

}
