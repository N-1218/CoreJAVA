public class bifunction {
    public static void main(String[] args) {
	BiFunction<String,String,Integer>bi=demo::add;
	System.out.println(bi.apply("abc", new String("abc")));

	}

}
class demo{
	public static int add(String a,String b) {
		return a.length()+b.length();
	}
}


