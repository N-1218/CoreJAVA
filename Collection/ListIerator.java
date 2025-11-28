import java.util.ArrayList;
import java.util.List;

public class ListIerator {
    List <Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		
		
		Iterator<Integer>it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
