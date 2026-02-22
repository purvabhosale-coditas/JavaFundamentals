package room_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.RoomNotFoundException;

public class RoomService {
	
	private List<Room> rooms = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
		
		//default rooms
		public RoomService() {
			rooms.add(new StandardRoom("101",1500));
			rooms.add(new StandardRoom("102",1500));
			rooms.add(new DeluxeRoom("DR101",2500));
			rooms.add(new SuiteRoom("SR101",4000));
		}
		
		public void viewRooms() {
			for (Room r : rooms) {
				 System.out.println(r);
			}
		}
		
		public Room findRoomByNo(String roomNo) {
	        for (Room r : rooms) {
	            if (r.getRoomNo().equalsIgnoreCase(roomNo)) {
	                return r;
	            }
	        }
	        return null;
	    }
		
		public void findRoomByNo() {
			System.out.println("Enter Room No:");
			String roomNo = sc.next();
			Room r = findRoomByNo(roomNo);

	        if (r == null) System.out.println("Room not found!");
	        else System.out.println(r);
		}
		
		public void bookRoom(String roomNo) throws RoomNotFoundException{
			 Room room = findRoomByNo(roomNo);
		        if (room == null) {
		            throw new RoomNotFoundException("Room " + roomNo + " not found");
		        }
		        if (!room.isAvailable()) {
		            throw new RoomNotFoundException("Room " + roomNo + " is already booked!");
		        }
		        room.booked();
		}
		
		public void makeRoomAvailable(String roomNo) throws RoomNotFoundException{
			 Room room = findRoomByNo(roomNo);
			if(room == null) {
				throw new RoomNotFoundException("Room " + roomNo + " not found");
			}
			room.makeAvailable();
		}
		
}
