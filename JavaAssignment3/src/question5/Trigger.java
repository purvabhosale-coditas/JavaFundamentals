package question5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Trigger {

	public static void main(String[] args) {
		int workers = 3;
		ExecutorService threadpool = Executors.newFixedThreadPool(workers);
		
//		for(int i=1;i<6;i++) {
//			threadpool.submit(new Tasks(i, "Task"));
//		}
//		threadpool.submit(new Tasks(1, "Process image X"));
//		threadpool.submit(new Tasks(2, "Download file A"));
//		threadpool.submit(new Tasks(3, "Download file B"));
//		threadpool.submit(new Tasks(4, "Process image Y"));
//		threadpool.submit(new Tasks(5, "Download file C"));
//		threadpool.submit(new Tasks(6, "Process image Z"));
		
		List<Tasks> tasks = new ArrayList();
		tasks.add(new Tasks(1, "Process image X"));
		tasks.add(new Tasks(2, "Download file A"));
		tasks.add(new Tasks(3, "Download file B"));
		tasks.add(new Tasks(4, "Process image Y"));
		
		for (Tasks t : tasks) {
			threadpool.submit(t);
		}
                
		threadpool.shutdown();
		System.out.println("Tasks are now submitted.");
		
		try {
			threadpool.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Tasks are now finished.");
	}

}
