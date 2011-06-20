/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout Dimension VA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.LayoutDimensionVA#getConstant_value <em>Constant value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getLayoutDimensionVA()
 * @model
 * @generated
 */
public interface LayoutDimensionVA extends EObject
{
  /**
   * Returns the value of the '<em><b>Constant value</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.amalgam.tutorials.xtext.droid.LayoutDimensionKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant value</em>' attribute.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.LayoutDimensionKind
   * @see #setConstant_value(LayoutDimensionKind)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getLayoutDimensionVA_Constant_value()
   * @model
   * @generated
   */
  LayoutDimensionKind getConstant_value();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.LayoutDimensionVA#getConstant_value <em>Constant value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant value</em>' attribute.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.LayoutDimensionKind
   * @see #getConstant_value()
   * @generated
   */
  void setConstant_value(LayoutDimensionKind value);

} // LayoutDimensionVA
