package Basics01;
class Table extends Thread{
	int a;
	public void setData(int a) {
		this.a = a;
	}
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(a+" x "+i+" = "+(a*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class Thread1 extends Thread {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t1 = new Table();
		t1.setData(10);
		t1.start();

	}

}
