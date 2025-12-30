package stream_API;

public class API_5 {
    
 public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Chai");
        list.add("Coffee");
        list.add("Chai");
        list.add("Chai");
        list.add("Coffee");
        list.add("Chai");
        list.add("Chai");
        list.add("Coffee");
        list.add("Chai");
        list.add("Chai");
        list.add("Coffee");
        list.add("Chai");

        long count = list.stream()
                         .filter(i -> i.equals("Chai"))
                         .count();

        System.out.println("Chai count: " + count);
    }
}
