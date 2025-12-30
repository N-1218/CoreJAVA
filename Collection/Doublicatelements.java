import java.util.HashSet;
import java.util.Set;

public class Doublicatelements {
    public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int[]arr1= {1,0,9,8,79,2};
		
		Set<Integer>set=new HashSet<Integer>();
		Set<Integer>set1=new HashSet<Integer>();
		for(int n:arr)set.add(n);
		for(int n:arr1) {
			if(set.contains(n)) {
				set1.add(n);
			}
		}
		System.out.println(set1);

	}
}
