import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MAXelements {
    
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1,2,3,4,23456,7654,987,3456,876);
	Sorting se=new Sorting();
	Integer max=list.stream()
			.sorted(se)
			.findFirst()
			.get();
			System.out.println(max);
	}
	
}
class Sorting implements Comparator<Integer>{
	public int compare(Integer i,Integer j) {
		return j-i;
	}
}
