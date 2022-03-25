package manager;

import java.util.ArrayList;
import java.util.List;

/**
 * A Hotel containing many {@link Room} instances.
 * 
 * @author mdixon
 *
 */
public class Hotel extends Property {

	// TODO:Part3 - Add attribute to store multiple Room instances

	List<Room> rooms = new ArrayList<Room>();

	//////////////////////////////////

	/**
	 * 
	 * @return the number of rooms within the hotel.
	 */
	public int getRooms() {

		// TODO:Part1
		return this.rooms.size();
	}

	/**
	 * Set the specified room to be occupied by the given guest.
	 * 
	 * @param roomNo the room number
	 * @param guest  the guest
	 */
	public void occupyRoom(int roomNo, Guest guest) {

		// rooms.get(roomNo).setOccupant(guest);
		// TODO:Part3
		if(roomNo < rooms.size() && !rooms.get(roomNo).hasOccupant()){
			rooms.get(roomNo).setOccupant(guest);
		}
		else{
			System.out.println("Either the room already has an occupant or there is no such room");
		}
	}

	/**
	 * Ensures the specified room is unoccupied.
	 * 
	 * @param roomNo the room number
	 */
	public void freeRoom(int roomNo) {

		// TODO:Part3
		if (roomNo < this.rooms.size()) {
			rooms.get(roomNo).removeOccupant();
		} else {
			System.out.println("Hotel does not have room number: " + roomNo);
		}
	}

	/**
	 * Gets the count of number of occupied rooms
	 * 
	 * @return the occupied room count
	 */
	public int getOccupiedRoomCount() {

		int count = 0;

		// TODO:Part3 - check each room (using a loop) to see if it is occupied. Add to
		// count if so.
		for (Room room : rooms) {
			if (room.hasOccupant()) {
				count++;
			}
		}

		return count;
	}

	//////////////////////////////////////////////

	/**
	 * Constructor
	 * 
	 * @param addr      the address of the hotel
	 * @param roomCount the number of rooms in the hotel
	 */
	public Hotel(String addr, int roomCount) {

		super(addr);

		// TODO:Part3 - create array/collection along with Room stored instances

		for (int i = 0; i < roomCount; i++) {
			rooms.add(new Room(i));
		}

	}
}
