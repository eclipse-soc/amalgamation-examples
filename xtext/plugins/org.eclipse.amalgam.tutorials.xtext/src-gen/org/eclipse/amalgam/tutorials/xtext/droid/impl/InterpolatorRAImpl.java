/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.InterpolatorRA;
import org.eclipse.amalgam.tutorials.xtext.droid.InterpolatorsKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interpolator RA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.InterpolatorRAImpl#getInterpolatorName <em>Interpolator Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterpolatorRAImpl extends ResourceAccessImpl implements InterpolatorRA
{
  /**
   * The default value of the '{@link #getInterpolatorName() <em>Interpolator Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterpolatorName()
   * @generated
   * @ordered
   */
  protected static final InterpolatorsKind INTERPOLATOR_NAME_EDEFAULT = InterpolatorsKind.ACCELERATE_DECELERATE;

  /**
   * The cached value of the '{@link #getInterpolatorName() <em>Interpolator Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterpolatorName()
   * @generated
   * @ordered
   */
  protected InterpolatorsKind interpolatorName = INTERPOLATOR_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterpolatorRAImpl()
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
    return DroidPackage.eINSTANCE.getInterpolatorRA();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterpolatorsKind getInterpolatorName()
  {
    return interpolatorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterpolatorName(InterpolatorsKind newInterpolatorName)
  {
    InterpolatorsKind oldInterpolatorName = interpolatorName;
    interpolatorName = newInterpolatorName == null ? INTERPOLATOR_NAME_EDEFAULT : newInterpolatorName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.INTERPOLATOR_RA__INTERPOLATOR_NAME, oldInterpolatorName, interpolatorName));
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
      case DroidPackage.INTERPOLATOR_RA__INTERPOLATOR_NAME:
        return getInterpolatorName();
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
      case DroidPackage.INTERPOLATOR_RA__INTERPOLATOR_NAME:
        setInterpolatorName((InterpolatorsKind)newValue);
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
      case DroidPackage.INTERPOLATOR_RA__INTERPOLATOR_NAME:
        setInterpolatorName(INTERPOLATOR_NAME_EDEFAULT);
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
      case DroidPackage.INTERPOLATOR_RA__INTERPOLATOR_NAME:
        return interpolatorName != INTERPOLATOR_NAME_EDEFAULT;
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
    result.append(" (interpolatorName: ");
    result.append(interpolatorName);
    result.append(')');
    return result.toString();
  }

} //InterpolatorRAImpl
