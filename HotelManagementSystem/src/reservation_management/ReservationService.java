package reservation_management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import exceptions.GuestNotFoundException;
import exceptions.InvalidReservationException;
import exceptions.RoomNotFoundException;
import guest_management.Guest;
import guest_management.GuestService;
import room_management.RoomService;

public class ReservationService {
		
	private List<Reservation> reservations = new ArrayList<>();

	public void makeReservation(Reservation reservation,
            GuestService guestService,
            RoomService roomService)
			throws InvalidReservationException, GuestNotFoundException, RoomNotFoundException {
			
			// basic validations
			if (reservation == null) {
			throw new InvalidReservationException("Reservation cannot be null.");
			}
		    
			if (reservation.getReservation_id() == null || reservation.getReservation_id().trim().isEmpty()) {
	            throw new InvalidReservationException("Reservation ID cannot be empty.");
	        }

	        if (reservation.getGuest_id() == null || reservation.getGuest_id().trim().isEmpty()) {
	            throw new InvalidReservationException("Guest ID cannot be empty.");
	        }
		    
	       // date validation (today or future only)
	        LocalDate date = reservation.getReservation_date();
	        if (date == null || date.isBefore(LocalDate.now())) {
	            throw new InvalidReservationException("Reservation date must be today or future.");
	        }

	        // guest exist validation
	        Guest g = guestService.findGuestById(reservation.getGuest_id());
	        if (g == null) {
	            throw new GuestNotFoundException("Guest " + reservation.getGuest_id() + " does not exist.");
	        }
	        
	        // if room reservation available then book the room
	        if (reservation instanceof RoomReservation) {
	            RoomReservation rr = (RoomReservation) reservation;
	            roomService.bookRoom(rr.getRoomNo());
	        }

	        reservations.add(reservation);
	        System.out.println("Reservation created successfully.");
	    }
	
		public void viewReservations() {
			 if (reservations.isEmpty()) {
		            System.out.println("No reservations found.");
		            return;
		        }
			 System.out.println("All reservations:");
	        for (Reservation r : reservations) {
	            System.out.println(r.getReservationType() + " -> " + r);
	        }
		}
		
		public boolean cancelReservation(String reservationId, RoomService roomService)
	            throws InvalidReservationException, RoomNotFoundException{
			
			 if (reservationId == null || reservationId.trim().isEmpty()) {
		            throw new InvalidReservationException("Reservation ID cannot be empty.");
		        }
			 
			 for (int i = 0; i < reservations.size(); i++) {
				 Reservation r = reservations.get(i);
				 if (r.getReservation_id().equalsIgnoreCase(reservationId)) {
					 
					 // make room available again                
	 					if (r instanceof RoomReservation) {
	 					RoomReservation rr = (RoomReservation) r;
	 					roomService.makeRoomAvailable(rr.getRoomNo());
	 					}
	 
 					reservations.remove(i);
 					return true;
				 }
			 }
			return false;
		}

}