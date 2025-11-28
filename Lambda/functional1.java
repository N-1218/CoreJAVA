package Lambda;

public class functional1 {
    public static void main(String[] args) {
    	//1
     Students<String>stud=(i,j)->{return i+" "+j; };
     System.out.println("Student name : "+stud.Attendance("Namrata", "Malusare"));
     
     //2
     Students<Integer> stud2 = (i, j) -> {return (i / j) * 100;};
     int j = 50;
     j = stud2.Attendance(46, j);
     System.out.println("Total Marks: " + j);
     
     
     //3: Find bigger string
     Students<String> stud3 = (a, b) -> { 
         if (a.length() > b.length()) {
             return a;
         } else {
             return b;
         }
     };

     String bigger = stud3.Attendance("JavaScript", "Programming");
     System.out.println("Bigger String is : " + bigger);


     //4: Find smallest string
     Students<String> stud4 = (y, z) -> {
         if (y.length() < z.length()) {
             return y;
         } else {
             return z;
         }
     };

     String smallest = stud4.Attendance("Python", "Programing");
     System.out.println("Smallest String is : " + smallest);

     
     //5
     Students<String>stud5=(x,a)->{
    	 if(x==a) {
    		 return x;
    	 }else {
    		 return a;
    	 }
     };
     String compare=stud5.Attendance("namrata", "namrata");
     System.out.println("Both name are same : "+compare);
     
    }
}

@FunctionalInterface
interface Students<T>{
    T Attendance(T t1,T t2);
}

