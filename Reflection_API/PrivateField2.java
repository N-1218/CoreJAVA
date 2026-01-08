public class PrivateField2 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?>student=Student2.class;
		Constructor<?> con=student.getDeclaredConstructor();
		Student2 stud=(Student2)con.newInstance();
		
		Field f=student.getDeclaredField("name");
		f.setAccessible(true);
		System.out.println(f.get(stud));
		if(f.get(stud).equals("Namrata")) {
			f.set(stud, "Malusare");
		}
		System.out.println(f.get(stud));
		
	}

}
class Student2{
	private String name="Namrata";	
	
	public Student2() {
		
	}

}
