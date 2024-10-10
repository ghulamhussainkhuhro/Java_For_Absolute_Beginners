package Basics01;

class A2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10); // Add a brief pause for better interleaving
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10); // Add a brief pause for better interleaving
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread0Runnable {
    public static void main(String[] args) {
//    	Creating reference of interface(Runnable in this case) and object of a class
    	Runnable obj1 = new A2();
    	Runnable obj2 = new B2();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        t2.start();
    }
}
