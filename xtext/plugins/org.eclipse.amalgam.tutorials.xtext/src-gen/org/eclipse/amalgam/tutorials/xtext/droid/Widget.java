/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getLayoutParams <em>Layout Params</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getTop <em>Top</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getClickable <em>Clickable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends View
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
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_LayoutParams()
   * @model containment="true"
   * @generated
   */
  LayoutParams getLayoutParams();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getLayoutParams <em>Layout Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout Params</em>' containment reference.
   * @see #getLayoutParams()
   * @generated
   */
  void setLayoutParams(LayoutParams value);

  /**
   * Returns the value of the '<em><b>Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Top</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top</em>' containment reference.
   * @see #setTop(DimensionVA)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_Top()
   * @model containment="true"
   * @generated
   */
  DimensionVA getTop();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getTop <em>Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Top</em>' containment reference.
   * @see #getTop()
   * @generated
   */
  void setTop(DimensionVA value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(DimensionVA)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_Left()
   * @model containment="true"
   * @generated
   */
  DimensionVA getLeft();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(DimensionVA value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' containment reference.
   * @see #setWidth(DimensionVA)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_Width()
   * @model containment="true"
   * @generated
   */
  DimensionVA getWidth();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getWidth <em>Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' containment reference.
   * @see #getWidth()
   * @generated
   */
  void setWidth(DimensionVA value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' containment reference.
   * @see #setHeight(DimensionVA)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_Height()
   * @model containment="true"
   * @generated
   */
  DimensionVA getHeight();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getHeight <em>Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' containment reference.
   * @see #getHeight()
   * @generated
   */
  void setHeight(DimensionVA value);

  /**
   * Returns the value of the '<em><b>Clickable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clickable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clickable</em>' containment reference.
   * @see #setClickable(BooleanVA)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_Clickable()
   * @model containment="true"
   * @generated
   */
  BooleanVA getClickable();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getClickable <em>Clickable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clickable</em>' containment reference.
   * @see #getClickable()
   * @generated
   */
  void setClickable(BooleanVA value);

} // Widget
