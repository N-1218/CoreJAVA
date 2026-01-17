package stream_API;

public class MAX {
    
public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,7,8,98,78);
		list.stream()
		.sorted(Comparator.reverseOrder())
		.limit(1)
		.forEach(System.out::println);
		
	}

}
