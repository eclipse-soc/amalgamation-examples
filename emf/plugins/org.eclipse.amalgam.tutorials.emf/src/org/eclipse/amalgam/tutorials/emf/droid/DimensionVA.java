/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension VA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionVA#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionVA#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getDimensionVA()
 * @model
 * @generated
 */
public interface DimensionVA extends ValueAccess, LayoutDimensionVA {
	/**
	 * Returns the value of the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' containment reference.
	 * @see #setAccess(DimensionRA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getDimensionVA_Access()
	 * @model containment="true"
	 * @generated
	 */
	DimensionRA getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionVA#getAccess <em>Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' containment reference.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(DimensionRA value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DimensionVD)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getDimensionVA_Value()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVD getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionVA#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DimensionVD value);

} // DimensionVA
