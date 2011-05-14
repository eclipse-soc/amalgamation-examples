/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Widget
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(StringPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getLink_Text()
   * @model containment="true"
   * @generated
   */
  StringPropertyValue getText();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(StringPropertyValue value);

  /**
   * Returns the value of the '<em><b>Hint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hint</em>' containment reference.
   * @see #setHint(StringPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getLink_Hint()
   * @model containment="true"
   * @generated
   */
  StringPropertyValue getHint();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getHint <em>Hint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hint</em>' containment reference.
   * @see #getHint()
   * @generated
   */
  void setHint(StringPropertyValue value);

  /**
   * Returns the value of the '<em><b>Text Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Color</em>' containment reference.
   * @see #setTextColor(ColorPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getLink_TextColor()
   * @model containment="true"
   * @generated
   */
  ColorPropertyValue getTextColor();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getTextColor <em>Text Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text Color</em>' containment reference.
   * @see #getTextColor()
   * @generated
   */
  void setTextColor(ColorPropertyValue value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Activity)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getLink_Target()
   * @model
   * @generated
   */
  Activity getTarget();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Activity value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.amalgam.tutorials.xtext.droid.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getLink_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // Link
