/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String VA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.StringVA#getAccess <em>Access</em>}</li>
 *   <li>{@link droid.StringVA#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getStringVA()
 * @model
 * @generated
 */
public interface StringVA extends ValueAccess {
	/**
	 * Returns the value of the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' containment reference.
	 * @see #setAccess(StringRA)
	 * @see droid.DroidPackage#getStringVA_Access()
	 * @model containment="true"
	 * @generated
	 */
	StringRA getAccess();

	/**
	 * Sets the value of the '{@link droid.StringVA#getAccess <em>Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' containment reference.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(StringRA value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(StringVD)
	 * @see droid.DroidPackage#getStringVA_Value()
	 * @model containment="true"
	 * @generated
	 */
	StringVD getValue();

	/**
	 * Sets the value of the '{@link droid.StringVA#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(StringVD value);

} // StringVA
