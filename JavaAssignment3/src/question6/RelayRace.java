package question6;

import java.util.concurrent.CountDownLatch;

public class RelayRace implements Runnable {

    String runnerName;
    CountDownLatch wait;   
    CountDownLatch next;     

    RelayRace(String runnerName, CountDownLatch wait, CountDownLatch next) {
        this.runnerName = runnerName;
        this.wait = wait;
        this.next = next;
    }

    @Override
    public void run() {

        try {
            // wait for previous runner latch to countdown to 0
            if (wait != null) {
                wait.await();
            }

            System.out.println(runnerName + " started");
            Thread.sleep(1000);
            System.out.println(runnerName + " finished");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (next != null) {
            next.countDown(); //countdown to 0
//            System.out.println(next.getCount());
        }
    }
}
