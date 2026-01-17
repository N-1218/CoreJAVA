public enum Functional {

public static void main(String[] args) {
		Predicate<Integer>evn=even::numevn;
		System.out.println(evn.test(10));
		Predicate<Integer>odd=even::isodd;
		System.out.println(odd.test(20));

		Function<Integer,Integer>func=fun::add;
		System.out.println(func.apply(21));
		
		Consumer<String>con=consu::run;
		con.accept("namrata");
	}

}
//@FunctionalInterface
//interface Parent{
//	void parentmethod();
//}
//interface child extends  Parent{
//	void child();
//}

class even{
	public static boolean  numevn(int num) {
		return num%2==0;
	}
	public static boolean isodd(int num1) {
		return num1%3==0;
	}
}
class fun{
	
	public static int add(int a) {
		
		return a+a;
	}

}
class consu{
	public static void run(String name) {
		System.out.println(name);
	}
}

