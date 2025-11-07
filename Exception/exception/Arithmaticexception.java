package Exception.exception;

public class Arithmaticexception {
    public static void main(String[] args) {
		int a=10;
		for(int i=3;i>=0;i--)
    try{
	  System.out.println(a/i);  
	}catch(ArithmeticException ex){
        System.out.println(ex.getMessage());
	}
  }
}
