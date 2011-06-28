/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.RelativeLayout#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getRelativeLayout()
 * @model
 * @generated
 */
public interface RelativeLayout extends Layout
{
  /**
   * Returns the value of the '<em><b>Orientation</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.amalgam.tutorials.xtext.droid.LayoutOrientationKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orientation</em>' attribute.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.LayoutOrientationKind
   * @see #setOrientation(LayoutOrientationKind)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getRelativeLayout_Orientation()
   * @model
   * @generated
   */
  LayoutOrientationKind getOrientation();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.RelativeLayout#getOrientation <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orientation</em>' attribute.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.LayoutOrientationKind
   * @see #getOrientation()
   * @generated
   */
  void setOrientation(LayoutOrientationKind value);

} // RelativeLayout
