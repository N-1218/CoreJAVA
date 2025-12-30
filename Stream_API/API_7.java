package stream_API;

import java.util.List;
import java.util.function.Consumer;

public class API_7 {
    
 public static void main(String[] args) {

        // 1D Lists
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(6, 7, 8, 9, 10);
        List<Integer> list3 = List.of(11, 12, 13, 14);
        List<Integer> list4 = List.of(15, 16, 17);

        // 2D Lists
        List<List<Integer>> list2D1 = List.of(list1, list2);
        List<List<Integer>> list2D2 = List.of(list3, list4);

        // 3D List
        List<List<List<Integer>>> list3D = List.of(list2D1, list2D2);

        // Apply operation on 3D list
        list3D.forEach(new ThreeDConsumer());
    }

    // Consumer for 3D List
    static class ThreeDConsumer implements Consumer<List<List<Integer>>> {
        @Override
        public void accept(List<List<Integer>> t) {
            t.forEach(new TwoDConsumer());
            System.out.println("######## End of 2D List ########");
        }
    }

    // Consumer for 2D List
    static class TwoDConsumer implements Consumer<List<Integer>> {
        @Override
        public void accept(List<Integer> t) {
            t.forEach(new OneDConsumer());
            System.out.println("******** End of 1D List ********");
        }
    }

    // Consumer for 1D List (Integers)
    static class OneDConsumer implements Consumer<Integer> {
        @Override
        public void accept(Integer t) {
            System.out.println(t * 3);
        }
    }
}

