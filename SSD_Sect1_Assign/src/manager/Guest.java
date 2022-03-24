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
	private String CardNo;
	
	////////////////////////////////////////
	
	/**
	 * 
	 * @return the guest's card number.
	 */
	public String getCardNo() {
		
		return CardNo;
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
		this.CardNo = cardNo;
	}
}
		
	