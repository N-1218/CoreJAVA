public class Doublicate {
    
public static void main(String[] args) {
		List<Integer>list=Arrays.asList(12,12,12,12,344,5,44,5,6,67,43,33);
		List<Integer>result=new ArrayList<Integer>();
		for(int i:list) {
			if(!result.contains(i)) {
				result.add(i);
			}
		}
		System.out.println(result);
	}

}
