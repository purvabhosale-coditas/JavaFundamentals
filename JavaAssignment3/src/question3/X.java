package question3;

class B {
    private Object lock = new Object(); // non-final lock (can be changed!)
    private int counter = 0;

    public void changeLock() {
        lock = new Object();  // lock object replaced
        System.out.println(Thread.currentThread().getName() + " changed lock!");
    }

    public void x() {
        Object local = lock; // capture current lock reference
        synchronized (local) {
            int before = counter;

            try { Thread.sleep(200); } catch (InterruptedException e) {}

            counter = before + 1;
            System.out.println(Thread.currentThread().getName()
                    + " entered with lock=" + System.identityHashCode(local)
                    + " counter=" + counter);
        }
    }
}

public class X {
    public static void main(String[] args) throws Exception {
        B a = new B();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 2; i++) a.x();
        }, "T1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 2; i++) a.x();
        }, "T2");

        Thread changer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                a.changeLock();
            }
        }, "CHANGER");

        t1.start();
        t2.start();
        changer.start();

        t1.join();
        t2.join();
        changer.join();
    }
}
