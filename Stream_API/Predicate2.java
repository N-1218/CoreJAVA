package stream_API;

public class Predicate2 {
    
public static void main(String[] args) {
		Employee emp=new Employee("Namrata",60000.0,"IT");
		
		
		
		Predicate<Employee>pred=(e)->(emp.Salary>20000);
		System.out.println(pred.test(emp));
		
		Predicate <Employee>pred2=(e)->(emp.Departments.equals("IT"));
		System.out.println(pred2.test(emp));
		

	}

}
class Employee {
	String Name;
	double Salary;
	String Departments;
	Employee(String Name,Double Salary,String Departments){
		this.Name=Name;
		this.Salary=Salary;
		this.Departments=Departments;
	}
}
