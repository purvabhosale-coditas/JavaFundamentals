package javacoursepackage;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a target value:");
		int target = input.nextInt();
		
		System.out.println("Indices of the two numbers:");
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.print(i +" "+ j);
					System.out.println();
				}
			}
		}
	}

}
