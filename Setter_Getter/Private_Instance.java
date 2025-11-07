package Setter_Getter;

public class Private_Instance {
    public static void main(String[] args) {
		Students s=new Students();
		s.setname("Namrata");
		s.setage(22);
		System.out.println(s.getname());
		System.out.println(s.getage());
	}
}

class Students{
	private String name;
	private int age;
	
	
	public void setname(String Name) {
		this.name=Name;
		
	}
	public void setage(int Age) {
		this.age=Age;
		
	}
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
}

