/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Uses SDK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.ApplicationUsesSDK#getMinSdkVersion <em>Min Sdk Version</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.ApplicationUsesSDK#getMaxSdkVersion <em>Max Sdk Version</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.ApplicationUsesSDK#getTargetSdkVersion <em>Target Sdk Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getApplicationUsesSDK()
 * @model
 * @generated
 */
public interface ApplicationUsesSDK extends EObject
{
  /**
   * Returns the value of the '<em><b>Min Sdk Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Sdk Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Sdk Version</em>' attribute.
   * @see #setMinSdkVersion(int)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getApplicationUsesSDK_MinSdkVersion()
   * @model
   * @generated
   */
  int getMinSdkVersion();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.ApplicationUsesSDK#getMinSdkVersion <em>Min Sdk Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Sdk Version</em>' attribute.
   * @see #getMinSdkVersion()
   * @generated
   */
  void setMinSdkVersion(int value);

  /**
   * Returns the value of the '<em><b>Max Sdk Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Sdk Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Sdk Version</em>' attribute.
   * @see #setMaxSdkVersion(int)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getApplicationUsesSDK_MaxSdkVersion()
   * @model
   * @generated
   */
  int getMaxSdkVersion();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.ApplicationUsesSDK#getMaxSdkVersion <em>Max Sdk Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Sdk Version</em>' attribute.
   * @see #getMaxSdkVersion()
   * @generated
   */
  void setMaxSdkVersion(int value);

  /**
   * Returns the value of the '<em><b>Target Sdk Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Sdk Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Sdk Version</em>' attribute.
   * @see #setTargetSdkVersion(int)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getApplicationUsesSDK_TargetSdkVersion()
   * @model
   * @generated
   */
  int getTargetSdkVersion();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.ApplicationUsesSDK#getTargetSdkVersion <em>Target Sdk Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Sdk Version</em>' attribute.
   * @see #getTargetSdkVersion()
   * @generated
   */
  void setTargetSdkVersion(int value);

} // ApplicationUsesSDK
