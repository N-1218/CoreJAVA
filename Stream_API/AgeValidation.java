package stream_API;

public class AgeValidation {
    
public static void main(String[] args) {
		
		Validation valid=new Validation();
		valid.run(34);
		
		Predicate<Integer>pre=(e)->(e>=18);
		System.out.println(pre.test(21));
		
		
		
		

	}

}
class Validation {
	int age;
	
	public void run(int age) {
		if(age>=18) {
			System.out.println("You are valid ");
		}else {
			System.out.println("not valid ");
		}
	}

	
}