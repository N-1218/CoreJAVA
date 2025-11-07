package Exception.Custom_Exception;

public class custom1 {
    public static void main(String[] args)  {
		try {
		int age=17;
		if(age<18) {
			throw new AgeNotValidException("not valid"); 
		}else {
			System.out.println("Valid");
		}
		}catch(RuntimeException rx){
			System.out.println(rx.getMessage());
		}

	}

}
class  AgeNotValidException extends RuntimeException {
	public  AgeNotValidException(String str) {
		super(str);
	}
}
}
