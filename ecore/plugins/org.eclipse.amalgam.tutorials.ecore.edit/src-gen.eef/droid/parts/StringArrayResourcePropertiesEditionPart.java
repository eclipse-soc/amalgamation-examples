/**
 * Generated with Acceleo
 */
package droid.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;



// End of user code

/**
 * 
 * 
 */
public interface StringArrayResourcePropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the items
	 * 
	 */
	public EList getItems();

	/**
	 * Defines a new items
	 * @param newValue the new items to set
	 * 
	 */
	public void setItems(EList newValue);

	/**
	 * Add a value to the items multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToItems(Object newValue);

	/**
	 * Remove a value to the items multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToItems(Object newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
