package manager;

/**
 * An abstract class that represents all types of properties.
 * 
 * @author mdixon
 *
 */
abstract class Property {

	/**
	 * The property address
	 */
	private String address;
	
	/**
	 * 
	 * @return the property address.
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the tenant of the property.
	 * 
	 * @param tenant the tenant of the property
	 */
	public void setTenant(Tenant tenant) {
		
		this.setTenant(tenant);
	}
	
	/**
	 * Removes any tenant from the property.
	 */
	public void removeTenant() {
		
		// TODO:Part3
	}
	
	/**
	 * 
	 * @return true if the property has a tenant
	 */
	public boolean hasTenant() {
		
		return true;
	}
	
	/**
	 * Constructor
	 * 
	 * @param address the property address.
	 */
	Property(String address) {
		
		this.address = address;
	}

	public void resetToDefault(Object Default) {
		// TODO Auto-generated method stub
		
	}
	
}
