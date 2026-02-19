package coditas;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class AadhaarCardSystem {

	public static void main(String[] args) {
		LinkedHashMap<String, String> hpdetails = new LinkedHashMap<>();
		hpdetails.put("Name", "Harry Potter");
		hpdetails.put("DOB", "31-07-1980");
		hpdetails.put("Mobile", "7261925367");
		hpdetails.put("Address", "Pune");
		
		LinkedHashMap<String, String> lpdetails = new LinkedHashMap<>();
		lpdetails.put("Name", "Lily Potter");
		lpdetails.put("DOB", "30-01-1960");
		lpdetails.put("Mobile", "1264425367");
		lpdetails.put("Address", "Pune");
		
		LinkedHashMap<String, String> jpdetails = new LinkedHashMap<>();
		jpdetails.put("Name", "James Potter");
		jpdetails.put("DOB", "27-03-1960");
		jpdetails.put("Mobile", "8264425367");
		jpdetails.put("Address", "Pune");
		
		LinkedHashMap<String, String> hpdriving = new LinkedHashMap<>();
		hpdriving.put("License No.", "Harry Potter");
		hpdriving.put("Expiry Date", "11-08-2025");

		LinkedHashMap<String, LinkedHashMap<String, String>> harryPotter = new LinkedHashMap<>();
		harryPotter.put("Basic Details", hpdetails);
		harryPotter.put("Driving License Details", hpdriving);
		
		LinkedHashMap<String, LinkedHashMap<String, String>> lilyPotter = new LinkedHashMap<>();
		lilyPotter.put("Basic Details", hpdetails);

		LinkedHashMap<String, LinkedHashMap<String, String>> jamesPotter = new LinkedHashMap<>();
		jamesPotter.put("Basic Details", hpdetails);
		
		TreeMap<Long,LinkedHashMap<String, LinkedHashMap<String, String>>> aadhar = new TreeMap<>();
		aadhar.put(991227681291L, harryPotter);
		aadhar.put(841227686291L, lilyPotter);
		aadhar.put(121227683441L, jamesPotter);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Aadhaar No.:");
		Long number = sc.nextLong();
		
		System.out.println("Aadhaar Card Details:-");
		System.out.println();
		if(aadhar.containsKey(number)) {
			System.out.println("Aadhaar Number: " + number);
			
			LinkedHashMap<String, LinkedHashMap<String, String>> personDetails = aadhar.get(number);
			for (String section : personDetails.keySet()) {
				System.out.println();
				System.out.println(section + ":");
				
				LinkedHashMap<String, String> details = personDetails.get(section);
				for (String key : details.keySet()) {
					System.out.println(key + ":" + details.get(key));
				}
			}

		}else {
			System.out.println("Aadhar Card Not Found");
		}
		
		sc.close();
	}

}
