package Interfaces;

interface Payment {
    void processPayment(double amount);
}

class Bank implements Payment {
    double total = 5000;

    @Override
    public void processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount! Please try again.");
        } else if (amount > total) {
            System.out.println("Insufficient bank balance!");
        } else {
            total -= amount;
            System.out.println("Withdrawal amount: " + amount);
            System.out.println("Remaining balance: " + total);
        }
    }
}

public class interface {
    public static void main(String[] args) {
        Payment pay = new Bank();
        pay.processPayment(3000);
    }
}