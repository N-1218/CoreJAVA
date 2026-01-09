import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateConstructor2 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?>car=Car1.class;
		Constructor<?>con=car.getDeclaredConstructor(String.class);
		con.setAccessible(true);
		con.newInstance("12");
		Constructor<?>[]conn=car.getDeclaredConstructors();
		for(Constructor<?> co:conn ) {
		System.out.println(co);
		System.out.println(co.getParameterCount());
		System.out.println(co.getModifiers());
		}
		

	}

}

class Car1{
	public Car1() {
		System.out.println("Public constructor ...!");
	}
	private Car1(String a) {
		System.out.println("Private constructor...!");
	}
}

