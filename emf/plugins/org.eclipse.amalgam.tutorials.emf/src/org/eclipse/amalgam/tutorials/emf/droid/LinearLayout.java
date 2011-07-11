/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.LinearLayout#getLayoutParams <em>Layout Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getLinearLayout()
 * @model
 * @generated
 */
public interface LinearLayout extends AbstractLinearLayout {
	/**
	 * Returns the value of the '<em><b>Layout Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Params</em>' containment reference.
	 * @see #setLayoutParams(LayoutParams)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getLinearLayout_LayoutParams()
	 * @model containment="true"
	 * @generated
	 */
	LayoutParams getLayoutParams();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.LinearLayout#getLayoutParams <em>Layout Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Params</em>' containment reference.
	 * @see #getLayoutParams()
	 * @generated
	 */
	void setLayoutParams(LayoutParams value);

} // LinearLayout
