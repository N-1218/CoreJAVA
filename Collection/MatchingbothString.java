import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MatchingbothString {
   public static void main(String[] args) {
		Set<String>set=new HashSet<String>(Arrays.asList("Nam","Sak","aaa","cvbn","drtyh","jhgfv","hgb"));
	Set<String>set1=new HashSet<String>(Arrays.asList("sdcc","Nam","Sak","aaa"));
	
	
	set1.retainAll(set);
	System.out.println("Mtchinf String is : "+set1);
	
	
	
	
	
	List<String>list=new ArrayList<String>(Arrays.asList("Nam","Sak","aaa","cvbn","drtyh","jhgfv","hgb"));
	List<String>list1=new ArrayList<String>(Arrays.asList("sdcc","Nam","Sak","aaa"));
       list1.retainAll(list);
       System.out.println(list1);
	}

}
