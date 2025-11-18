package Generic.java;

public class Type_2 {
    
 public static void main(String[] args) {
        School<String, Integer> sc = new Students1();

        sc.Attendance("Namrata");
        sc.Attendance("Amit");
        sc.Attendance("Riya");
    }
}

interface School<T, R> {
    public R Attendance(T t);
}

class Students1 implements School<String, Integer> {

    @Override
    public Integer Attendance(String name) {
        int attendance;

        // Basic logic based on name
        if (name.equalsIgnoreCase("Namrata")) {
            attendance = 85;
        } else if (name.equalsIgnoreCase("Amit")) {
            attendance = 72;
        } else {
            attendance = 65;
        }

        System.out.println(name + " has " + attendance + "% attendance");
        return attendance;
    }
}

