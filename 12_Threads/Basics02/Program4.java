package Basics02;

public class Program4 extends Thread{
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Thread "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Thread interrupted!");
			}
		}
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Program4 p4 = new Program4();
		p4.start();
		 // Wait for the joined thread to finish before continuing
		p4.join();
		
		System.out.println("Main thread running...");

	}

}
