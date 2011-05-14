/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Spinner#getPrompt <em>Prompt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getSpinner()
 * @model
 * @generated
 */
public interface Spinner extends Widget
{
  /**
   * Returns the value of the '<em><b>Prompt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prompt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prompt</em>' containment reference.
   * @see #setPrompt(StringPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getSpinner_Prompt()
   * @model containment="true"
   * @generated
   */
  StringPropertyValue getPrompt();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Spinner#getPrompt <em>Prompt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prompt</em>' containment reference.
   * @see #getPrompt()
   * @generated
   */
  void setPrompt(StringPropertyValue value);

} // Spinner
