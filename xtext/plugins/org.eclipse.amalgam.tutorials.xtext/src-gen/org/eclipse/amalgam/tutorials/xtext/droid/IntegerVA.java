/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer VA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.IntegerVA#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.IntegerVA#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getIntegerVA()
 * @model
 * @generated
 */
public interface IntegerVA extends ValueAccess
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
   * @see #setAccess(IntegerRA)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getIntegerVA_Access()
   * @model containment="true"
   * @generated
   */
  IntegerRA getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.IntegerVA#getAccess <em>Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' containment reference.
   * @see #getAccess()
   * @generated
   */
  void setAccess(IntegerRA value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(IntegerVD)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getIntegerVA_Value()
   * @model containment="true"
   * @generated
   */
  IntegerVD getValue();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.IntegerVA#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(IntegerVD value);

} // IntegerVA
