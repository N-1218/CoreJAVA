package stream_API;

public class Square {
    
public static void main(String[] args) {
		// Print numbers greater than 20 and square them
		List<Integer>list=Arrays.asList(21,78,98,57,68,64);
		list.stream()
		.filter((i)->(i>20))
		.map((n)->(n*n))
		.forEach(System.out::println);
	
	}

}
