public class Thread2 {
    public static void main(String[] args) {
		
		Reso r1 = new Reso();
		
		Producer p1 = new Producer(r1);
		Consumer p2 = new Consumer(r1);
		
		p1.start();
		p2.start();
		
		


			
  }
}

class Reso{
	
	List<Integer> list = new ArrayList<Integer>();
	
	public synchronized void add() throws InterruptedException {
		while(true){
		
		System.out.println("adding element");
		list.add(10);
		System.out.println("element is added");
		
		
		}
	}
	
	public synchronized void remove() throws InterruptedException {
		if(list.size()==10) {
			
		System.out.println("removing the element..");
		list.remove(0);
		System.out.println("element is removed..");
		
		
		}
	}
}

class Producer extends Thread{
	Reso res;
	
	public Producer(Reso res) {
		this.res = res;
	}
	
	public void run() {
		
		try {
			Thread.sleep(500);
			res.add();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class Consumer extends Thread{
Reso res;
	
	public Consumer(Reso res) {
		
		
		this.res = res;
	}
	
	public void run() {
		try {
			Thread.sleep(5000);
			res.remove();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


