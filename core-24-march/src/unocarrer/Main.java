package unocarrer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Cubicle {
    private int number;
    private String reservedBy;

    public Cubicle(int number) {
        this.number = number;
        this.reservedBy = null;
    }

    public boolean isAvailable() {
        return reservedBy == null;
    }

    public boolean reserve(String userName) {
        if (isAvailable()) {
            this.reservedBy = userName;
            return true;
        }
        return false;
    }

    public void cancelReservation() {
        this.reservedBy = null;
    }

    public int getNumber() {
        return number;
    }

    public String getReservedBy() {
        return reservedBy;
    }
}

abstract class Room {
    private String roomType;
    private int roomNumber;
    private Cubicle[] cubicles;

    public Room(String roomType, int roomNumber, int numCubicles) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.cubicles = new Cubicle[numCubicles];
        for (int i = 0; i < numCubicles; i++) {
            cubicles[i] = new Cubicle(i + 1);
        }
    }

    public boolean reserve(String userName) {
        boolean allCubiclesAvailable = true;
        for (Cubicle cubicle : cubicles) {
            if (!cubicle.isAvailable()) {
                allCubiclesAvailable = false;
                break;
            }
        }

        if (allCubiclesAvailable) {
            for (Cubicle cubicle : cubicles) {
                cubicle.reserve(userName);
            }
            return true;
        }
        return false;
    }

    public void cancelReservation() {
        for (Cubicle cubicle : cubicles) {
            cubicle.cancelReservation();
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Cubicle[] getCubicles() {
        return cubicles;
    }
}

class SmallRoom extends Room {
    public SmallRoom(int roomNumber) {
        super("Small", roomNumber, 4);
    }
}

class LargeRoom extends Room {
    public LargeRoom(int roomNumber) {
        super("Large", roomNumber, 10);
    }
}

class ReservationSystem {
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

public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Scanner scanner = new Scanner(System.in);

        // Creating rooms
        for (int i = 1; i <= 5; i++) {
            reservationSystem.getRooms().put(i, new SmallRoom(i));
        }
        for (int i = 6; i <= 7; i++) {
            reservationSystem.getRooms().put(i, new LargeRoom(i));
        }

        // Command-line input
        System.out.println("Welcome to Room Reservation System!");
        System.out.println("Commands:");
        System.out.println("1. Reserve a room");
        System.out.println("2. Cancel reservation");
        System.out.println("3. Exit");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the room number (1-7): ");
                    int roomNumber = scanner.nextInt();

                    System.out.print("Enter the start date (yyyy-MM-dd): ");
                    String startDateString = scanner.next();
                    LocalDate startDate = LocalDate.parse(startDateString, DateTimeFormatter.ISO_DATE);

                    System.out.print("Enter the number of months to reserve: ");
                    int numMonths = scanner.nextInt();

                    System.out.print("Enter your name: ");
                    String userName = scanner.next();

                    reservationSystem.reserveRoom(roomNumber, startDate, numMonths, userName);
                    break;
                case 2:
                    System.out.print("Enter the room number (1-7): ");
                    int cancelRoomNumber = scanner.nextInt();
                    reservationSystem.cancelReservation(cancelRoomNumber);
                    break;
                case 3:
                    System.out.println("Thank you for using the Room Reservation System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);
    }
}