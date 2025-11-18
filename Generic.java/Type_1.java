package Generic.java;

public class Type_1 {
    
public static void main(String[] args) {
		Company <String,Integer>com =new Employee_1();
		com.Salary_slip("namrata");

	}

}
interface Company<T,R>{
	public R Salary_slip(T t);
}
class Employee_1 implements Company<String,Integer> {
	@Override
	public 	 Integer Salary_slip(String name) {
		System.out.println("payments Slip is for "+name);
		return null;
	}
	
}
class emp1 implements Company<Integer,String>{

	@Override
	public String Salary_slip(Integer t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}



