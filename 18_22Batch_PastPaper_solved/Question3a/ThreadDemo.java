package Question3a;

class ChildThread extends Thread{
	
		public void run() {
			for(int i = 1; i<= 10; i++) {
				System.out.println("thread : " + i);
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
}
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChildThread thread = new ChildThread();
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
		//Main thread will wait until this thread is finished
		thread.join();
		System.out.println("Main Thread is running....");
		

	}

}
