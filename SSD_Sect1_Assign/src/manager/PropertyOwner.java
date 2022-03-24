package manager;

import java.util.ArrayList;
import java.util.List;

/**
 * A person that owns {@link Property} instances.
 * 
 * @author mdixon
 *
 */
public class PropertyOwner extends Person {

	List<Property> OwnProperty = new ArrayList<Property>();
	
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * Adds a property to the set of owned properties.
	 * 
	 * @param prop the property to be added
	 * @return true if the property added, false if already owned.
	 */

	public boolean addProperty(Property prop) {
		if(!OwnProperty.contains(prop)) {
			OwnProperty.add(prop);
		return true;
	}
	return false;
}
	/**
	 * Removes a property from the set of owned properties.
	 * 
	 * @param prop the property to be removed
	 * @return true if the property was removed, false if it was not owned
	 */
	public boolean removeProperty(Property prop) {
		
		if(OwnProperty.contains(prop)) {
			OwnProperty.remove(OwnProperty.indexOf(prop));
		return true;
	}
	return false;
	}
	/**
	 * Clears all properties from the set of owned properties.
	 */
	public void clearOwnedProperties() {
		
		OwnProperty.clear();
	}
	
	/**
	 * Gets the number of owned properties
	 * 
	 * @return the number of owned properties
	 */
	public int getPropertyCount() {
		
		// TODO:Part3
		return OwnProperty.size();
	}
	
	/////////////////////////////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param name the property owner's name
	 */
	public PropertyOwner(String name) {
		
		super(name);
	}
}
