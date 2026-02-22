package reservation_management;

import java.time.LocalDate;

public abstract class Reservation {
	private String reservation_id;
	private String guest_id;
	private LocalDate reservation_date;
	
	public Reservation(String reservation_id, String guest_id, LocalDate reservation_date) {
		this.reservation_id = reservation_id;
		this.guest_id = guest_id;
		this.reservation_date = reservation_date;
	}
	
	public String getReservation_id() {
		return reservation_id;
	}
	
	public void setReservation_id(String reservation_id) {
		this.reservation_id = reservation_id;
	}
	
	public String getGuest_id() {
		return guest_id;
	}
	
	public void setGuest_id(String guest_id) {
		this.guest_id = guest_id;
	}
	
	public LocalDate getReservation_date() {
		return reservation_date;
	}
	
	public void setReservation_date(LocalDate reservation_date) {
		this.reservation_date = reservation_date;
	}

	public abstract String getReservationType();
	
	@Override
	public String toString() {
		return "reservation_id=" + reservation_id + ", guest_id=" + guest_id + ", reservation_date="
				+ reservation_date + ", ";
	}
	
}
