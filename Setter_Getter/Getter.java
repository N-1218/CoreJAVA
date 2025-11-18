package Setter_Getter;

import java.util.Scanner;

public class Getter {
    public static void main(String[] args) {
		emp e1=new emp();
		e1.accept();
		e1.display();
		
		
		System.out.println("change name is : "+e1.getName());
		System.out.println("chnge salary is : "+e1.getSalary());
		System.out.println("chnge empid is : "+e1.getempid());

	}
}

class emp{
	private int empid;
	private String name;
	private float salary;

 public emp(){
	 empid=empid;
	 name=name;
	 salary =salary;
 }
 public void accept() {
	 Scanner sc = new Scanner(System.in);
	 this.empid=sc.nextInt();
	 sc.nextLine();
	 System.out.println("empid is : ");
	 this.name=sc.nextLine();
	 System.out.println("enter name : ");
	 this.salary=sc.nextFloat();
	 System.out.println("enter salary : " );
 }
 public void display() {
	 System.out.println("empid is : "+empid);
	 System.out.println("name is : "+name);
	 System.out.println("salary is : "+salary);
 }
 public String getName() {
	 return name;
 }
	public float getSalary() {
		return salary;
	}
	public int getempid() {
		return empid;
	}
	}