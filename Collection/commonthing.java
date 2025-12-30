import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class commonthing {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(Arrays.asList("java","html","java","css","javascript","javascript","javascript"));
        Set<String> set1 = new HashSet<>(Arrays.asList("java","html","java","css"));
        
        Set<String> set2 = new HashSet<>();

        // find elements in set1 that are NOT in set
        for (String n : set1) {
            if (!set.contains(n)) {
                set2.add(n);
            }
        }

        System.out.println("Elements in set1 but not in set: " + set2);
    }
}
