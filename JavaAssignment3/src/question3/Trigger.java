package question3;


public class Trigger {

	public static void main(String[] args){
	 	Job job = new Job();
	 	
	 	
	 	Thread t1 = new Thread(()-> {
	 			try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	 			job.deposit(100);
	 	});
	 	
	 	Thread t2 = new Thread(()-> {
	 			try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	 			job.withdraw(2000);
	 	});
	 	
	 	Thread t3 = new Thread(()-> {
 			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
 			job.deposit(100);
 	});
	 	
	 	Thread t4 = new Thread(()-> {
 			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
 			job.withdraw(2000);
 	});
	 	
	 	t1.start();
	 	t2.start();
	 	t3.start();
	 	t4.start();
}
}
