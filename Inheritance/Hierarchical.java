package Inheritance;
import java.util.Scanner;

public class Hierarchical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	        Scanner s1=new Scanner(System.in);

	      
	        System.out.println("Enter Student Details:");
	        Student s = new Student();
	        s.acceptRecord(sc);

	        System.out.println("\nEnter Employee Details:");
	        Employee1 e = new Employee1();
	        e.acceptRecord(sc);

	        
	        System.out.println("\n--- Student Info ---");
	        s.display();
	        s.showStudentDetails();

	        System.out.println("\n--- Employee Info ---");
	        e.display();
	        e.showEmployeeDetails(); 
    }
}

class Human {
    String name;
     int studentID;
    float marks;
     int empid;
    float salary;

    public void display() {
        System.out.println("Name: " + name);
    }
}


class Student extends Human {
   

    public void acceptRecord(Scanner sc) {
        
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        studentID = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks = sc.nextFloat();
        
    }

    public void showStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Marks: " + marks);
    }
    
}


class Employee1 extends Human {
   

    public void acceptRecord(Scanner s1) {
        
        System.out.print("Enter Employee Name: ");
        name = s1.nextLine();
        s1.nextLine();

        System.out.print("Enter Employee ID: ");
        empid = s1.nextInt();

        System.out.print("Enter Salary: ");
        salary = s1.nextFloat();
       
    }

    public void showEmployeeDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Salary: " + salary);
    }
    
}



