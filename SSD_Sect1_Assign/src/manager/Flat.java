package manager;

/**
 * A represent a Flat type {@link Domicile}.
 * 
 * @author mdixon
 */
public class Flat extends Domicile {

	// TODO:Part1 - Add attributes
	private int occupants;
	///////////////////////////////////////////////
	
	/**
	 * Sets the number of occupants within the flat.
	 * 
	 * @param occupants the number of occupants within the flat.
	 */
	public void setOccupants(int occupants) {
		
		// TODO:Part1
		this.occupants = occupants;
	}
	
	/**
	 * Gets the number of occupants within the flat.
	 * 
	 * @return the number of occupants within the flat.
	 */
	public int getOccupants() {
		
		// TODO:Part1
		return this.occupants;
	}
	
	/**
	 * Constructor
	 * 
	 * @param addr the address of the flat
	 * @param bedrooms the number of bedrooms
	 */
	public Flat(String addr, int bedrooms) {
		
		super(addr, bedrooms);
		this.occupants = 0;
	}
}
