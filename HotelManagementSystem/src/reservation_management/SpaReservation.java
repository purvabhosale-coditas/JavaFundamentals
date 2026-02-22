package reservation_management;

import java.time.LocalDate;

public class SpaReservation extends Reservation {
	private String spaServiceName;
	
	public SpaReservation(String reservation_id, String guest_id, LocalDate reservation_date, String spaServiceName) {
		super(reservation_id, guest_id, reservation_date);
		this.spaServiceName = spaServiceName;
	}

	@Override
	public String getReservationType() {
		return "SpaReservation";
	}
	
	@Override
	public String toString() {
		return super.toString().concat("SpaServiceName=" + spaServiceName);
	}

}
