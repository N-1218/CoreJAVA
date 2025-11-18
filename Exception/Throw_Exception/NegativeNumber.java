package Exception.Throw_Exception;
import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number : ");
		int a1=sc.nextInt();
		
		try {
			if(a1<0) {
				throw new Exception("Negative Number not Valid!");
			}else {
				System.out.println("Correct !");
			}
		}catch(Exception x) {
			System.out.println(x.getMessage());
		}finally {
			sc.close();
			System.out.println("Program end !");
		}

	}

}

}
