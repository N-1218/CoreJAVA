public class Thread3 {
    
public static void main(String[] args) {
		StudentUtilizer stud=new StudentUtilizer();
		Get get =new Get(stud); 
		emailget em=new emailget(stud);
		get.start();
		em.start();
	}

}
class Student{
	String name;
	String mobile_number;
	String address;
	String email;
	
	public Student(String name,String mobile_number,String address,String email) {
		this.name=name;
		this.mobile_number=mobile_number;
		this.address=address;
		this.email=email;
	}
}
class StudentUtilizer{
	List <Student>list=new ArrayList<>();
	

	public synchronized void Singin() throws InterruptedException {
		if(list.size()==2) {
			System.out.println("waiting ");
			wait();
		}
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name : ");
		String name=sc.next();
		System.out.println("Enter mobile_number : ");
		String mobile_number=sc.next();
		System.out.println("Enter Address : ");
		String address=sc.next();
		System.out.println("Enter email : ");
		String email=sc.next();
		sc.close();
		Student st= new Student(null,null,null,null);
		list.add(st);
		 System.out.println("student added.....");
		  System.out.println("Notifying mail sender....");
		  notify();
	}
	
