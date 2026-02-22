package guest_management;

import java.util.ArrayList;

public class Guest {

	private String guest_id;
	private String guest_name;
	private String guest_contact;
	
	public Guest(String guest_id, String guest_name, String guest_contact) {
		this.guest_id = guest_id;
		this.guest_name = guest_name;
		this.guest_contact = guest_contact;
	}

	public String getGuest_id() {
		return guest_id;
	}

	public void setGuest_id(String guest_id) {
		this.guest_id = guest_id;
	}

	public String getGuest_name() {
		return guest_name;
	}

	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}

	public String getGuest_contact() {
		return guest_contact;
	}

	public void setGuest_contact(String guest_contact) {
		this.guest_contact = guest_contact;
	}

	@Override
	public String toString() {
		return "ID= " + guest_id + ", Name= " + guest_name + ", Contact= " + guest_contact;
	}
}
