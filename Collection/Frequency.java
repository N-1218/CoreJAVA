public class Frequency {
    
public static void main(String[] args) {
		String[]arr= {"namrata","sakshi","namrata"};
		Map<String ,Integer>map=new HashMap<>();
		for(String s:arr) {
			map.put(s, map.getOrDefault(s, 0)+1);
			
		}
		System.out.println(map);
	}

}
