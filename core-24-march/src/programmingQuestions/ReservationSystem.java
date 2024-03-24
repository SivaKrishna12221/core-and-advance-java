package programmingQuestions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class ReservationSystem 
{
	private Map<Integer, Room> rooms;

    public ReservationSystem() {
        setRooms(new HashMap<>());
    }

    public void reserveRoom(int roomNumber, LocalDate startDate, int numMonths, String userName) {
        Room room = getRooms().get(roomNumber);
        if (room == null) {
            System.out.println("Invalid room number.");
            return;
        }

        LocalDate endDate = startDate.plusMonths(numMonths);
        boolean reserved = room.reserve(userName);
        if (reserved) {
            System.out.println("Reservation successful:");
            System.out.println("Room Type: " + room.getRoomType());
            System.out.println("Room Number: " + room.getRoomNumber());
            System.out.println("User Name: " + userName);
            System.out.println("Start Date: " + startDate.format(DateTimeFormatter.ISO_DATE));
            System.out.println("End Date: " + endDate.format(DateTimeFormatter.ISO_DATE));
        } else {
            System.out.println("Reservation failed: Room is already reserved.");
        }
    }

    public void cancelReservation(int roomNumber) {
        Room room = getRooms().get(roomNumber);
        if (room == null) {
            System.out.println("Invalid room number.");
            return;
        }

        room.cancelReservation();
        System.out.println("Reservation canceled: Room is now available.");
    }

	public Map<Integer, Room> getRooms() {
		return rooms;
	}

	public void setRooms(Map<Integer, Room> rooms) {
		this.rooms = rooms;
	}
}
