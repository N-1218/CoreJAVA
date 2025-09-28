package Array;

import java.util.Arrays;

public class avg {
	public void average(int a[]) {
			int sum=0;
			for (int element:a) {
				sum+=element;
			}
			double avgs=(double)sum/a.length;
			System.out.println("avg is : "+avgs);
		}
	
	public static void main(String[]args) {
		int a[]= {1,2,3,4,5,6,7};
		System.out.println("og array is : "+Arrays.toString(a));
		avg a1=new avg();
			a1.average(a);
	}
}
