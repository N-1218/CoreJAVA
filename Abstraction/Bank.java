package Abstraction;

public class Bank {
    
public static void main(String[] args) {
		Saving_Ac SA=new Saving_Ac("1",12345);
		 SA.showbalance();
		 SA.deposit(45000);
		 SA.withdraw(21000);
		 
		 
		 System.out.println();
		 
		 Current_Ac CA=new  Current_Ac ("2",89000);
		 CA.showbalance();
		 CA.deposit(34000);
		 CA.withdraw(100000);
	}

}


abstract class BankAccount{
	String AC_number;
	double balance;
	
	public BankAccount(String AC_no,double bal){
		AC_number=AC_no;
		balance=bal;
	}
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	void showbalance() {
		System.out.println("ac number is : "+AC_number);
		System.out.println("total balance is : "+balance);
	}
}
class Saving_Ac extends BankAccount{

	 public Saving_Ac(String AC_no, double  bal) {
	        super(AC_no, bal);
	    }

	@Override
	void deposit(double amount) {
		balance+=amount;
		System.out.println("deposited is :"+amount);
		
	}

	@Override
	void withdraw(double amount) {
		 if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrew amt is " + amount + " from Savings Account.");
	        } else {
	            System.out.println("Insufficient balance!");
	        }
		
	}
	
}

class Current_Ac extends BankAccount{

	public Current_Ac(String AC_no, double bal) {
		super(AC_no, bal);
		
	}

	@Override
	void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposited is : "+amount);
		
	}

	@Override
	void withdraw(double amount) {
		 if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrew amt is : " + amount + " from Savings Account.");
	        } else {
	            System.out.println("Insufficient balance!");
	        }
		
	}
	
}

