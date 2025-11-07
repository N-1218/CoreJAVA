package Setter_Getter;
import java.util.Scanner;

public class Setter {
    public static void main(String[] args) {
		setter1 s1=new setter1();
		s1.accept();
		s1.display();
		
		//setter
		s1.setEmpid(34);
		s1.setName("Namrata");
		s1.setSalary(234567);
		
		
		//getter
		System.out.println("change name is : "+s1.getName());
		System.out.println("chnge salary is : "+s1.getSalary());
		System.out.println("chnge empid is : "+s1.getEmpid());

	}

}

class setter1{
	private int empid;
	private String name;
	private float salary;
	
	
	public setter1() {
		int empid;
		String name;
	    float salary;
	}
	public void accept() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your empid : ");
		this.empid= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name : ");
		this.name=sc.nextLine();
		System.out.println("Enter your salary : ");
		this.salary=sc.nextFloat();
		
	}
	 public void display() {
		System.out.println("Empid : "+ this.empid );
		System.out.println("Emp Name : " +this.name);
		System.out.println("Emp Salary : " +this.salary);
	}
	 
	 //setter
	public void setEmpid(int empid) {
		this.empid=empid;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
	
	
	//getter
	
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	public int getEmpid() {
		return empid;
	}
}
