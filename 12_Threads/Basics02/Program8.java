package Basics02;


public class Program8 extends Thread {
	public void run() {
		for(int i=0; !isInterrupted(); i++) {
			System.out.println("Thread running..." + i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("Thread was interrupted...!");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Program8 t1 = new Program8();
		t1.start();
		Thread.sleep(5000);
		t1.interrupt();
		System.out.println("Main waiting for join to finish up t1 thread...");
		t1.join();
		System.out.println("Main thread finished!");

	}

}
