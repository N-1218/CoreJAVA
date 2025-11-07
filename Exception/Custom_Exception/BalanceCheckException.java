package Exception.Custom_Exception;
import java.util.Scanner;

public class BalanceCheckException {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("enter the password:");
		String pass=scan.next();
		
		try {
			Bank b=new Bank();
		 b.payment(pass,3000);
		// System.out.println("Counter:"+Bank.counter);
		}
		catch( Throwable t)
		{
			System.out.println(t.getMessage());
		}
		}while(Bank.flag);
	}

}
 class Bank{
	 
	 static int counter=0;
	 static boolean flag=true;
	 public   void payment (String pass, int amount)throws BalanceCheckException , PasswordException, LimitException,BlockuserException{
		 double balance=5000;
		 double limit=2000;
		String password="1234";
		
		System.out.println("Counter:"+counter);
		
	 if(amount>balance) {
			throw new BalanceCheckException("Insufficient balance!",new Throwable("low amount"),100);
		}
		
	 if(password.equals(pass)==false) {
		
		 counter++;
		 if(counter==4)
		 { 
			 flag=false;
			 throw new BlockuserException("you are now blocked.....");
		 }
		 System.out.println(flag);
		 throw new PasswordException("UPI Password is Wrong!",new Throwable("Wrong Password"),200 ); 
	 }
	 if(limit>balance) {
		 throw new LimitException("Cross The Limit!");
	 }
	 
	 System.out.println("Payment Successful!");

   }
 }
 
