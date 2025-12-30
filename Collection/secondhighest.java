import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class secondhighest {
    
public static void main(String[] args) {
		TreeSet<Integer>tree=new TreeSet<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		com c=new com();
		tree.stream()
		.sorted(c)
		.skip(1)
		.limit(1)
		.forEach(System.out::println);

	}

}
class com implements Comparator<Integer>{
	public  int compare(Integer a,Integer b) {
		return b-a;
	}
}


