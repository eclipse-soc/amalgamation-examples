/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Value Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getDimensionValueResource()
 * @model
 * @generated
 */
public interface DimensionValueResource extends ValueResource
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(Float)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getDimensionValueResource_Value()
   * @model
   * @generated
   */
  Float getValue();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(Float value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionKind
   * @see #setUnit(DimensionKind)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getDimensionValueResource_Unit()
   * @model
   * @generated
   */
  DimensionKind getUnit();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionKind
   * @see #getUnit()
   * @generated
   */
  void setUnit(DimensionKind value);

} // DimensionValueResource
