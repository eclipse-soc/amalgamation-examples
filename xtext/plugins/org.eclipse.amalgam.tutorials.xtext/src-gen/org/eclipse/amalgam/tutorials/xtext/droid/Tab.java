/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Tab#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getTab()
 * @model
 * @generated
 */
public interface Tab extends EObject
{
  /**
   * Returns the value of the '<em><b>Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity</em>' reference.
   * @see #setActivity(Activity)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getTab_Activity()
   * @model
   * @generated
   */
  Activity getActivity();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Tab#getActivity <em>Activity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity</em>' reference.
   * @see #getActivity()
   * @generated
   */
  void setActivity(Activity value);

} // Tab
