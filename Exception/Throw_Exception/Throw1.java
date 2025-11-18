package Exception.Throw_Exception;

public class Throw1 {
    public static void main(String[] args) {
		int age=12;
		try {
		if(age<18) {
			throw new Exception ("not valid for vote!");
		}else {
			System.out.println("valid!");
		}
	}catch(Exception ex) {
		System.out.println(ex.getMessage());
	}finally {
		System.out.println("Program end!");
	}
	}

}
