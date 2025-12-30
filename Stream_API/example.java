package stream_API;

public class example {
    
public static void main(String[] args) {
	List <String>list=Arrays.asList("banana","bunny","borborn","2020","happy-happy");
	list.stream().map((i)->(i.toUpperCase())).filter((i)->(i.startsWith("B")))
	.map((i)->(i.length())).distinct().sorted(new reverse()).forEach(System.out::println);
	
	
	
	
	}
}

class reverse implements Comparator<Integer>{
	public int compare(Integer s,Integer s1) {
		return Integer.compare(s1, s);
	}
}
