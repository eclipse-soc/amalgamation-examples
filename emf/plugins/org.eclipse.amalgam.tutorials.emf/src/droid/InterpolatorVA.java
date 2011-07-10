/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interpolator VA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.InterpolatorVA#getAccess <em>Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getInterpolatorVA()
 * @model
 * @generated
 */
public interface InterpolatorVA extends ValueAccess {
	/**
	 * Returns the value of the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' containment reference.
	 * @see #setAccess(InterpolatorRA)
	 * @see droid.DroidPackage#getInterpolatorVA_Access()
	 * @model containment="true"
	 * @generated
	 */
	InterpolatorRA getAccess();

	/**
	 * Sets the value of the '{@link droid.InterpolatorVA#getAccess <em>Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' containment reference.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(InterpolatorRA value);

} // InterpolatorVA
