package question4;

public class Accounts {

	private final int id;
    int balance;
    private final Object lock = new Object();
    String accname;

    Accounts(int id, String accname, int balance) {
        this.id = id;
        this.accname = accname;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(accname + " after deposit: " + balance);
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accname + " after withdrawal: " + balance);
            return true;
        }
        System.out.println(accname + " insufficient funds");
        return false;
    }

    public void transferMoney(Accounts to, int amount) {

        // lock order
    	Accounts first = (this.id < to.id) ? this : to;
        Accounts second = (this.id < to.id) ? to : this;


        synchronized (first.lock) {
            synchronized (second.lock) {
            	System.out.println(accname + " transferring to " + to.accname + "..." );
                if (withdraw(amount)) {
                    to.deposit(amount);
                    System.out.println("Transfer successful\n");
                }
            }
        }
    }
}
