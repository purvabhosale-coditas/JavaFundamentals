package room_management;

public class Room {
	private String roomNo;
	private double pricePerDay;
	private boolean available;
	
	public Room(String roomNo, double pricePerDay) {
		this.roomNo = roomNo;
		this.pricePerDay = pricePerDay;
		this.available = true;
	}
	
	public String getRoomNo() {
		return roomNo;
	}
	
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	
	public double getPricePerDay() {
		return pricePerDay;
	}
	
	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public void booked() {
		this.available = false;
	}
	
	public void makeAvailable() {
		this.available = true;
	}
	
	public String getRoomType() {
		return "Room";
	}

	@Override
	public String toString() {
		return "roomNo=" + roomNo + ", pricePerDay=" + pricePerDay + ", available=" + available + " ";
	}
	
	
}
