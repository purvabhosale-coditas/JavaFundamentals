package cli;

import java.time.LocalDate;
import java.util.Scanner;

import exceptions.GuestNotFoundException;
import exceptions.InvalidGuestException;
import exceptions.InvalidReservationException;
import exceptions.RoomNotFoundException;
import guest_management.GuestService;
import reservation_management.EventHallReservation;
import reservation_management.Reservation;
import reservation_management.ReservationService;
import reservation_management.RoomReservation;
import reservation_management.SpaReservation;
import room_management.RoomService;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		GuestService guestService = new GuestService();
		RoomService roomService = new RoomService();
	    ReservationService reservationService = new ReservationService();
		
		int choice = -1;
		
		while(choice!=0) {
			System.out.println("1: Add Guest");
			System.out.println("2: View All Guests");
			System.out.println("3: Find Guest by ID");
	        System.out.println("4: View Rooms");
	        System.out.println("5: Make Reservation");
            System.out.println("6: View Reservations");
            System.out.println("7: Cancel Reservation");
			System.out.println("0: Exit");
			System.out.println("Enter Choice:");
			choice = sc.nextInt();
			
			try {
				 switch(choice) {
					 case 1:
	                     guestService.addGuest();
	                     break;
	
	                 case 2:
	                     guestService.viewGuests();
	                     break;
	                     
	                 case 3:
                        guestService.findGuestById();
                        break;
                        
	                 case 4:
                        roomService.viewRooms();
                        break;
                        
	                 case 5:
                        makeReservationUI(sc, guestService, roomService, reservationService);
                        break;
                        
	                 case 6:
                        reservationService.viewReservations();
                        break;
                        
	                 case 7:
                        System.out.print("Enter Reservation ID: ");
                        String rid = sc.next();
                        boolean cancelled = reservationService.cancelReservation(rid, roomService);
                        if (cancelled) System.out.println("Reservation cancelled successfully.");
                        else System.out.println("Reservation not found.");
                        break;
                        
	                 case 0:
                        System.out.println("Thank you. Exiting...");
                        break;
                       
	                 default:
                        System.out.println("Invalid choice.");
				}
			} catch (InvalidGuestException | InvalidReservationException |
                    GuestNotFoundException | RoomNotFoundException e) {
               System.out.println("Error: " + e.getMessage());
           } catch (Exception e) {
               System.out.println("Error: " + e.getMessage());
           }
			
			System.out.println();
			
		}
		
		sc.close();
	}
	
	private static void makeReservationUI(Scanner sc,
            GuestService guestService,
            RoomService roomService,
            ReservationService reservationService)
		throws InvalidReservationException, GuestNotFoundException, RoomNotFoundException {
		
		System.out.println("\nReservation Type:");
		System.out.println("1: Room");
		System.out.println("2: Event Hall");
		System.out.println("3: Spa");
		System.out.print("Enter type: ");
		int type = sc.nextInt();
		
		System.out.print("Enter Reservation ID: ");
        String reservationId = sc.next();
        
        System.out.print("Enter Guest ID: ");
        String guestId = sc.next();

        System.out.print("Enter Date (YYYY-MM-DD): ");
        String dateStr = sc.next();
        LocalDate date = LocalDate.parse(dateStr);
        
        Reservation reservation;

        if (type == 1) {
            System.out.print("Enter Room No: ");
            String roomNo = sc.next();
            reservation = new RoomReservation(reservationId, guestId, date, roomNo);

        } else if (type == 2) {
            System.out.print("Enter Hall Name: ");
            String hallName = sc.next();
            reservation = new EventHallReservation(reservationId, guestId, date, hallName);

        } else if (type == 3) {
            System.out.print("Enter Spa Service Name: ");
            String spaService = sc.next();
            reservation = new SpaReservation(reservationId, guestId, date, spaService);

        } else {
            throw new InvalidReservationException("Invalid reservation type.");
        }
        
        reservationService.makeReservation(reservation, guestService, roomService);

	}

}
