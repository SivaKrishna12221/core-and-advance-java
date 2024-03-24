package programmingQuestions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main 
{
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
