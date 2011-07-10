/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Linear Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.AbstractLinearLayout#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getAbstractLinearLayout()
 * @model
 * @generated
 */
public interface AbstractLinearLayout extends Layout {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link droid.LayoutOrientationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see droid.LayoutOrientationKind
	 * @see #setOrientation(LayoutOrientationKind)
	 * @see droid.DroidPackage#getAbstractLinearLayout_Orientation()
	 * @model
	 * @generated
	 */
	LayoutOrientationKind getOrientation();

	/**
	 * Sets the value of the '{@link droid.AbstractLinearLayout#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see droid.LayoutOrientationKind
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(LayoutOrientationKind value);

} // AbstractLinearLayout
