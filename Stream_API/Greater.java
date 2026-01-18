package stream_API;

import java.util.Arrays;
import java.util.List;

public class Greater {
    
public static void main(String[] args) {
		//Print strings whose length is greater than 5, in uppercase
		List<String>list=Arrays.asList("Java","Springboot","JavaScript","Html");
		list.stream()
		.filter(length::len)
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}
}
class length{
	public static boolean len(String s) {
		return (int)s.length()>5;
	}
}
