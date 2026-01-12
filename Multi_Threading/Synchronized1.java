package Multi_Threading;

public class Synchronized1 {
    
public static void main(String[] args) {
		Bank bank=new Bank(10.00,23.00);
		Thread th=new Thread(bank);
		th.start();
	}
}

class Bank implements Runnable{
	double balance;
	double amount;
	
	public Bank(double amount, double balance) {
		this.balance=balance;
		this.amount=amount;
		
	}
	
	public void run() {
		synchronized (this) {
			if(balance>=amount) {
				balance-=amount;
				System.out.println("Withdrwal amount Successfully...!");
			}else {
				System.out.println("Insufficient Balance..!");
			}
		}
		
	}
}