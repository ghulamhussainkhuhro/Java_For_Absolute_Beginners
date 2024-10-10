package Basics01;

class C {
    int count = 0;

    public synchronized void increment() {
        count++;
    }

    class A3 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 2000; i++) {
                increment();
            }
        }
    }

    class B3 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 2000; i++) {
                increment();
            }
        }
    }
}

public class Thread6 {
    public static void main(String[] args) throws InterruptedException {
        C c = new C();
        Runnable obj1 = c.new A3();
        Runnable obj2 = c.new B3();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join(); // Wait for both threads to finish

        System.out.println(c.count); // Now print the correct count
    }
}
