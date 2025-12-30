public class findmissing {
    
public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,5);
		int n=list.size()+1;
		int total=n*(n+1)/2;
		int sum=0;
		for (int i:list){
			sum+=i;
		}
		System.out.println(total-sum);
		
	}

}
