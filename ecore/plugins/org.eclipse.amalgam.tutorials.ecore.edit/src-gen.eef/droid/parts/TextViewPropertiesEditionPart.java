/**
 * Generated with Acceleo
 */
package droid.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;



// End of user code

/**
 * 
 * 
 */
public interface TextViewPropertiesEditionPart {

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
	 * @return the autoLink
	 * 
	 */
	public Enumerator getAutoLink();

	/**
	 * Init the autoLink
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initAutoLink(EEnum eenum, Enumerator current);

	/**
	 * Defines a new autoLink
	 * @param newValue the new autoLink to set
	 * 
	 */
	public void setAutoLink(Enumerator newValue);


	/**
	 * @return the capitalize
	 * 
	 */
	public Enumerator getCapitalize();

	/**
	 * Init the capitalize
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initCapitalize(EEnum eenum, Enumerator current);

	/**
	 * Defines a new capitalize
	 * @param newValue the new capitalize to set
	 * 
	 */
	public void setCapitalize(Enumerator newValue);


	/**
	 * @return the gravity
	 * 
	 */
	public Enumerator getGravity();

	/**
	 * Init the gravity
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initGravity(EEnum eenum, Enumerator current);

	/**
	 * Defines a new gravity
	 * @param newValue the new gravity to set
	 * 
	 */
	public void setGravity(Enumerator newValue);


	/**
	 * @return the typeface
	 * 
	 */
	public Enumerator getTypeface();

	/**
	 * Init the typeface
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initTypeface(EEnum eenum, Enumerator current);

	/**
	 * Defines a new typeface
	 * @param newValue the new typeface to set
	 * 
	 */
	public void setTypeface(Enumerator newValue);


	/**
	 * @return the textStyle
	 * 
	 */
	public EList getTextStyle();

	/**
	 * Defines a new textStyle
	 * @param newValue the new textStyle to set
	 * 
	 */
	public void setTextStyle(EList newValue);

	/**
	 * Add a value to the textStyle multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToTextStyle(Object newValue);

	/**
	 * Remove a value to the textStyle multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToTextStyle(Object newValue);





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
