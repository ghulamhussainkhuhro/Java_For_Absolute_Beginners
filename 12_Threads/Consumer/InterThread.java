package Consumer;

class Q{
	int num;
	boolean setValue = false;
	
	public synchronized void put(int num) {
		while(setValue) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Put : "+num);
		this.num = num;
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
		System.out.println("Get : "+num);
		setValue = false;
		notify();
	}
}
class Producer implements Runnable{
	Q q;
	Producer(Q q){
		this.q = q;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	
	@Override
	public void run() {
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
class Consumer implements Runnable{
	Q q;
	public Consumer(Q q) {
		// TODO Auto-generated constructor stub
		this.q = q;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	
	@Override
	public void run() {
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

public class InterThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		new Producer(q);
		new Consumer(q);

	}

}
