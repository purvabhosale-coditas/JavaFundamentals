package question7;

import java.util.concurrent.locks.ReentrantLock;

public class Job implements Runnable{

	private int value = 0;
	private final ReentrantLock lock = new ReentrantLock();
//	private Condition condition = lock.newCondition();

//	 void increaseValue() {
////	
//			value++;
//	 }
	 
	 public void increaseValue() {
	        lock.lock(); 
	        try {
	        	value++;
	            System.out.println(Thread.currentThread().getName() + " increased value to: "
	            		+ value);
	        } finally {
	            lock.unlock();
	        }
	    }

	 @Override
	 public void run() {
		// TODO Auto-generated method stub
		
	 }
}



