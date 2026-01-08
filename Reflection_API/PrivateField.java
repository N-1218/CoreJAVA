public class PrivateField {
    
public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
	Class<?>student=Student1.class;
	Constructor<?>con =student.getDeclaredConstructor();
	Student1 Stud=(Student1)con.newInstance();
	Field field=student.getDeclaredField("a");
	field.setAccessible(true);
	field.set(Stud, 12);
	System.out.println(field.get(Stud));

	
	
	}

}
class Student1{
	private int a;
	public Student1() {
		
	}
}
