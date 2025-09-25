package array;

import java.util.Arrays;

public class min_array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min);
			min=a[i];
		}

		System.out.println("og array is : "+Arrays.toString(a));
		System.out.println("min array is : "+min);
	}

}
