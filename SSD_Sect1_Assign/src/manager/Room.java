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
	

	// TODO:Part2 add attribute to store access code
	private String storedCode;

	// TODO:Part3 add attribute to store current Guest (occupant)
	private Object occupant;
	////////////////////////////////

	@Override
	public void setCode(String code) {

		// TODO:Part2
		this.storedCode = code;
	}

	@Override
	public boolean checkCode(String code) {

		// TODO:Part2
		if(this.storedCode.equals(code)){
			return true;
		}

		return false;
	}

	@Override
	public void resetToDefault() {

		// TODO:Part2
		this.storedCode = "9999";
	}

	@Override
	public boolean isLockedOut() {

		return false;
	}

	@Override
	public int getIncorrectAttempts() {

		// TODO:Part2
		return 0;
	}

	/**
	 * @return the roomNum
	 */
	public int getRoomNum() {

		// TODO:Part1
		return this.roomNum;
	}

	/**
	 * @param roomNum the roomNum to set
	 */
	public void setRoomNum(int roomNum) {

		// TODO:Part1
		this.roomNum = roomNum;
	}

	/**
	 * Sets the occupant of the room.
	 * 
	 * @param guest the guest which is to occupy the room
	 */
	public void setOccupant(Guest guest) {

		// TODO:Part3
		this.occupant = guest;
	}

	/**
	 * Removes any occupant from the room.
	 */
	public void removeOccupant() {

		// TODO:Part3
		this.setOccupant(null);
	}

	/**
	 * 
	 * @return true if the room has an occupant
	 */
	public boolean hasOccupant() {

		// TODO:Part3
		return this.occupant != null;
	}

	////////////////////////////////

	/**
	 * Constructor.
	 * 
	 * @param roomNum the room number
	 */
	public Room(int roomNum) {

		// TODO:Part1 - set the roomNum attribute
		this.roomNum = roomNum;
		resetToDefault();
	}

}
