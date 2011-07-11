/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;



// End of user code

/**
 * 
 * 
 */
public interface InterpolatorRAPropertiesEditionPart {

	/**
	 * @return the externalResource
	 * 
	 */
	public String getExternalResource();

	/**
	 * Defines a new externalResource
	 * @param newValue the new externalResource to set
	 * 
	 */
	public void setExternalResource(String newValue);


	/**
	 * @return the interpolatorName
	 * 
	 */
	public Enumerator getInterpolatorName();

	/**
	 * Init the interpolatorName
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initInterpolatorName(EEnum eenum, Enumerator current);

	/**
	 * Defines a new interpolatorName
	 * @param newValue the new interpolatorName to set
	 * 
	 */
	public void setInterpolatorName(Enumerator newValue);





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
