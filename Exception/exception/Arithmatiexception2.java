package Exception.exception;

import java.util.Scanner;

public class Arithmatiexception2 {
    Scanner sc= new Scanner(System.in);
		try {
		System.out.println("enter 1st number: ");
		int a=sc.nextInt();
		System.out.println("enter 2nd number : ");
		int b=sc.nextInt();
		int result=a/b;
		System.out.println("Final Result is : "+result );
		}catch(ArithmeticException ae) {
			System.out.println("Error: Cannot divide by zero!");
			System.out.println(ae.getMessage());
		}finally {
			System.out.println("program has end");
			
		}
		
		

	}


