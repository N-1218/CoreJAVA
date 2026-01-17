package stream_API;

public class employeefilter {
    
public static void main(String[] args) {
		List<Employee>list=Arrays.asList(
				new Employee("Namrata","IT",45000),
				new Employee("Sakshi","IT",23000),
				new Employee("raj","Business",89000)
				);
		
//		list.stream()
//		.filter((e)->(e.Salary<45000.0))
//		.filter((e)->(e.Dept=="IT"))
//		.forEach((e)->System.out.println(e.name));
		list.stream()
		.sorted(Comparator.comparingInt(e ->(e.Salary)))
		.forEach(System.out::println);
	}

}
class Employee {
	String name;
	String Dept;
    int Salary;
	public Employee(String name,String dept,int salary) {
		this.name=name;
		this.Dept=dept;
		this.Salary=salary;
	}
}
