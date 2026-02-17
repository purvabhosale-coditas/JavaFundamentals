package question6;

import java.util.concurrent.CountDownLatch;

public class Trigger {

    public static void main(String[] args) {

        CountDownLatch l1 = new CountDownLatch(1);
        CountDownLatch l2 = new CountDownLatch(1);
 

        Thread t1 = new Thread(new RelayRace("Runner 1", null, l1));
        Thread t2= new Thread(new RelayRace("Runner 2", l1, l2));
        Thread t3 = new Thread(new RelayRace("Runner 3", l2, null));

        t1.start();
        t2.start();
        t3.start();

    }
}
