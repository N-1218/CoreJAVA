package Multi_Threading;

public class Runnable1 {
    public static void main(String[] args) {
	Student2 stud=new Student2();
	Thread th=new Thread(stud);	
	th.start();
	}

}

class Student2 implements Runnable{
	public void run() {
		for(int i=1;i<20;i++) {
			System.out.println(i);
		}
	}
}
