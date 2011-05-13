/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
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
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getApplication_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getApplication_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

  /**
   * Returns the value of the '<em><b>Manifest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Manifest</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Manifest</em>' containment reference.
   * @see #setManifest(ManifestFile)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getApplication_Manifest()
   * @model containment="true"
   * @generated
   */
  ManifestFile getManifest();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getManifest <em>Manifest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manifest</em>' containment reference.
   * @see #getManifest()
   * @generated
   */
  void setManifest(ManifestFile value);

  /**
   * Returns the value of the '<em><b>Layouts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.amalgam.tutorials.xtext.droid.Layout}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layouts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layouts</em>' containment reference list.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getApplication_Layouts()
   * @model containment="true"
   * @generated
   */
  EList<Layout> getLayouts();

  /**
   * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.amalgam.tutorials.xtext.droid.Activity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activities</em>' containment reference list.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getApplication_Activities()
   * @model containment="true"
   * @generated
   */
  EList<Activity> getActivities();

} // Application
