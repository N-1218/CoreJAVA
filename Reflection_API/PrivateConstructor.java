import java.lang.reflect.Constructor;

public class PrivateConstructor {
     public static void main(String[] args) {
		Class<?>name=Car.class;
		Constructor<?>[]con=name.getDeclaredConstructors();
		
		for(Constructor<?> c : con) {
			System.out.println(c.getClass());
			System.out.println(c.getModifiers());
			System.out.println(c.getParameterCount());
			Class <?>[]cn=c.getParameterTypes();
		
		for(Class<?>p : cn) {
			System.out.println(p.getName());
			System.out.println(p.getClass());
			
		}
		System.out.println("*************");
	}
		

	}

}
class Car{
	int a;
	public Car(int a,int b) {
		
	}
	private Car(int a) {
		this.a=a;
	}
}




