import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateConstructor1 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?>name=Car.class;
		Constructor<?>con=name.getDeclaredConstructor(int.class);
		con.setAccessible(true);
		con.newInstance(12);

	}

}
class Car{
	int a;
	public Car(int a,int b) {
		
	}
	private Car(int a) {
		this.a=a;
		System.out.println("con car");
	}
}
