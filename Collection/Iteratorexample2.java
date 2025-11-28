import java.util.ArrayList;
import java.util.List;

public class Iteratorexample2 {
    public static void main(String[] args) {
	List <Integer>list=new ArrayList();
		for(int i=1;i<=10;i++) {
			list.add(i);
			System.out.println("Original list : "+list);
		}
		Iterator <Integer>its=list.iterator();
		
		while(its.hasNext()) {
			if(its.next()==2) {
				its.remove();
			}
		}
		System.out.println("Remove Element List : "+list);
		
	}
}
