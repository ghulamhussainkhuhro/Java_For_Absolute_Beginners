package Basics02;

public class Program7 extends Thread {
	public synchronized void  run() {
		for(int i = 0; i<= 5; i++) {
			System.out.println("Thread : "+getName()+", Priority : "+getPriority());
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Thread interpreted! ");
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		Program7 t1 = new Program7();
		Program7 t2 = new Program7();
		
		// Set thread priorities (1 is lower, 10 is higher)
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();

	}

}
