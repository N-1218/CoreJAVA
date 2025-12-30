package stream_API;

public class Method_Reference {
    
public static void main(String[] args) {
		Predicate<Integer>pred=Checkeven::even;
		System.out.println(pred.test(222));
		
		Consumer<String>con=Checkeven::print;
		con.accept("Java");
		
		Function<String,String>fun=Checkeven::function;
		System.out.println(fun.apply("Namrata").toUpperCase());
	
	}
}
class Checkeven{
	public static boolean even(int i) {
		return i%2==0;
	}
	public static void print(String i) {
		System.out.println(i);
	}
	public static String function(String a) {
		return a+" ";
		}
}