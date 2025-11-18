import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Custom_Arraylist {
    List <Sunglass>list1=new ArrayList();
		Sunglass sun=new Sunglass(1,"rayban");
		Sunglass sun1=new Sunglass(2,"oaky");
		list1.add(sun);
		list1.add(sun1);
		list1.remove(0);
		System.out.println("its list1 "+list1);
	
		
		List<Sunglass>list2=new ArrayList();
		Sunglass sun2=new Sunglass(1,"rayban");
		Sunglass sun3=new Sunglass(2,"oaky");
		list2.add(sun2);
		list2.add(sun3);
		System.out.println(list2.size());
		System.out.println("its list2"+list2);
	
	
		
		//for checking both list are equal are not
		System.out.println(list1.equals(list2));
		
	}

}
class Sunglass{
	int model;
	String brandname;
	 public Sunglass(int model,String brandname) {
		 this.model=model;
		 this.brandname=brandname;
	 }
	 public String toString() {
		 return this.model+" "+this.brandname;
	 }
	 public boolean equals(Object o) {
		 Sunglass sunglass=(Sunglass) o;
		 return this.model==sunglass.model && this.brandname.equals(sunglass.brandname);
	 }
	 public int hashcode(){
		 return Objects.hash(model,brandname);
	 }
}

}
