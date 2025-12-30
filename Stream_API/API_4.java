package stream_API;

import java.util.HashSet;
import java.util.Set;

public class API_4 {
    
public static void main(String[] args) {
		Set <Integer>set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		
		System.out.println("Original List is : "+set);
		set.stream().filter((i)->{return i%3==0;}).forEach((i)->{System.out.println(i);});

	}

}

