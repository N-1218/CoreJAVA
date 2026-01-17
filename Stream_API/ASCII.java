package stream_API;

import java.util.Arrays;
import java.util.List;

public class ASCII {

public static void main(String[] args) {
		List<String>list=Arrays.asList("pune","satara");
		list.stream()
		.filter(ASCI::checker)
		.map(StringBuffer::new)
		.map(StringBuffer::reverse)
		.map(StringBuffer::toString)
		.forEach(System.out::println);
	}
}
class ASCI{
	public static boolean checker(String s) {
		return s.charAt(0)>110;
	}
}
