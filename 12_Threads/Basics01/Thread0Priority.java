package Basics01;

class A1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10); // Add a brief pause for better interleaving
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10); // Add a brief pause for better interleaving
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread0Priority {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        B1 obj2 = new B1();

        // Prioritize thread B slightly for more balanced output
        obj1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }
}
