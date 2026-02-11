package question1;

public class Job extends Thread{

	    @Override
	    public void run() {
	    	sync();        
	    }
	    
	    public static synchronized void sync() {
	    	String name = Thread.currentThread().getName();
	        try {
	        	System.out.println("Runner: "+name);
	            Thread.sleep(1000);
//	            System.out.println("Runner: "+name+ "finished");
	        } catch (InterruptedException e) {
	            throw new RuntimeException(e);
	        }
	    }
	    
	    
}
