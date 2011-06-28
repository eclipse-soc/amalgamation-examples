/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.LayoutOrientationKind;
import org.eclipse.amalgam.tutorials.xtext.droid.RelativeLayout;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.RelativeLayoutImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelativeLayoutImpl extends LayoutImpl implements RelativeLayout
{
  /**
   * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrientation()
   * @generated
   * @ordered
   */
  protected static final LayoutOrientationKind ORIENTATION_EDEFAULT = LayoutOrientationKind.HORIZONTAL;

  /**
   * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrientation()
   * @generated
   * @ordered
   */
  protected LayoutOrientationKind orientation = ORIENTATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelativeLayoutImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DroidPackage.eINSTANCE.getRelativeLayout();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutOrientationKind getOrientation()
  {
    return orientation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrientation(LayoutOrientationKind newOrientation)
  {
    LayoutOrientationKind oldOrientation = orientation;
    orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.RELATIVE_LAYOUT__ORIENTATION, oldOrientation, orientation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DroidPackage.RELATIVE_LAYOUT__ORIENTATION:
        return getOrientation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DroidPackage.RELATIVE_LAYOUT__ORIENTATION:
        setOrientation((LayoutOrientationKind)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DroidPackage.RELATIVE_LAYOUT__ORIENTATION:
        setOrientation(ORIENTATION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DroidPackage.RELATIVE_LAYOUT__ORIENTATION:
        return orientation != ORIENTATION_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (orientation: ");
    result.append(orientation);
    result.append(')');
    return result.toString();
  }

} //RelativeLayoutImpl
