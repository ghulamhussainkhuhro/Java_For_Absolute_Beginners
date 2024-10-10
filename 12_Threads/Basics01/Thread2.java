package Basics01;
class MyThread extends Thread {

	  private final String name;

	  public MyThread(String name) {
	    this.name = name;
	  }

	  @Override
	  public void run() {
	    for (int i = 0; i < 5; i++) {
	      System.out.println(name + " executing task " + (i + 1));
	      try {
	        Thread.sleep(1000); // Simulate some work
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }
	  }
	}

class MyRunnable implements Runnable {

	  private final String name;

	  public MyRunnable(String name) {
	    this.name = name;
	  }

	  @Override
	  public void run() {
	    for (int i = 0; i < 5; i++) {
	      System.out.println(name + " executing task " + (i + 1));
	      try {
	        Thread.sleep(1000); // Simulate some work
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }
	 }
}


public class Thread2 {

	  public static void main(String[] args) {
	    // Create a new thread by extending Thread class
	    MyThread thread1 = new MyThread("Thread-1");

	    // Create another thread using Runnable interface
	    Runnable runnable = new MyRunnable("Thread-2");
	    Thread thread2 = new Thread(runnable);

	    // Start both threads
	    thread1.start();
	    thread2.start();
	  }
	}

	