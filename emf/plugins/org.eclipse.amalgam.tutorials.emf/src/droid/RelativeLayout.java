/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.RelativeLayout#getLayoutParams <em>Layout Params</em>}</li>
 *   <li>{@link droid.RelativeLayout#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getRelativeLayout()
 * @model
 * @generated
 */
public interface RelativeLayout extends Layout {
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
	 * @see droid.DroidPackage#getRelativeLayout_LayoutParams()
	 * @model containment="true"
	 * @generated
	 */
	LayoutParams getLayoutParams();

	/**
	 * Sets the value of the '{@link droid.RelativeLayout#getLayoutParams <em>Layout Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Params</em>' containment reference.
	 * @see #getLayoutParams()
	 * @generated
	 */
	void setLayoutParams(LayoutParams value);

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
	 * @see droid.DroidPackage#getRelativeLayout_Orientation()
	 * @model
	 * @generated
	 */
	LayoutOrientationKind getOrientation();

	/**
	 * Sets the value of the '{@link droid.RelativeLayout#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see droid.LayoutOrientationKind
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(LayoutOrientationKind value);

} // RelativeLayout
