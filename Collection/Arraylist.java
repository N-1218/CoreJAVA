public class Arraylist {
    public static void main(String[] args) {
		List <Integer>list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(null);
		list.add(2);
		list.add(null);
		
		
		
		
		List <Integer>list1=new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(null);
		list1.add(2);
		list1.add(null);
		
		
		
		System.out.println(list);
		
		System.out.println(list.remove(0));
		System.out.println(list);
		
		System.out.println(list.contains(list1));
		System.out.println(list.size());
		System.out.println(list.get(3));

			
		}

}
