package Multi_Threading;

public class Runnable2 {
    
public static void main(String[] args) {
	 Thread th=new Thread(new Run());
	 th.start();

	}

}
class Run implements Runnable{
	public void run () {
	     System.out.println("Method Run....! ");
	     
	}
}