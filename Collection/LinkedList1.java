public class LinkedList1 {
    
public static void main(String[] args) {
		List<emp>list=new LinkedList<emp>();
		emp e1=new emp("1");
		emp e2=new emp("2");
		list.add(e1);
		list.add(e2);
		
		List<emp>list1=new LinkedList<emp>();
		emp e3=new emp("1");
		emp e4=new emp("2");
		list1.add(e3);
		list1.add(e4);


		System.out.println(list);
		
		
		System.out.println("List1 and list are : "+list.contains(list1));
	}

}


class emp{
	String id;
	
	public emp(String id){
		this.id=id;
	}
	public String toString(){
		return this.id;
	}
	public int hashCode() {
		return Objects.hash(this.id);
	}
	
	public boolean equals(Object o) {
		emp e=(emp)o;
		return this.id.equals(e.id);
	}
}
