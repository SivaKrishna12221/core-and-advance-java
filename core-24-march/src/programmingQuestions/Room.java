package programmingQuestions;

public abstract class Room {
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
