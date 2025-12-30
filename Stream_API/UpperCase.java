package stream_API;

public class UpperCase {
    

	public static void main(String[] args) {
		
		List<String>list=Arrays.asList("java","javascript","springboot","micro services","hybernet","jdbc");
//		list.stream().map(String::toUpperCase)
//		.forEach(System.out::println);
//		
		
		Function<String,String>con=Uppercase::uper;
		System.out.println(con.apply("Namrata"));		
	}

}
class Uppercase{
	public static String uper(String s) {
		return s.toUpperCase();
	}
}

