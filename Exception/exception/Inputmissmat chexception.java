package Exception.exception;
import java.util.InputMismatchException;
public class Inputmissmat chexception {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("enter value");
			int a=sc.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("you can't assigned String");
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("program closed");
		}

	}
}
