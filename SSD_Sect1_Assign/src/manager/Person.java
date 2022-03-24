package manager;

/**
 * Abstract class to represent a person.
 * 
 * @author mdixon
 *
 */
abstract class Person {

	public String Addr;

	///////////////////////////////////////////////
	/*
	 *  Phone 
	 */
	public String Phone;
	/**
	 * @return the home address of the person
	 */

		
	
	
public String emailadress;


private String Name;
	/**
	 * @param addr the home address of the person
	 * @param Addr 
	 */
	public void setAddr(String addr) {

		this.Addr = addr;
	}

	/**
	 * @return the phone number of the person
	 */
	public String getPhone() {
		return Phone;
	}
	/**
	 * @param phone the phone number of the person
	 * @param Phone 
	 */
	public void setPhone(String phone) {
		this.Phone  = phone;
	}

	/**
	 * @return the email addr of the person
	 */
	public String getEmail() {

		return emailadress;
		
	}

	/**
	 * @param email the email addr of the person
	 */
	public void setEmail(String email) {

		this.emailadress = email;
	}

	/**
	 * @return the name of the person
	 */
	public String getName() {
		return Name;
	}
public String getAddr() {
	return Addr;
}
	/**
	 * @param setName 
	 * @param the new name of the person
	 */
	public void setName(String name) {

		this.Name = name;
	}

	///////////////////////////////////////////////

	/**
	 * Constructor
	 * 
	 * @param name the name of the person
	 */
	Person(String name) {
		Name = name;

		
	}

}
