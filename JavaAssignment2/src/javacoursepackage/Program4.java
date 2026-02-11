package javacoursepackage;
import java.util.Scanner;

class BankAcc {
	private double balance = 30000;
	
	public double getBalance() { 
		return balance; 
	}

	class Transaction{
		double setdepositMoney(double amount) {
			balance+= amount;
			return balance;
		}
		
		double setwithdrawMoney(double amount) {
			balance-=amount;
			return balance;
			
		}
	}
}

public class Program4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		BankAcc obj1 = new BankAcc();
		BankAcc.Transaction obj2 = obj1.new Transaction();
		
		System.out.println("Balance: " + obj1.getBalance());
		
		System.out.println("1.Deposit Money\n2.Withdraw Money\n\nEnter Choice: ");
		int choice = input.nextInt();
		System.out.println("Enter Amount: ");
		double amount = input.nextDouble();
		
		switch(choice) {
		case 1 -> {
			obj2.setdepositMoney(amount);
			System.out.println("Updated Balance: " + obj1.getBalance());
		}
				
		case 2 -> {
			obj2.setwithdrawMoney(amount);
			System.out.println("Updated Balance: " + obj1.getBalance());
		}
		default -> System.out.println("Invalid Choice");
		}
		
	}

}
