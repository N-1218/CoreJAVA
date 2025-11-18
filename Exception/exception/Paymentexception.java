package Exception.exception;

public class Paymentexception {
    public static void main(String[] args) {
        I_payment i_pay = new I_paytm();
        i_pay.Balance(10000);   
        i_pay.Withdrw(40000);      
    }
}

interface I_payment {

    static void message() {
        System.out.println("Welcome to our Bank");
    }

    void Balance(double amount);
    void Withdrw(double amount);
}

class I_paytm implements I_payment {

    double total = 0;

    @Override
    public void Balance(double amount) {
        I_payment.message();
        total = amount;
        System.out.println("Your total balance is: " + total);
    }

    @Override
    public void Withdrw(double amount) {
        try {
            if (amount <= 0) {
                System.out.println("Invalid amount! Please try again.");
            } else if (amount > total) {
                System.out.println("Insufficient bank balance!");
            } else {
                total -= amount;
                System.out.println("Withdrawal amount: " + amount);
                System.out.println("Remaining balance: " + total);
            }
        } catch (Throwable ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        }finally {
        	System.out.println("Program end");
        }
    }
}


