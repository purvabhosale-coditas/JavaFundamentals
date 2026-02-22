package reservation_management;

import java.time.LocalDate;

public class RoomReservation extends Reservation{
	private String roomNo;
	
	public RoomReservation(String reservation_id, String guest_id, LocalDate reservation_date, String roomNo) {
		super(reservation_id, guest_id, reservation_date);
		this.roomNo = roomNo;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	@Override
	public String getReservationType() {
		return "RoomReservation";
	}

	@Override
	public String toString() {
		return super.toString().concat("roomNo=" + roomNo);
	}

}
