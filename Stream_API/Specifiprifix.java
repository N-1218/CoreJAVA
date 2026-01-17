package stream_API;

public class Specifiprifix {
    
public static void main(String[] args) {
		List<String>list=Arrays.asList("ak","namrata","nandini","narad","sakshi");
		list.stream()
		.filter((e)->(e.startsWith("n")))
		.forEach(System.out::println);
	}

}
