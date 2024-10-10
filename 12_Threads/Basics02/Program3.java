package Basics02;

public class Program3 extends Thread {
	
	public void run() {
		System.out.println("Thread started working...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread interrupted!");
		}
		
		System.out.println("Thread finished working!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program3 thread= new Program3();
		thread.start();
		
		System.out.println("Main thread running...");

	}

}
