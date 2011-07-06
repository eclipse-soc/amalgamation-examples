/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.TabHost#getLayoutParams <em>Layout Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getTabHost()
 * @model
 * @generated
 */
public interface TabHost extends Layout
{
  /**
   * Returns the value of the '<em><b>Layout Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout Params</em>' containment reference.
   * @see #setLayoutParams(LayoutParams)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getTabHost_LayoutParams()
   * @model containment="true"
   * @generated
   */
  LayoutParams getLayoutParams();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.TabHost#getLayoutParams <em>Layout Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout Params</em>' containment reference.
   * @see #getLayoutParams()
   * @generated
   */
  void setLayoutParams(LayoutParams value);

} // TabHost
