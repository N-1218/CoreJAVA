package Setter_Getter;
import java.util.Objects;

public class User_Generic {
    public static void main(String[] args) {
		Students2 <String,Integer>stud=new Attendance("name");
	}
}

interface Students2<R,T>{
	public R name(T t) throws Exception  ;
}
class Attendance implements Students2 <String,Integer> {
	private String name;
	public Attendance(String Name) {
		this.name=Name;
	}

	public String name(Integer I) throws Exception {
		throw new Exception("not valid");
	}
}
