package question3;

public class Job implements Runnable{
	
	static int balance=5000;
	
	@Override
	public void run() {
		
	}
	
    public synchronized void deposit(int amount) {
    	balance +=amount;
    	System.out.println("Updated balance after Deposit by " + Thread.currentThread().getName() + ": "+ balance);
    }
    
    public synchronized void withdraw(int amount) {
    	if(balance > amount) {
	    	balance -=amount;
	    	System.out.println("Updated balance after Withdrawal by " + Thread.currentThread().getName() + ": " +  balance);
    	}
    	else {
    		System.out.println("Insufficient Funds: " + balance);
    	}
    } 



}
