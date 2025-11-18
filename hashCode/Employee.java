package hashCode;

import java.util.Objects;

public class Employee {

	public static void main(String[] args) {
	Uss U=new Uss();
	U.id=1;
	U.name="namrata";
	U.Salary="22222";
	System.out.println(U.hashCode());
	Uss U1=new Uss();
	U1.id=1;
	U1.name="namrata";
	U1.Salary="22222";
	System.out.println(U1.hashCode());
	System.out.println(U1.equals(U));
	
	}

}
class Uss {
	String name;
	int id;
	String Salary;
	public Uss() {
		
	}
	public Uss(String name,int id,String salary) {
		this.name=name;
		this.id=id;
		this.Salary=salary;
	}
	public int hashCode(){
		return Objects.hash(id,name,Salary);
	}
	public boolean equals(Object obj) {
		Uss us=(Uss)obj;
		return this.id==us.id&& this.name.equals(us.name)&& this.Salary==us.Salary;
		}
}


