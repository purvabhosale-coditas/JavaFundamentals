package question8;


public class Trigger {

	public static void main(String[] args) {
		TrafficControl obj = new TrafficControl();
		
		for(int i=1;i<=6;i++) {
			Thread t = new Thread(() ->{
				obj.passtunnel();
			}, "Car" + i);
			
			t.start();
		}	
	}

}
