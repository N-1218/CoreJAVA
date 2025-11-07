package Abstraction;

public class INterface {
    public static void main(String[] args) {
		
		c ca=new c();
		ca.ad();
	}

}
interface a{
	abstract void ab();
	
	
	public static void ad() {
		System.out.println("petrol");
	}
}
interface b{
	abstract void ba();
	
	
	public static void ad() {
		System.out.println("disel");
	}
	
}
class c implements a,b{

	@Override
	public void ba() {
		System.out.println("ba");
		
	}

	@Override
	public void ab() {
		System.out.println("ab");
		
	}
	public static void ad() {
		a.ad();
		b.ad();
	}
}

