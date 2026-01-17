public class Reverseusing arraylist {
    
public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer>result=new ArrayList<Integer>();
		for(int i=list.size()-1;i>=0;i--) {
			result.add(list.get(i));
		}
		

		System.out.println(result);
	
	
	
	}

}
