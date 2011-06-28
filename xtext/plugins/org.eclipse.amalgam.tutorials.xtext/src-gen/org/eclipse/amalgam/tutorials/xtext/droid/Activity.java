/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Activity#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends AbstractActivity
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getActivity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Activity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Activity
