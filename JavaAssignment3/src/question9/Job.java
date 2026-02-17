package question9;

public class Job {

    private boolean pingTurn = true; 
    
//    void ping() {
//        while (!pingTurn) {}
//        System.out.println("Ping");
//   	 	pingTurn = false;
//    }
//
//    void pong() {
//        while (pingTurn) {}
//        System.out.println("Pong");
//    	pingTurn = true;
//    }

    public synchronized void ping() {
        try {
            while (!pingTurn) {
                wait();
            }
            System.out.println("Ping");
            pingTurn = false;
            notify(); //or use notifyAll() to wake all
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
    }

    public synchronized void pong() {
        try {
            while (pingTurn) {
                wait();
            }
            System.out.println("Pong");
            pingTurn = true;
            notify();
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
    }
}
