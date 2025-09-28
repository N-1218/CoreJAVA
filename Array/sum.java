package Array;

import java.util.Arrays;

public class sum {
	
 public static void main(String[]args) {
	int arr[]= {12,3,5,4,6,22,8};
	int sum=0;
	for(int element:arr){
		int s=sum+=element;
	}
	System.out.println("OG Array is : "+Arrays.toString(arr));
	System.out.println("sum is : "+sum);
}
}
