package manager;

/**
 * A type of {@link Property} which acts as a place of residence.
 * 
 * @author mdixon
 */
abstract class Domicile extends Property {

	// TODO:Part1 - Add attributes
	private int bedrooms;
	private boolean isFurnished;

	////////////////////////////////
	
	/**
	 * @return the number of bedrooms
	 */
	public int getBedrooms() {
		
		// TODO:Part1
		return this.bedrooms;
	}
	
	/**
	 * @return true if furnished
	 */
	public boolean isFurnished() {
		
		// TODO:Part1
		return this.isFurnished;
	}
	
	////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param addr the address of the domicile
	 * @param bedrooms the number of bedrooms
	 */
	Domicile(String addr, int bedrooms) {

		super(addr);
		
		// TODO:Part1 set attribute values
		this.bedrooms = bedrooms;
	}

}
