import java.util.ArrayList;
import java.util.List;

public class Iteratorexample3 {
    public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();

	        // Add numbers to list
	        for (int i = 1; i <= 10; i++) {
	            list.add(i);
	        }

	        System.out.println("Original List: " + list);

	        Iterator<Integer> it = list.iterator();

	        while (it.hasNext()) {
	            int num = it.next();

	            if (num == 4) {
	                it.remove(); // remove element safely
	            }
	        }

	        System.out.println("List After Removing 4: " + list);
	    }
	}

