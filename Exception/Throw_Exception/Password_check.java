package Exception.Throw_Exception;
import java.util.Scanner;
public class Password_check {



	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name : ");
		String name=sc.nextLine();
		try {
			System.out.println("Enter Password : ");
			String Password=sc.nextLine();
			if(Password.length()<6) {
				throw new Exception ("Passord length short try above 6 letter or special character !");
			}else {
				System.out.println("Correct Password !");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			sc.close();
			System.out.println("Program end !");
		}

	}

}

}
