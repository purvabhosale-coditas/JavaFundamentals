package javacoursepackage;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side of a square:");
		int side = sc.nextInt();
		
		System.out.println("Area of square:" + (side*side));
	}

}
