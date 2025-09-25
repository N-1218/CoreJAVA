package array;

import java.util.Arrays;
import java.util.Scanner;

public class array_single {
	
	public void accept() {
		for(int index = 0;index<4;index++) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter values");
		int num = sc.nextInt();
		sc.nextLine();
		}
	}
	public void display() {
		for(int index = 0;index<4;index++) {
			
		System.out.println(" "+index);
		}
	}

	public static void main(String[] args) {
	 /*int arr[]=new int[] {1,2,3};
	 System.out.println(arr);*/
		/*String name[]=new String[] {"Hello","Pune","!"};
		System.out.println();
		System.out.println(name.toString());//@65b3120a*/
		
		
		/*int number[]=new int[3];
		number[0]=12;
		number[1]=18;
		number[2]=1;
		System.out.println();
		System.out.println(Arrays.toString(number));*/
		
		array_single as=new array_single();
		int num[]=new int[4];
		as.accept();
		as.display();
		
		

	}

}
