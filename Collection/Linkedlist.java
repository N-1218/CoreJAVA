import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
		List<Integer> list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("list"+list);
		
		
		List<Integer>li=new LinkedList();
		li.add(1);
		li.add(2);
		li.add(3);
		System.out.println("li"+li);
		System.out.println(li.set(2, null));
		System.out.println("li"+li);
		System.out.println(li.contains(list));
	}
}
