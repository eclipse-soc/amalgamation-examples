/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getBooleanPropertyValue()
 * @model
 * @generated
 */
public interface BooleanPropertyValue extends PropertyValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(Boolean)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getBooleanPropertyValue_Value()
   * @model
   * @generated
   */
  Boolean getValue();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(Boolean value);

  /**
   * Returns the value of the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' reference.
   * @see #setResource(BooleanValueResource)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getBooleanPropertyValue_Resource()
   * @model
   * @generated
   */
  BooleanValueResource getResource();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue#getResource <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
  void setResource(BooleanValueResource value);

} // BooleanPropertyValue
