package programmingQuestions;
/*cubicles and 5 small private rooms and 2 large
 *  private rooms .Small  room consists of 4 
 * cubicles and large room consists of 10 cubicles.
 * When users reserve a room,all cubicles within
 *  that room will be reserved in their name . 
 *  Users can reserve one or more cubicles /rooms 
 *  for a month. 
write a program to allow users to do the following
 actions (using command line input)  
Reserve cubicles /rooms
 - Start date
- Number of months to reserve
-  Name of the user who is making the reservation
Write appropriate  classess ,derived classess ,
constructors ,getter/setter  methods.By using java

*/
public class Cubicle {
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
