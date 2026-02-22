package guest_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.InvalidGuestException;

public class GuestService {
	
	private List<Guest> guests = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public void addGuest() throws InvalidGuestException{
		 System.out.println("Enter Guest ID:");
		 String guest_id = sc.next();
		 for (Guest g : guests) {
			if(g.getGuest_id().equalsIgnoreCase(guest_id)) {
				throw new InvalidGuestException("Duplicate guest! Guest ID "
			+ guest_id + " already exists.");
			}
		 }
		 System.out.println("Enter Guest Name:");
		 String guest_name = sc.next();
		 System.out.println("Enter Guest Contact:");
		 String guest_contact = sc.next();
		 guests.add(new Guest(guest_id, guest_name, guest_contact));
		 System.out.println("Guest added successfully.");
	}
	
	public void viewGuests() {
		if (guests.isEmpty()) {
            System.out.println("No guests found.");
            return;
        }
		System.out.println("All guests details:");
//		for(int i=1; i<=guests.size(); i++) {
//			 System.out.println("Guest "+ i +":");
//		 }
		for (Guest g : guests) {
			 System.out.println(g);
		}
	}
	
	public Guest findGuestById(String guest_id) {
        for (Guest g : guests) {
            if (g.getGuest_id().equalsIgnoreCase(guest_id)) {
                return g;
            }
        }
        return null;
    }
	
	public void findGuestById() {
		if (guests.isEmpty()) {
            System.out.println("No guests found.");
            return;
        }
		else {
			System.out.println("Enter Guest ID:");
			String guest_id = sc.next();
			
			Guest g = findGuestById(guest_id);
			
			 if (g == null) {
		            System.out.println("Guest not found!");
        	 } else {
	            System.out.println(g);
	          }
		}
	}

}
