package Exception.exception;

public class Nullpointerexception {
	public static void main(String[] args) {
	String name=null;
	try {
		System.out.println(name.length());
	}catch(NullPointerException n) {
		System.out.println(n.getMessage());
	}finally {
		System.out.println("program closed");
	}
	}
}


