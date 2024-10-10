package Basics02;

//Synchronized thread 
class Counter1 {
	public static int count = 0;
	
	// Using a synchronized static method for direct access
    public static synchronized int incrementAndGet() {  
        return count++;
    }
}

public class Program6 extends Thread {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            Counter1.incrementAndGet();  // Accessing the synchronized method
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Program6 t1 = new Program6();
        Program6 t2 = new Program6();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Counter value: " + Counter1.count);  // Should consistently print 2000
        
    }
}
