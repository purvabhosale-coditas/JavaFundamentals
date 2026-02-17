package question2;

public class Trigger {

    public static void main(String[] args) throws InterruptedException {

        Job job = new Job();

        Thread t1 = new Thread(() -> job.increment(), "Increment-Thread");
        Thread t2 = new Thread(() -> job.read(), "Reader-Thread");

        t1.start();
        t2.start();
    }
}
