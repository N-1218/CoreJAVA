package Method_Overloading;
 class over{
	 
	 public void rule(int a,String name){
		 System.out.println("rule 2");
	 }
	 public void rule(int a,int b) {
		 System.out.println("same method name with different parameter");
	 }
 }
public class rule2 {

	public static void main(String[] args) {
		over m= new over();
		m.rule(1, "namrata");
		m.rule(12, 13);

	}

}
