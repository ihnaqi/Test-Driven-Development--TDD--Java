package manager;

/**
 * A type of {@link Property} which acts as a place of residence.
 * 
 * @author mdixon
 */
abstract class Domicile extends Property {

	/**
	 * The number of bedrooms
	 */
		private int bedrooms;
		
		/**
		 *  Flag indicating whether the property is furnished
		 */

		private String addr;

		/**
	 * @return the number of bedrooms
	 */
	public int getBedrooms() {
		
		return bedrooms;	}
	
	/**
	 * @param isFurnished 
	 * @return true if furnished
	 */
	public boolean isFurnished(boolean isFurnished) {
	
		return true;
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
		
		this.bedrooms = bedrooms;
		this.setAddr(addr);
	}

	public String getAddr() {
		return addr;
	} 

	public void setAddr(String addr) {
		this.addr = addr;
	}


}
