package question1;

public class Job extends Thread{
	

		static volatile boolean raceOver = false;
		static String winner = null;
		  
	    @Override
	    public void run() {
	    	int i =1;
	    	while (!raceOver && i <=5 ) {
	    		
	    		if (raceOver) {
	                return;
	            }
	    		
	    		
	            if(i == 5) {
//	                raceOver = true;
	                
//	                System.out.println("Winner thread is "+Thread.currentThread().getName()+" "+i);
//	                Thread.currentThread().interrupt();
	                if (declareWinner(Thread.currentThread().getName())) {
	                    System.out.println("Winner thread is " + winner);
	                }
	                
	                return;
//	                break;
	                
	            }
	            else{
	            	System.out.println(Thread.currentThread().getName()+" "+i);
	                try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                	System.out.println(e);
	                	return;
	         
	                }
	            }
	            i++;

	        }  
//	    	if(!raceOver) {
//	    		System.out.println("Over");
//	    	}
	    	
	    }
	    
	    private static synchronized boolean declareWinner(String name) {
	        if (!raceOver) {
	            raceOver = true;
	            winner = name;
	            return true;
	        }
	        return false;
	    }
}   
	    
