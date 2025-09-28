package Method_Overloading;
class method{
 public void num(int a,int b) {
	 System.out.println("rule 1");
 }
 public void num(int a,int b,int c) {
	 System.out.println("Same Method ");
 }
 
}
public class rule {

	public static void main(String[] args) {
		method m1=new method();
		 m1.num(12, 18);
		m1.num(12,432, 432);
		
		

	}

}
