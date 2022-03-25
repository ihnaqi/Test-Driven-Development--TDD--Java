package manager;

/**
 * An abstract class that represents all types of properties.
 * 
 * @author mdixon
 *
 */
abstract class Property {

	// TODO:Part1 - Add attributes
	private String address;
	private Tenant tenant;
	////////////////////////////////////
	
	/**
	 * 
	 * @return the property address.
	 */
	public String getAddress() {
		
		// TODO:Part1
		return this.address != null ? this.address : null;
	}
	
	/**
	 * Sets the tenant of the property.
	 * 
	 * @param tenant the tenant of the property
	 */
	public void setTenant(Tenant tenant) {
		
		// TODO:Part3
		this.tenant = tenant;
	}
	
	/**
	 * Removes any tenant from the property.
	 */
	public void removeTenant() {
		
		// TODO:Part3
		this.tenant = null;
	}
	
	/**
	 * 
	 * @return true if the property has a tenant
	 */
	public boolean hasTenant() {
		
		// TODO:Part3
		return this.tenant != null ? true : false;
	}
	
	/**
	 * Constructor
	 * 
	 * @param address the property address.
	 */
	Property(String address) {
		
		// TODO:Part1 - Set attribute
		this.address = address;
	}
	
}
