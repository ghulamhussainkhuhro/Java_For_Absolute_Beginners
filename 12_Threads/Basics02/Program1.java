package Basics02;

public class Program1 extends Thread{
	
	@Override
//	The run method contains the code that the thread will execute.
	public void run() {
//		code to be executed by the thread
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Making object of the class
		Program1 thread1 = new Program1();
//		starting thread
		thread1.start();
//		main thread
		System.out.println("Main thread is running...");
		/* This program extends the Thread class and overrides the run method. 
		 * In the main method, a new thread object is created and then started 
		 * using the start method. This will cause the run method of the new thread 
		 * to be executed concurrently with the main thread.*/

	}

}
