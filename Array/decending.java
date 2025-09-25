package array;

import java.util.Arrays;

public class decending {

	public static void main(String[] args) {
		int arr[]= {12,3,5,3,22,5,6,9};
		for(int i=arr.length;i<=0-1;i--) {
			for(int j =arr.length;j<=0-1;i--) {
				 if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
		}
			}
		}
		System.out.println("og array"+Arrays.toString(arr));

	}

}
