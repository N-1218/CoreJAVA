import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Unique {
    
public static void main(String[] args) {
		List<String>list= Arrays.asList("1","2","2");
		Set<String>set=new HashSet<>(list);
		System.out.println(set);

	}

}

