package hashCode;

import java.util.Objects;

public class hashcode {

	public static void main(String[] args) {
		Students st1= new Students();
		st1.ID=1;
		st1.Name="Namrata";
		System.out.println(st1.hashCode());
		Students st2= new Students();
		st2.ID=1;
		st2.Name="Namrata";
		System.out.println(st2.hashCode());
		System.out.println(st1.equals(st2));
	}
 
}
class Students{
	 int ID;
	 String Name;
	  public int hashCode() {
		  return Objects.hash(ID,Name);
	  }
	  public boolean equals(Object obj) {
		  Students st=(Students)obj;
		  return this.ID==st.ID && this.Name.equals(st.Name);
	  }
}


