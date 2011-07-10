/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean VA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.BooleanVA#getAccess <em>Access</em>}</li>
 *   <li>{@link droid.BooleanVA#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getBooleanVA()
 * @model
 * @generated
 */
public interface BooleanVA extends ValueAccess {
	/**
	 * Returns the value of the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' containment reference.
	 * @see #setAccess(BooleanRA)
	 * @see droid.DroidPackage#getBooleanVA_Access()
	 * @model containment="true"
	 * @generated
	 */
	BooleanRA getAccess();

	/**
	 * Sets the value of the '{@link droid.BooleanVA#getAccess <em>Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' containment reference.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(BooleanRA value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(BooleanVD)
	 * @see droid.DroidPackage#getBooleanVA_Value()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVD getValue();

	/**
	 * Sets the value of the '{@link droid.BooleanVA#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BooleanVD value);

} // BooleanVA
