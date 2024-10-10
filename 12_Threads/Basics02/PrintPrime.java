package Basics02;

class Prime extends Thread{
	int count = 0;
	public void run() {
		System.out.println("1 is neither prime nor composite");
		for(int i =2; i<=30; i++) {
			for(int j = 2; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println(i+" is Prime");
			}
			count=0;
		}
	}
}

class NotPrime extends Thread{
	static int count = 0;
	public void run() {
		for(int i =2; i<=30; i++) {
			count = 0;
			for(int j = 2; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count != 1) {
				System.out.println(i+" is not  Prime");
			}
			count=0;
		}
	}
}

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prime t1 = new Prime();
		NotPrime t2 = new NotPrime();
		
		t1.start();
		t2.start();
		
		

	}

}
