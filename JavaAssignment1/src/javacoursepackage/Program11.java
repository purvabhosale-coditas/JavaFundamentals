package javacoursepackage;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int rows = input.nextInt();
//		int rows = 5;
		
			for(int i=0;i<rows;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				 for (int j = 2; j < (rows - i) * 2; j++) {
		            System.out.print(" ");
		        }
				 for (int j = 0; j <= i; j++) {
		            System.out.print("*");
		         }
				System.out.println();
			}
		
		for(int i=rows;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for (int j = (rows - i)* 2; j>=1; j--) {
	            System.out.print(" ");
	        }
			 for (int j = i-1; j >= 0; j--) {
	            System.out.print("*");
	         }
			System.out.println();
		}
	
	}

}
