package Exception.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class missmatchexception {
public class MissmatchException {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("enter int");
			int i=sc.nextInt();
			System.out.println("uhh entered "+i);
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
			System.out.println("program close");
		}
		

	}

}

}
