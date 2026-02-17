package question2;

public class Job extends Thread{

    volatile int counter = 0;

    public void increment() {
        counter++; 
        System.out.println(Thread.currentThread().getName()
                + " incrementing counter: " + counter);
    }

    public void read() {
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println(Thread.currentThread().getName()
                + " reading counter: " + counter);

     }
}
