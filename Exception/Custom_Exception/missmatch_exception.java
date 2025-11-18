package Exception.Custom_Exception;
import java.util.Scanner;
public class missmatch_exception {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("enter int value : ");
			int i=sc.nextInt();
			throw new MissmatchException();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
			System.out.println("program close");
		}

	}

}
class MissmatchException extends RuntimeException{
	public MissmatchException(){
		super("Can't give String take integer values");
	}
}


