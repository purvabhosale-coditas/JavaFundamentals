package question7;

public class Trigger {


	public static void main(String[] args) throws Exception {

		final Job rl = new Job();
		
		Thread t1 = new Thread(() ->{
					rl.increaseValue();
		});
		
		
		Thread t2 = new Thread(() ->{
			rl.increaseValue();
		});

		t1.start();
		t2.start();

	}
}


