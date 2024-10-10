package Basics01;
class Even extends Thread{
	public void run() {
		for (int i = 0; i < 30; i+=2) {
			synchronized(System.out) {
			    System.out.println("Even: " + i);
			}
		      try {
		    	  if(i==14) {
		    		  Thread.sleep(5000);
		    	  }
		        Thread.sleep(1000); // Simulate some work
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		    }
		  }
	}
	

class Odd extends Thread{
	public void run() {
		for (int i = 1; i < 30; i+=2) {
			synchronized(System.out) {
			    System.out.println("Odd: " + i);
			}
		      try {
		    	  if(i==15) {
		    		  Thread.sleep(5000);
		    	  }
		        Thread.sleep(1000); // Simulate some work
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		    }
		  }
	}
	

	


public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even e1 = new Even();
		Odd o1 =new Odd();
		e1.start();
		o1.start();
		

	}

}
