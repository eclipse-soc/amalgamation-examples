/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Resource Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.AbstractResourceAccess#getExternalResource <em>External Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getAbstractResourceAccess()
 * @model
 * @generated
 */
public interface AbstractResourceAccess extends EObject
{
  /**
   * Returns the value of the '<em><b>External Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External Resource</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Resource</em>' attribute.
   * @see #setExternalResource(String)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getAbstractResourceAccess_ExternalResource()
   * @model
   * @generated
   */
  String getExternalResource();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.AbstractResourceAccess#getExternalResource <em>External Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External Resource</em>' attribute.
   * @see #getExternalResource()
   * @generated
   */
  void setExternalResource(String value);

} // AbstractResourceAccess
