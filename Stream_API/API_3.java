package Stream_API;

import java.util.List;
import java.util.Stack;

public class API_3 {
    public static void main(String[] args) {
		List <String>name=new Stack<String>();
		name.add("Namrata");
		name.add("Sakshi");
		name.add("Viraj");
		name.add("Vinayak");
		name.add("Teja");
		name.add("Nandini");
		
		System.out.println(name);
		name.stream().filter((i)->{return i.endsWith("a");}).forEach((i)->{System.out.println(i.toUpperCase());});
	}
}
