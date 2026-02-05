package javacoursepackage;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int rows = input.nextInt();
		
		for(int i = 0; i<rows; i++) {
			for(int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= (2*i); j++) {
                System.out.print("*");
            }
            System.out.println();
		}
		for(int i = rows-2; i>=0; i--) {
			for(int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= (2*i); j++) {
                System.out.print("*");
            }
            System.out.println();
		}
	}

}
