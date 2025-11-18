package hashCode;

import java.util.Objects;

public class Scholling {
	public static void main(String[] args) {
		Staff staff= new Staff();
		staff.id=1;
		staff.name="Namrata";
		System.out.println(staff.hashCode());
		
		Staff staff1 =new Staff();
		staff1.id=1;
		staff1.name="Namrata";
		System.out.println(staff1.hashCode());
		System.out.println(staff1.equal(staff));
	}

}
class Staff{
	String name;
	int id;
	public int hashCode() {
		  return Objects.hash(id,name);
	  }
	public boolean equal(Object obj){
		Staff staff2=(Staff)obj;
		return this.id==staff2.id&&this.name.equals(staff2.name);
	}
}

