/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.AbstractView#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.AbstractView#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getAbstractView()
 * @model
 * @generated
 */
public interface AbstractView extends EObject
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
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getAbstractView_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.AbstractView#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Widgets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Widgets</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Widgets</em>' containment reference.
   * @see #setWidgets(ViewCollection)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getAbstractView_Widgets()
   * @model containment="true"
   * @generated
   */
  ViewCollection getWidgets();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.AbstractView#getWidgets <em>Widgets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Widgets</em>' containment reference.
   * @see #getWidgets()
   * @generated
   */
  void setWidgets(ViewCollection value);

} // AbstractView
