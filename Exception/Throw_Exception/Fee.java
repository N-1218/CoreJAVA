package Exception.Throw_Exception;

public class Fee {
     public static void main(String[] args) {
        float fees = 3000;

        try {
            if (fees < 10000) {
                throw new Exception("Not Applicable — Fees too low!");
            } else if (fees >= 10000 && fees < 23000) {
                System.out.println("Please pay the remaining amount to complete the fees.");
            } else {
                System.out.println("Applicable! Fees payment is sufficient.");
            }
        } catch (Exception ex) {
            System.out.println( ex.getMessage());
        }
    }
}

