package Question3b;

class Random extends Thread{
	int[] array = new int[1000]; 
	int upperLimit = 0;
	static double average = 0;
	
	public  Random(int upperLimit) {
		this.upperLimit = upperLimit;
	}
	
	public synchronized void run() {
		for(int i = 0; i < 1000; i++) {
			array[i] = (int) (Math.random()*upperLimit);
		}
	}
	
	public void printAverage() {
		for(int i : array) {
			average += i;
		}
		average /= 1000;
	}
}

public class Q3Random {
	public static void main(String[] args) throws InterruptedException {
		Random r1 = new Random(1000);
		r1.start();
		r1.join();
		r1.printAverage();
		System.out.println(Random.average);
		
	}

}
