public class charcount {
    
public static void main(String[] args) {
		String name="NAMRATA";
	 char[]Char=name.toCharArray();
	 Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<Char.length;i++) {
			int Counter=1;
			if(map.containsKey(Char[i])) {
				Counter=map.get(Char[i])+1;
				map.put(Char[i], Counter);
			}
			else {
				map.put(Char[i], Counter);
			}
		}
		System.out.println(map);

	}

}