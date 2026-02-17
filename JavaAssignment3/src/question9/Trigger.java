package question9;

public class Trigger {

    public static void main(String[] args) throws InterruptedException {

        Job obj = new Job();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                obj.ping();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                obj.pong();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
