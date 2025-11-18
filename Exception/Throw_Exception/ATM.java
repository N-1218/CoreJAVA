package Exception.Throw_Exception;

public class ATM {
    public static void main(String[] args) {
		double balance=5000;
		double withdraw=6000;

		try {
			if(withdraw>balance) {
				throw new Exception("Insufficient balance!");
			}else {
				System.out.println("Payment Successful!");
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("program end!");
		}
	}

}

