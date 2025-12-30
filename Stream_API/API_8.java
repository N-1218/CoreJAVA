package stream_API;

public class API_8 {
    
public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<String,Integer>();
		map.put("JAVA", 1);
		map.put("JavaScript", 9234);
		map.put("HTML",987);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
