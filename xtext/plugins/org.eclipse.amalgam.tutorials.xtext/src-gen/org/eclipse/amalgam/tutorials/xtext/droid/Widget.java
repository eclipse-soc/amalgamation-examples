/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getTop <em>Top</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getBackground <em>Background</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getClickable <em>Clickable</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getFadeScrollBars <em>Fade Scroll Bars</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getIsScrollContainer <em>Is Scroll Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Top</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top</em>' containment reference.
   * @see #setTop(DimensionPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_Top()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getTop();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getTop <em>Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Top</em>' containment reference.
   * @see #getTop()
   * @generated
   */
  void setTop(DimensionPropertyValue value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(DimensionPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_Left()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getLeft();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(DimensionPropertyValue value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' containment reference.
   * @see #setWidth(DimensionPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_Width()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getWidth();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getWidth <em>Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' containment reference.
   * @see #getWidth()
   * @generated
   */
  void setWidth(DimensionPropertyValue value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' containment reference.
   * @see #setHeight(DimensionPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_Height()
   * @model containment="true"
   * @generated
   */
  DimensionPropertyValue getHeight();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getHeight <em>Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' containment reference.
   * @see #getHeight()
   * @generated
   */
  void setHeight(DimensionPropertyValue value);

  /**
   * Returns the value of the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Background</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Background</em>' containment reference.
   * @see #setBackground(DrawableResourcePropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_Background()
   * @model containment="true"
   * @generated
   */
  DrawableResourcePropertyValue getBackground();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getBackground <em>Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Background</em>' containment reference.
   * @see #getBackground()
   * @generated
   */
  void setBackground(DrawableResourcePropertyValue value);

  /**
   * Returns the value of the '<em><b>Clickable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clickable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clickable</em>' containment reference.
   * @see #setClickable(BooleanPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_Clickable()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getClickable();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getClickable <em>Clickable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clickable</em>' containment reference.
   * @see #getClickable()
   * @generated
   */
  void setClickable(BooleanPropertyValue value);

  /**
   * Returns the value of the '<em><b>Fade Scroll Bars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fade Scroll Bars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fade Scroll Bars</em>' containment reference.
   * @see #setFadeScrollBars(BooleanPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_FadeScrollBars()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getFadeScrollBars();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getFadeScrollBars <em>Fade Scroll Bars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fade Scroll Bars</em>' containment reference.
   * @see #getFadeScrollBars()
   * @generated
   */
  void setFadeScrollBars(BooleanPropertyValue value);

  /**
   * Returns the value of the '<em><b>Is Scroll Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Scroll Container</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Scroll Container</em>' containment reference.
   * @see #setIsScrollContainer(BooleanPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getWidget_IsScrollContainer()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getIsScrollContainer();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getIsScrollContainer <em>Is Scroll Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Scroll Container</em>' containment reference.
   * @see #getIsScrollContainer()
   * @generated
   */
  void setIsScrollContainer(BooleanPropertyValue value);

} // Widget
