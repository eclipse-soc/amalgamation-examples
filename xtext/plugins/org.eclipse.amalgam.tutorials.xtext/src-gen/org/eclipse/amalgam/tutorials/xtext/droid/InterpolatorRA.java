/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interpolator RA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.InterpolatorRA#getInterpolatorName <em>Interpolator Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getInterpolatorRA()
 * @model
 * @generated
 */
public interface InterpolatorRA extends ResourceAccess
{
  /**
   * Returns the value of the '<em><b>Interpolator Name</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.amalgam.tutorials.xtext.droid.InterpolatorsKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interpolator Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interpolator Name</em>' attribute.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.InterpolatorsKind
   * @see #setInterpolatorName(InterpolatorsKind)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getInterpolatorRA_InterpolatorName()
   * @model
   * @generated
   */
  InterpolatorsKind getInterpolatorName();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.InterpolatorRA#getInterpolatorName <em>Interpolator Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interpolator Name</em>' attribute.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.InterpolatorsKind
   * @see #getInterpolatorName()
   * @generated
   */
  void setInterpolatorName(InterpolatorsKind value);

} // InterpolatorRA
