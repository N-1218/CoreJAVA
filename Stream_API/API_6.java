package stream_API;

public class API_6 {
    
public static void main(String[] args) {
		Set<String>set=new HashSet<String>();
		
		    set.add("Chai");
	        set.add("Coffee");
	        set.add("Chai");
	        set.add("Chai");
	        set.add("Coffee");
	        set.add("Chai");
	        set.add("Chai");
	        set.add("Coffee");
	        set.add("Chai");
	        set.add("Chai");
	        set.add("Coffee");
	        set.add("Chai");

	        long count =  set.stream()
                    .filter(i -> (i.equals("Chai")))
                    .count();
      System.out.println("Coffee count: " + count);
      
	}
}
