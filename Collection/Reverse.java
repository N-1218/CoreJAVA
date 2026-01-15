import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {
    
public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer>result=new ArrayList<Integer>();
		for(int i=list.size()-1;i>=0;i--) {
			result.add(list.get(i));
		}
		System.out.println("Original List : "+list);
		System.out.println("Reverse list : "+result);
	}

}
