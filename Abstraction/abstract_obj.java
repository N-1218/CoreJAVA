package Abstraction;

public class abstract_obj {
    
public static void main(String[] args) {
        School school = new School1();
        school.Students("Sakshi");
        school.Present(2);
    }
}

abstract class School {
    abstract void Students(String name);
    abstract int Present(int number_of_days);
}

class School1 extends School {

    @Override
    void Students(String name) {
        System.out.println("Student name is: " + name);
    }

    @Override
    int Present(int number_of_days) {
        if (number_of_days >= 25) {
            System.out.println("Attendance: " + number_of_days + " Days — Eligible for exam...!");
        } else {
            System.out.println("Attendance: " + number_of_days + " Days — Not eligible for exam...!");
        }
        return number_of_days;
    }
}

