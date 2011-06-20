/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color VA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.ColorVA#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.ColorVA#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getColorVA()
 * @model
 * @generated
 */
public interface ColorVA extends ValueAccess, AnyDrawableVA
{
  /**
   * Returns the value of the '<em><b>Access</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' containment reference.
   * @see #setAccess(ColorRA)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getColorVA_Access()
   * @model containment="true"
   * @generated
   */
  ColorRA getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.ColorVA#getAccess <em>Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' containment reference.
   * @see #getAccess()
   * @generated
   */
  void setAccess(ColorRA value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ColorVD)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getColorVA_Value()
   * @model containment="true"
   * @generated
   */
  ColorVD getValue();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.ColorVA#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ColorVD value);

} // ColorVA
