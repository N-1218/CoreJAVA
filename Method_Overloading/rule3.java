package Method_Overloading ;
class loading{
	public void num(int a,String name) {
		System.out.println("rule 3");
	}
	public void num(String name,int a) {
		System.out.println("Same Method name with different parameter but interchange the sequence of datatype and parameter");
	}
}
public class rule3 {

	public static void main(String[] args) {
		loading l1= new loading();
		l1.num(0, null);
		l1.num(null, 0);

	}

}
