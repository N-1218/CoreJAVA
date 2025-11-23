package Lambda;

public class functional1 {
     public static void main(String[] args) {
        
        Students<Integer> stud = (day) -> day - 10; 
        System.out.println(stud.Present_day(50));
    

    Students1<Integer>stud1=(day1)->System.out.print(day1);
    stud1.Present_day(20);
    }
}

@FunctionalInterface
interface Students<T>{
    T Present_day(T t1);
}

@FunctionalInterface
interface Students1<T>{
    void Present_day(T t1);
}
