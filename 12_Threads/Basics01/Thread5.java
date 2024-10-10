package Basics01;
class EvenOddThread extends Thread{
	
	public void run() {
		
		for(int i=1; i<=30; i++) {
			try {
				if(i%2==0 && this.getName().equals("Even")) {
					System.out.println(i+" "+this.getName());
					if(i==14) 
						Thread.sleep(5000);
													
				}
				else if (i%2!=0 && this.getName().equals("Odd")){
					System.out.println(i+" "+this.getName());
					if(i==14) 
						Thread.sleep(5000);
				}
				
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.print(e);
			}
		}
		
	}
}

public class Thread5 {

	public static void main(String[] args) throws InterruptedException {
		EvenOddThread e=new EvenOddThread();
		EvenOddThread o=new EvenOddThread();
		
		e.setName("Even");
		o.setName("Odd");
		
		e.start();
		o.start();
		
	}

}
