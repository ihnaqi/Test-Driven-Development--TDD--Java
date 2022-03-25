package manager;

public class Office extends Property implements SecuredAccess {

	/**
	 * The stored security code.
	 */
	private String storedCode = "1234";	// TODO:Part2

	
	// TODO:Part2 add attribute to store number of incorrect attempts
	private int incorrectAttempts;


	//////////////////////////////////////////////////////
	
	@Override
	public void setCode(String code) {
		
		// TODO:Part2
		this.storedCode = code;
	}

	@Override
	public boolean checkCode(String code) {

		if (isLockedOut() || !code.equals(storedCode)) {
			// is locked out, or codes do not match
			
			// TODO:Part2 - increment attempts, then return false
			
			this.incorrectAttempts = this.incorrectAttempts + 1;
			return false;
		}

		// not locked, and codes match
		this.incorrectAttempts = 0;
		return true;
	}

	@Override
	public void resetToDefault() {

		// TODO:Part2
		this.storedCode = "1234";
		this.incorrectAttempts = 0;
	}

	@Override
	public boolean isLockedOut() {

		// TODO:Part2 - check attempts again limit, return true if limit exceeded
		return this.incorrectAttempts > 5 ? true : false;
	}

	@Override
	public int getIncorrectAttempts() {

		// TODO:Part2
		return this.incorrectAttempts;
	}
	
	//////////////////////////////////////////////////////

	public Office(String address) {

		super(address);
	}

	
}
