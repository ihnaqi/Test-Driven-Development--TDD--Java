package manager;

/**
 * Represents a Room within a {@link Hotel}.
 * 
 * @author mdixon
 *
 */
public class Room implements SecuredAccess {

	/**
	 * The room number within the hotel.
	 */
	private int roomNum;
	private Object occupants;
	private Object setOccupant;

	private String roomCode = "9999";
	// TODO:Part2 add attribute to store access code
	
	
	// TODO:Part3 add attribute to store current Guest (occupant)
	
	
	////////////////////////////////
	
	@Override
	public void setCode(String code) {

		// TODO:Part2
		this.setRoomCode(code);
	}

	@Override
	public boolean checkCode(String code) {

		// TODO:Part2
		return false;
	}
	
	@Override
	public void resetToDefault() {

		// TODO:Part2
	}

	@Override
	public boolean isLockedOut() {

		return false;
	}

	@Override
	public int getIncorrectAttempts() {

		// TODO:Part2
		return -1;
	}
	
	/**
	 * @return the roomNum
	 */
	public int getRoomNum() {
		return roomNum;
	}

	/**
	 * @param roomNum the roomNum to set
	 */
	public void setRoomNum(int roomNum) {
		
		this.roomNum = roomNum;
	}

	/**
	 * Sets the occupant of the room.
	 * 
	 * @param guest the guest which is to occupy the room
	 */
	public void setOccupant(Guest guest) {
		
		this.setSetOccupant(occupants);
	}
	
	/**
	 * Removes any occupant from the room.
	 * @param occupants 
	 */
	public void removeOccupant(Object occupants) {
		
		this.occupants = occupants;
	}
	
	/**
	 * 
	 * @return true if the room has an occupant
	 */
	public boolean hasOccupant() {
		
		return false;
	}
	
	////////////////////////////////
	
	/**
	 * Constructor.
	 * 
	 * @param roomNum the room number
	 */
	public Room(int roomNum) {
		this.roomNum = roomNum;
	}

	public Object getSetOccupant() {
		return setOccupant;
	}

	public void setSetOccupant(Object setOccupant) {
		this.setOccupant = setOccupant;
	}

	public void removeOccupant() {
		// TODO Auto-generated method stub
	
		
	}
      public String getRoomCode() {
      return roomCode;

}
      public void setRoomCode(String RoomCode) {
    	  this.roomCode = RoomCode;
	}
}