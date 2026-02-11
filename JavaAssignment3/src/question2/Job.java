package question2;

public class Job extends Thread{
	
		volatile static int counter=0;
		
	    @Override
	    public void run() {
	    	counter++;
	    	System.out.println("Thread 1 Incrementing counter: " +counter);
	    	
	    }
	   
	    public void read() throws InterruptedException {
	    	Thread.sleep(500);
	    	System.out.println("Thread 2 reading counter: " +counter);
	    }

}
