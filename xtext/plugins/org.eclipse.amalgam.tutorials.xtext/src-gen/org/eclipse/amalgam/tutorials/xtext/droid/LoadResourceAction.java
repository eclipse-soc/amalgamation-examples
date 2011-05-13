/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Resource Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction#getToVar <em>To Var</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction#getAfterLoad <em>After Load</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getLoadResourceAction()
 * @model
 * @generated
 */
public interface LoadResourceAction extends Action
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' attribute.
   * @see #setResource(String)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getLoadResourceAction_Resource()
   * @model
   * @generated
   */
  String getResource();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction#getResource <em>Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' attribute.
   * @see #getResource()
   * @generated
   */
  void setResource(String value);

  /**
   * Returns the value of the '<em><b>To Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Var</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Var</em>' attribute.
   * @see #setToVar(String)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getLoadResourceAction_ToVar()
   * @model
   * @generated
   */
  String getToVar();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction#getToVar <em>To Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Var</em>' attribute.
   * @see #getToVar()
   * @generated
   */
  void setToVar(String value);

  /**
   * Returns the value of the '<em><b>After Load</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>After Load</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>After Load</em>' containment reference.
   * @see #setAfterLoad(Action)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getLoadResourceAction_AfterLoad()
   * @model containment="true"
   * @generated
   */
  Action getAfterLoad();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction#getAfterLoad <em>After Load</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>After Load</em>' containment reference.
   * @see #getAfterLoad()
   * @generated
   */
  void setAfterLoad(Action value);

} // LoadResourceAction
