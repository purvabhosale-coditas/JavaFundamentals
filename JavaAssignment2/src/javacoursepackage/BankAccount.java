package javacoursepackage;

import java.util.Scanner;

public class BankAccount {
	private double balance = 30000;
	
	class Transaction{
		double depositMoney(double amount) {
			balance+= amount;
			return balance;
		}
		
		double withdrawMoney(double amount) {
			balance-=amount;
			return balance;
			
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		BankAccount obj1 = new BankAccount();
		BankAccount.Transaction obj2 = obj1.new Transaction();
		
		System.out.println("Balance: " + obj1.balance);
		
		System.out.println("1.Deposit Money\n2.Withdraw Money\n\nEnter Choice: ");
		int choice = input.nextInt();
		System.out.println("Enter Amount: ");
		double amount = input.nextDouble();
		
		switch(choice) {
		case 1 -> {
			obj2.depositMoney(amount);
			System.out.println("Updated Balance: " + obj1.balance);
		}
				
		case 2 -> {
			obj2.withdrawMoney(amount);
			System.out.println("Updated Balance: " + obj1.balance);
		}
		default -> System.out.println("Invalid Choice");
		}
		

	}
}

