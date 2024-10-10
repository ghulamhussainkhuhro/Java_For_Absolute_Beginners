package Consumer;
class Quantity{
	int i = 0;
	Boolean setValue = false;
	
	public synchronized void put(int i) {
		while(setValue) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("put : "+i);
		this.i = i;
		setValue = true;
		notify();
	}
	public synchronized void get() {
		while(!setValue) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("put : "+i);
		setValue = false;
		notify();
	}
	
}
class Consumers implements Runnable{
	Quantity q;
	
	Consumers(Quantity q){
		this.q = q;
		Thread t1 = new Thread(this,"Consumers");
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			q.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	


	
}
class Producers implements Runnable{
	Quantity q;
	public Producers(Quantity q) {
		// TODO Auto-generated constructor stub
		this.q = q;
		Thread t1 = new Thread(this,"Producers");
		t1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(true) {
			q.put(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quantity q = new Quantity();
		Producers p1 = new Producers(q);
		Consumers c1 = new Consumers(q);
		
		

	}

}
