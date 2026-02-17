package question4;


public class Users {

    public static void main(String[] args) {

    	Accounts acc1 = new Accounts(1, "Account1", 10000);
        Accounts acc2 = new Accounts(2, "Account2", 20000);

        Thread t1 = new Thread(() -> {
            acc1.transferMoney(acc2, 1000);
        });

        Thread t2 = new Thread(() -> {
            acc2.transferMoney(acc1, 1000);
        });

        
        Accounts acc3 = new Accounts(3, "Account3", 10000);
        Accounts acc4 = new Accounts(4, "Account4", 20000);

        Thread t3 = new Thread(() -> {
            acc3.transferMoney(acc4, 1000);
        });

        Thread t4 = new Thread(() -> {
            acc4.transferMoney(acc3, 1000);
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
