package Stream_API;

import java.util.List;
import java.util.Vector;

public class API_1 {
    public static void main(String[] args) {
		List<Integer>numbers=new Vector<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println("Numbers : "+numbers);
		numbers.stream().filter((i)->{return i%2==0;}).forEach((i)->{System.out.println(i);});
	}

}
