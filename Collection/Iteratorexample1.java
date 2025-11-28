import java.util.ArrayList;
import java.util.List;

public class Iteratorexample1 {
    public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		for(int i=0;i<=10;i++) {
		list.add(i);
		System.out.println("Original List"+list);
		}
		
		
		Iterator<Integer>it=list.iterator();
		while(it.hasNext()) {
			if(it.next()==4) {
				it.remove();}
			else {
			System.out.println(it.next());
		}
		}
	}
}
