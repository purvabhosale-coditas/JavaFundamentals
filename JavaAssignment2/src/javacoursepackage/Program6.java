package javacoursepackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program6 {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("Purva");
		names.add("Ayush");
		names.add("Kalyani");
		names.add("Nandini");
	
		System.out.println("All employee names:");
		names.forEach(name->System.out.println(name));
		
		System.out.println("\nEmployee name starting with 'A':");
		names.forEach(name->{
			if(name.charAt(0) == 'A') {
				System.out.println(name);
			}
		});
		
		System.out.println("\nEmployee names alphabetically:");
		Collections.sort(names);
//		names.sort(null);
		names.forEach(name->System.out.println(name));
	}

}
