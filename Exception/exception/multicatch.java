package Exception.exception;

public class multicatch {
    public static void main(String[] args) {
		try {
		int a[]= {1,2,3};
		int b=a[3]/0;
		}
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index issue!");
            System.out.println(e.getMessage());
        } 
		catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
            System.out.println(e.getMessage());
        } 
		catch (Throwable e) {
            System.out.println("General exception: " + e.getMessage());
        }
        System.out.println("Done!");
    }
}


