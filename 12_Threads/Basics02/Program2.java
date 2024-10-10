package Basics02;

public class Program2 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new Runnable object
		Runnable R1 = new Program2();
		
		 // Create a new thread object with the Runnable object
		Thread t1 = new Thread(R1);
		
		// Start the thread
		t1.start();
		
		System.out.println("Main thread is running...");

	}

	

}
