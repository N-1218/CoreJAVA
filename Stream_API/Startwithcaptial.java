package stream_API;

public class Startwithcaptial {
    
public static void main(String[] args) {
		Predicate<String>pred=Start::checkstartwith;
		System.out.println(pred.test("Java"));
		System.out.println(pred.test("javascript"));

			
		Function<String,String>fun=Start::lowerstart;
		System.out.println(fun.apply("Java"));
		
		
		List<String>list=Arrays.asList("namrata","Sakshi","Pranali");
		list.stream().map(Start::lowerstart).forEach(null);
	}

}
class Start{
	public static boolean checkstartwith(String s){
		return Character.isUpperCase(s.charAt(0));
	}
	public static String lowerstart(String s) {
		return String.valueOf(Character.isLowerCase(s.charAt(0)));
				}
}
