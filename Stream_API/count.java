package stream_API;

public class count {
    
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1,2,3,4,5);
		 long c=list.stream().count();
		 System.out.println(c);
	}

}
