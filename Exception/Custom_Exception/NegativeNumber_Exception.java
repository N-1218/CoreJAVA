package Exception.Custom_Exception;

public class NegativeNumber_Exception {
    public static void main(String[] args) {
		
		try {
			int a=-7;
		if(a<0) {
			throw new NegativeNumberException();
		}else {
			System.out.println("allowed!");
		}
		}
		catch(RuntimeException rx) {
			System.out.println(rx.getMessage());
		}

	}

}
class NegativeNumberException extends RuntimeException{
	public NegativeNumberException() {
		super("Negative Number Not Allowed!");
	}
}