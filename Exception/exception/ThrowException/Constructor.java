package Exception.exception.ThrowException;
import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        try {
            DivisionExample de = new DivisionExample();
            de.input();
        } catch (MyArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

class DivisionExample {
    double a, b;

    Scanner sc = new Scanner(System.in);

    public DivisionExample() throws MyArithmeticException {
        System.out.println("Constructor called... Checking division validity...");
    }

    public void input() throws MyArithmeticException {
        System.out.print("Enter first number: ");
        a = sc.nextDouble();
        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        if (b == 0) {
            throw new MyArithmeticException("Cannot divide by zero!");
        } else {
            double result = a / b;
            System.out.println("Division result: " + result);
        }
    }
}

class MyArithmeticException extends Exception {
    public MyArithmeticException(String msg) {
        super(msg);
    }
}


