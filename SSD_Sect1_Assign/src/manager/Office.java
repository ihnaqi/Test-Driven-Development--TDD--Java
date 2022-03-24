package manager;

public class Office extends Property implements SecuredAccess {
	/**
	 * The stored security code.
	 */
	private String storedCode = "1234";
    private int IncorrectAttemps;
	

	//////////////////////////////////////////////////////
	
	@Override
	public void setCode(String code) {
		
		this.storedCode = code;
		IncorrectAttemps = 0;
	}

	@Override
	public boolean checkCode(String code) {

		if (isLockedOut() || !code.equals(storedCode)) {
			// is locked out, or codes do not match
			
			return false;
		}

		// not locked, and codes match
		
		return true;
	}

	@Override
	public void resetToDefault(Object Default) {

		this.setDefault(Default);
	}

	@Override
	public boolean isLockedOut() {

		// TODO:Part2 - check attempts again limit, return true if limit exceeded
		return true;
	}

	@Override
	public int getIncorrectAttempts() {

		// TODO:Part2
		return -1;
	}
	
	//////////////////////////////////////////////////////

	public Office(String address) {

		super(address);
	}

	public Object getResetToDefault() {
		return resetToDefault;
	}

	public void setResetToDefault(Object resetToDefault) {
		this.resetToDefault = resetToDefault;
	}

	@Override
	public void resetToDefault() {
		storedCode = "1234";
		IncorrectAttemps = 0;
		
	}

	public Object getDefault() {
		return Default;
	}

	public void setDefault(Object default1) {
		Default = default1;
	}

	
}

