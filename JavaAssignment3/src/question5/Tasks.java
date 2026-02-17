package question5;

public class Tasks implements Runnable{

	private int id;
	String taskname;
	public Tasks(int id, String taskname){
		this.id = id;
		this.taskname = taskname;
	}
	
	@Override
	public void run() {
		System.out.println("Task " + id + " "+ taskname + " started by "
				+ Thread.currentThread().getName() + "...");
		
		System.out.println("Task: "+ id + " finished...");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
