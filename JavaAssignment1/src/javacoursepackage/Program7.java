package javacoursepackage;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int rows = input.nextInt();
		
		for(int i=rows;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
