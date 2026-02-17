package question1;

public class Trigger {

	public static void main(String[] args) throws InterruptedException {
//		Job t1 = new Job("Runner 1");
//        Job t2 = new Job("Runner 2");
//        Job t3 = new Job("Runner 3");
        
        Job t1 = new Job();
        Job t2 = new Job();
        Job t3 = new Job();
        
        t1.start();
        t2.start();
        t3.start();

	}
	
	  
}


