package question10;

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity = 5;

    // Producer
    public synchronized void produce(int item) throws InterruptedException {

        // If buffer is full producer waits
        while (queue.size() == capacity) {
            System.out.println("Buffer full... Producer waiting");
            wait();
        }

        queue.add(item);
        System.out.println("Produced: " + item);

        // Wake up consumer
        notify();
    }

    // Consumer
    public synchronized int consume() throws InterruptedException {

        // If buffer empty is consumer waits
        while (queue.isEmpty()) {
            System.out.println("Buffer empty... Consumer waiting");
            wait();
        }

        int item = queue.remove();
        System.out.println("Consumed: " + item);

        // Wake up producer
        notify();

        return item;
    }
}

public class Job extends Thread {

    private Buffer buffer;
    private boolean isProducer; // true = producer, false = consumer
    public static volatile boolean running = true; //stop flag

    public Job(Buffer buffer, boolean isProducer) {
        this.buffer = buffer;
        this.isProducer = isProducer;
    }

    @Override
    public void run() {
        try {
            if (isProducer) {
                int value = 1;
                while (running) {
                    buffer.produce(value);
                    value++;
                    Thread.sleep(1000);
                }
//                while (value <= 10) {
//                    buffer.produce(value);
//                    value++;
//                    Thread.sleep(1000);
//                }

            } else {
                while (running) {
                    buffer.consume();
                    Thread.sleep(1500);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

