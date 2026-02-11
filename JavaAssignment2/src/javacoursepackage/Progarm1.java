package javacoursepackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Progarm1 {

	public static void main(String[] args) {
		
		try{
		
		int num1, num2;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		num1 = input.nextInt();
		
		System.out.println("Enter number 2:");
		num2 = input.nextInt();
		
		System.out.println("Division of numbers: " + (num1/num2));
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("Non-integer input");
		}
		finally {
			System.out.println("Program execution completed");
		}
	}

}
