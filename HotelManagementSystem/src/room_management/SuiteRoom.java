package room_management;

public class SuiteRoom extends Room{

	public SuiteRoom(String roomNo, double pricePerDay) {
		super(roomNo, pricePerDay);
	}
	
	@Override
	public String getRoomType() {
		return "SuiteRoom";
	}

}
