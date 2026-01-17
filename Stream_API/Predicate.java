public class Predicate {
    
public static void main(String[] args) {
		Predicate<String>emailvalidation=(email)->(email.endsWith("@gmail.com"));
		System.out.println(emailvalidation.test("namrata@gmail."));
	}

}