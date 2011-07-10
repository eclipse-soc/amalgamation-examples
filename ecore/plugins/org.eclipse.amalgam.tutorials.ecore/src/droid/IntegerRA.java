/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer RA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.IntegerRA#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getIntegerRA()
 * @model
 * @generated
 */
public interface IntegerRA extends ResourceAccess {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(IntegerResource)
	 * @see droid.DroidPackage#getIntegerRA_Resource()
	 * @model
	 * @generated
	 */
	IntegerResource getResource();

	/**
	 * Sets the value of the '{@link droid.IntegerRA#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(IntegerResource value);

} // IntegerRA
