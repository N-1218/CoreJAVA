public class HashMap {
    
public static void main(String[] args) {
	String []word= {"Apple","Banana","Orange","Apple","Banana","Apple"};
	Map <String,Integer>map=new HashMap();
	for(String value:word) {
		if(map.containsKey(value)) {
			map.put(value, map.get(value)+1);
		}else {
			map.put(value, 1);
		}
	}
	System.out.println(map);
	}
}