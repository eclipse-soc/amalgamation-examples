/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drawable VA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.DrawableVA#getAccess <em>Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getDrawableVA()
 * @model
 * @generated
 */
public interface DrawableVA extends ValueAccess, AnyDrawableVA {
	/**
	 * Returns the value of the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' containment reference.
	 * @see #setAccess(DrawableRA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getDrawableVA_Access()
	 * @model containment="true"
	 * @generated
	 */
	DrawableRA getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.DrawableVA#getAccess <em>Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' containment reference.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(DrawableRA value);

} // DrawableVA
