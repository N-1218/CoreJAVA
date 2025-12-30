public class MINelements {
    
public static void main(String[] args) {
		TreeSet<Integer>ts=new TreeSet<Integer>();
		ts.add(1);
		ts.add(55);
		ts.add(2345);
		ts.add(32);
		SOrting SO=new SOrting();
		Integer min=ts.stream()
				.sorted(SO)
				.findFirst()
				.get();
		System.out.println(min);
	}

}
class SOrting implements Comparator<Integer>{
	public int compare(Integer i,Integer j) {
		return i-j;
	}
}