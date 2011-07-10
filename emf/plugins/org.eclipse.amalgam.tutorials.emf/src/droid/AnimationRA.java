/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation RA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.AnimationRA#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getAnimationRA()
 * @model
 * @generated
 */
public interface AnimationRA extends ResourceAccess {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(AnimationResource)
	 * @see droid.DroidPackage#getAnimationRA_Resource()
	 * @model
	 * @generated
	 */
	AnimationResource getResource();

	/**
	 * Sets the value of the '{@link droid.AnimationRA#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(AnimationResource value);

} // AnimationRA
