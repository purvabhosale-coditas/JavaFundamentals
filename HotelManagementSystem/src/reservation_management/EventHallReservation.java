package reservation_management;

import java.time.LocalDate;

public class EventHallReservation extends Reservation{
	
	private String hallname;

	public EventHallReservation(String reservation_id, String guest_id, LocalDate reservation_date, String hallname) {
		super(reservation_id, guest_id, reservation_date);
		this.hallname = hallname;
	}

	@Override
	public String getReservationType() {
		return "EventHallReservation";
	}
	
	@Override
	public String toString() {
		return super.toString().concat("Hallname=" + hallname);
	}

}
