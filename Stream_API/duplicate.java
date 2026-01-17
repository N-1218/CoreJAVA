package stream_API;

public class duplicate {
    
public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,6,4,3,9,2));
//		Set<Integer>set=new LinkedHashSet<Integer>(list);
//		System.out.println(set);
		
		
		list.stream()
		.distinct()
		.forEach(System.out::println);

	}

}
