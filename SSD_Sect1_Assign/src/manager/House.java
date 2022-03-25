package manager;


/**
 * A represent a House type {@link Domicile}.
 * 
 * @author mdixon
 */
public class House extends Domicile {

	// TODO:Part1 - Add missing attributes
	private int bathrooms;
	private int receptionRooms; 
	
	/**
	 * A flag indicating whether the house has a garage.
	 */
	private boolean hasGarage;
	
	////////////////////////////////////////////////////
	
	/**
	 * @return the number of bath rooms
	 */
	public int getBathrooms() {
		
		// TODO:Part1
		return this.bathrooms ;
	}

	/**
	 * @return the number of reception rooms
	 */
	public int getReceptionRooms() {
		
		// TODO:Part1
		return this.receptionRooms;
	}

	/**
	 * @return true if the house has a garage
	 */
	public boolean hasGarage() {
		
		// TODO:Part1
		return this.hasGarage;
	}

	/**
	 * Constructor
	 * 
	 * @param addr the address of the house
	 * @param bedrooms the number of bedrooms within the house.
	 * @param bathrooms the number of bathrooms within the house.
	 * @param receptionRooms the number of reception rooms within the house.
	 * @param hasGarage a flag indicating whether the house has a garage.
	 */
	public House(String addr, int bedrooms, int bathrooms, int receptionRooms, boolean hasGarage) {
		
		super(addr, bedrooms);
		
		this.hasGarage = hasGarage;
		
		// TODO:Part1 set missing attribute values
		this.bathrooms = bathrooms;
		this.receptionRooms = receptionRooms;
	}
}
