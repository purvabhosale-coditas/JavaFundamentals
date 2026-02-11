package javacoursepackage;

import java.util.*;
public class Program9 {
	public static void main(String[] args) {
		HashMap<String,Integer> hm= new HashMap<>();
			
		hm.put("Abc", 1);
		hm.put("Purva", 3);
		hm.put("Sdf", null);
		hm.put(" ", 3);
				
		for(Map.Entry<String, Integer> map: hm.entrySet()) {
			System.out.println(map.getKey() +" " +map.getValue());
		}
		
	System.out.println();
	
	LinkedHashMap<String,Integer> hm1= new LinkedHashMap<>();
	
	hm1.put("Abc", 1);
	hm1.put("Purva", 3);
	hm1.put("Sdf", null);
	hm1.put("wer", 3);
			
	for(Map.Entry<String, Integer> map: hm1.entrySet()) {
		System.out.println(map.getKey() +" " +map.getValue());
	}
	
	System.out.println();
	
	
	TreeMap<String,Integer> thm= new TreeMap<>();
	
	thm.put("Abc", 1);
	thm.put("Purva", 6);
	thm.put("Sdf", null);
	thm.put("wer", 3);
			
	for(Map.Entry<String, Integer> map: thm.entrySet()) {
		System.out.println(map.getKey() +" " +map.getValue());
	}
	
}
	
	
}


