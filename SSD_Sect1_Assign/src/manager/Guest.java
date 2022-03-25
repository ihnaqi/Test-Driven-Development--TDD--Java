package manager;

/**
 * A guest within a hotel {@link Room}.
 * 
 * @author mdixon
 */
public class Guest extends Person {

	/**
	 * The guest's card number.
	 */
	// TODO:Part1 - add the card number attribute
	private String cardNo;
	////////////////////////////////////////
	
	/**
	 * 
	 * @return the guest's card number.
	 */
	public String getCardNo() {
		
		// TODO:Part1
		return this.cardNo != null ? this.cardNo : null;
	}
	
	///////////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param name the name of the guest
	 * @param cardNo the guest's card number.
	 */
	public Guest(String name, String cardNo) {
		
		super(name);
		
		// TODO:Part1 - set the card number attribute
		this.cardNo = cardNo;
	}
}
