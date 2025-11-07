package Exception.exception;

public class arrayoutofboundexception {
    public static void main(String[] args) {
		int[ ]num= {1,2,3,4,5};
		try {
			System.out.println(num[7]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("The End");
		}

	}

}

}
