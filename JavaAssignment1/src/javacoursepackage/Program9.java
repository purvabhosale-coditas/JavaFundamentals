package javacoursepackage;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Program9 {

	public static void main(String[] args) {
		File file = new File("Problesm9.txt");
		
		try{
			Scanner input = new Scanner(file);
		
		int count = 0;
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			
			for(int i=0;i<line.length();i++) {
				if(line.charAt(i)=='a'|| line.charAt(i)=='e'|| 
						line.charAt(i)=='i'|| line.charAt(i)=='o'|| line.charAt(i)=='u') {
					count++;
				}
			}
		}
		System.out.println("Number of lowercase vowels:" + count);
	}
		catch(FileNotFoundException e) {
			System.out.println("File not found: " + file);
		}
	}

}
