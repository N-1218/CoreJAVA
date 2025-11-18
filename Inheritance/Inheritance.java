package Inheritance;
import java.util.Scanner;



class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Person constructor called");
    }

    public void acceptrecord(Scanner sc) {
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine(); // Consume newline
    }
    public void ShowRecord() {
    	System.out.println();
    	System.out.println("Details ");
    	System.out.println("Name is : "+name);
    	System.out.println("Age is : "+age);
    }
}

class Employee extends Person {
    private int empid;
    private String position;
    private float salary;

    public Employee() {
        System.out.println("Employee constructor called");
    }

    @Override
    public void acceptrecord(Scanner sc) {
        super.acceptrecord(sc);

        System.out.print("Enter your Employee ID: ");
        empid = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter your Position: ");
        position = sc.nextLine();

        System.out.print("Enter your Salary: ");
        salary = sc.nextFloat();
        sc.nextLine(); // Consume newline
    }
    public void ShowRecord() {
    	super.ShowRecord();
    	System.out.println(" Employee ID is : "+empid);
    	System.out.println("Position is : "+position);
    	System.out.println("Salary is : "+salary);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p = new Employee(); // Upcasting
        p.acceptrecord(sc); // Polymorphism — will call Employee's method
        p.ShowRecord();

        sc.close();
    }
}

