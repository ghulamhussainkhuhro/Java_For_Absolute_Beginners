package Basics02;
//UnSynchronized thread 
class Counter {
	public static int count = 0;
}

public class Program5 extends Thread {
	public void run() {
		for(int i = 0; i <= 1000; i++) {
			increament();
		}
	}
	
	public void increament() {
		Counter.count++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Program5 t1 = new Program5();
		Program5 t2 = new Program5();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
//		The value should be returned to be 2000 but this will not happen
		System.out.println("Counter value : "+ Counter.count);

	}

}
