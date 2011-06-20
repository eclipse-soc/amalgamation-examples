/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericActivity#getReferencedLayout <em>Referenced Layout</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericActivity#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getGenericActivity()
 * @model
 * @generated
 */
public interface GenericActivity extends Activity
{
  /**
   * Returns the value of the '<em><b>Referenced Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Layout</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Layout</em>' reference.
   * @see #setReferencedLayout(Layout)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getGenericActivity_ReferencedLayout()
   * @model
   * @generated
   */
  Layout getReferencedLayout();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericActivity#getReferencedLayout <em>Referenced Layout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referenced Layout</em>' reference.
   * @see #getReferencedLayout()
   * @generated
   */
  void setReferencedLayout(Layout value);

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
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getGenericActivity_Widgets()
   * @model containment="true"
   * @generated
   */
  ViewCollection getWidgets();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericActivity#getWidgets <em>Widgets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Widgets</em>' containment reference.
   * @see #getWidgets()
   * @generated
   */
  void setWidgets(ViewCollection value);

} // GenericActivity
