package room_management;

public class StandardRoom extends Room{

	public StandardRoom(String roomNo, double pricePerDay) {
		super(roomNo, pricePerDay);
	}
	
	@Override
	public String getRoomType() {
		return "StandardRoom";
	}

}
