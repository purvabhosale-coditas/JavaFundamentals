package question10;

public class Trigger {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Job producer = new Job(buffer, true);
        Job consumer = new Job(buffer, false);

        producer.start();
        consumer.start();
        
        try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Job.running = false;
        
        System.out.println("Main thread stopped");
    }
}
