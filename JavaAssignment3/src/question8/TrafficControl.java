package question8;

import java.util.concurrent.Semaphore;

public class TrafficControl {

		private Semaphore semaphore = new Semaphore(3, true); //true for maintaining fair order of threads arrival (fcfs)
		
		void passtunnel() {
			try {
				semaphore.acquire();
				System.out.println(Thread.currentThread().getName() + " has entered the tunnel.");
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName() + " has exited the tunnel.\n");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				semaphore.release();
			}
		}
	}

