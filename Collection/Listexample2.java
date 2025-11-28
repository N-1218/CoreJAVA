import java.util.ArrayList;
import java.util.List;

public class Listexample2 {
public static void main(String[] args) {
		List <String>list=new ArrayList<>();
		list.add("pen");
		list.add("Paper");
		list.add("Pencil");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}

