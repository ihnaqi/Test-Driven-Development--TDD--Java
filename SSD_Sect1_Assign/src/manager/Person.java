package manager;

/**
 * Abstract class to represent a person.
 * 
 * @author mdixon
 *
 */
abstract class Person {

	// TODO:Part1 - Add attributes
	private String name;
	private String address;
	private String phone;
	private String email;
	///////////////////////////////////////////////

	/**
	 * @return the home address of the person
	 */
	public String getAddr() {

		// TODO:Part1
		return this.address != null ? this.address : null;
	}

	/**
	 * @param addr the home address of the person
	 */
	public void setAddr(String addr) {

		// TODO:Part1
		this.address = addr;
	}

	/**
	 * @return the phone number of the person
	 */
	public String getPhone() {

		// TODO:Part1
		return this.phone != null ? this.phone : null;
	}

	/**
	 * @param phone the phone number of the person
	 */
	public void setPhone(String phone) {

		// TODO:Part1
		this.phone = phone;
	}

	/**
	 * @return the email addr of the person
	 */
	public String getEmail() {

		// TODO:Part1
		return this.email != null ? this.email : null;
	}

	/**
	 * @param email the email addr of the person
	 */
	public void setEmail(String email) {

		// TODO:Part1
		this.email = email;
	}

	/**
	 * @return the name of the person
	 */
	public String getName() {

		// TODO:Part1
		return this.name != null ? this.name : null;
	}

	/**
	 * @param the new name of the person
	 */
	public void setName(String name) {

		// TODO:Part1
		this.name = name;
	}

	///////////////////////////////////////////////

	/**
	 * Constructor
	 * 
	 * @param name the name of the person
	 */
	Person(String name) {

		// TODO:Part1 - Set name attribute
		this.name = name;
	}
}
