import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethod {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 Class<?>student=Student.class;
		 Constructor <?>con=student.getDeclaredConstructor();
		 Student stud=(Student)con.newInstance();
		 
		 Method attend=student.getDeclaredMethod("Attendance");
		 attend.setAccessible(true);
		
		 attend.invoke(stud);
	}

}
class Student{
	public Student() {
		
	}
	private void Attendance(){
		
		System.out.println("Method private attendance ....!");
		
	}
}

