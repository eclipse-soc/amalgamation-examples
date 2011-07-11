/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Linear Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractLinearLayout#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getAbstractLinearLayout()
 * @model
 * @generated
 */
public interface AbstractLinearLayout extends Layout {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.tutorials.emf.droid.LayoutOrientationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutOrientationKind
	 * @see #setOrientation(LayoutOrientationKind)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getAbstractLinearLayout_Orientation()
	 * @model
	 * @generated
	 */
	LayoutOrientationKind getOrientation();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractLinearLayout#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutOrientationKind
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(LayoutOrientationKind value);

} // AbstractLinearLayout
