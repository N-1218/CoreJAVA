public class Set1 {
    
public static void main(String[] args) {

		//List<Integer>list=new LinkedList<Integer>();
		
		//Integer
		List<Integer>list1=Arrays.asList(1,2,3,4,5,6,2,1,2,3,4,5,3,2,8);
		Set<Integer>set=new LinkedHashSet<Integer>(list1);
		System.out.println("Unique Integer is : "+set);
		
		
		//String
		List<String>list2=Arrays.asList("Java","HTML","CSS","Java","JavaScript","Java","HTML","CSS");
		Set<String>set1=new HashSet<String>(list2);
		
		System.out.println("Unique String is : "+set1);
		
		
		//Double
		List<Double>list3=Arrays.asList(12.00,22.00,21.00,12890.00,2200.00,01.00,567.0,12.00,22.00,21.00,12890.00);
		Set<Double>Set2=new HashSet<Double>(list3);
		System.out.println("Unique Double is : "+Set2);
		
	}

}
