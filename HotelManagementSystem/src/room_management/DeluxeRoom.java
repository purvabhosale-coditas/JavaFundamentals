package room_management;

public class DeluxeRoom extends Room{

	public DeluxeRoom(String roomNo, double pricePerDay) {
		super(roomNo, pricePerDay);
	}
	
	@Override
	public String getRoomType() {
		return "DeluxeRoom";
	}

}
