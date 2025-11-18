package Abstraction;

public class Anonymous1 {
    
public static void main(String[]args) {
		Company company =new Company() {
			@Override
			void Employee(String name) {
				
				System.out.println("Employee name is "+name);
	
			}
			@Override
			void Salary(int salary) {
				System.out.println("Your Monthly Salary is "+salary);
			}
		};

		company.Employee("namrata");
		company.Salary(20000);
	}

}
abstract class Company{
	String name;
	int salary;
	abstract void Employee(String name);
	abstract void Salary(int salary);
}

