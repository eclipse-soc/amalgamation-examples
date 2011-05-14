/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drawable Image Resource Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue#getExternalResource <em>External Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getDrawableImageResourcePropertyValue()
 * @model
 * @generated
 */
public interface DrawableImageResourcePropertyValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' reference.
   * @see #setResource(DrawableResource)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getDrawableImageResourcePropertyValue_Resource()
   * @model
   * @generated
   */
  DrawableResource getResource();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue#getResource <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
  void setResource(DrawableResource value);

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
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getDrawableImageResourcePropertyValue_ExternalResource()
   * @model
   * @generated
   */
  String getExternalResource();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue#getExternalResource <em>External Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External Resource</em>' attribute.
   * @see #getExternalResource()
   * @generated
   */
  void setExternalResource(String value);

} // DrawableImageResourcePropertyValue
