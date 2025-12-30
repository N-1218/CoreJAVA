package stream_API;

import java.util.function.Function;

public class convert_string_into_length {
    
public static void main(String[] args) {
		Function<String,Integer>fun=Length::checklen;
		System.out.println(fun.apply("JavaScript"));

	}

}
class Length{
	public static int checklen(String s) {
		return s.length();
	}
}

