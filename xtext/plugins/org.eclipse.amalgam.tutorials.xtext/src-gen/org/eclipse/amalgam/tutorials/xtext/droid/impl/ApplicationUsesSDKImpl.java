/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.ApplicationUsesSDK;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Uses SDK</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationUsesSDKImpl#getMinSdkVersion <em>Min Sdk Version</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationUsesSDKImpl#getMaxSdkVersion <em>Max Sdk Version</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationUsesSDKImpl#getTargetSdkVersion <em>Target Sdk Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationUsesSDKImpl extends MinimalEObjectImpl.Container implements ApplicationUsesSDK
{
  /**
   * The default value of the '{@link #getMinSdkVersion() <em>Min Sdk Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinSdkVersion()
   * @generated
   * @ordered
   */
  protected static final int MIN_SDK_VERSION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinSdkVersion() <em>Min Sdk Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinSdkVersion()
   * @generated
   * @ordered
   */
  protected int minSdkVersion = MIN_SDK_VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxSdkVersion() <em>Max Sdk Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxSdkVersion()
   * @generated
   * @ordered
   */
  protected static final int MAX_SDK_VERSION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxSdkVersion() <em>Max Sdk Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxSdkVersion()
   * @generated
   * @ordered
   */
  protected int maxSdkVersion = MAX_SDK_VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetSdkVersion() <em>Target Sdk Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetSdkVersion()
   * @generated
   * @ordered
   */
  protected static final int TARGET_SDK_VERSION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTargetSdkVersion() <em>Target Sdk Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetSdkVersion()
   * @generated
   * @ordered
   */
  protected int targetSdkVersion = TARGET_SDK_VERSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationUsesSDKImpl()
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
    return DroidPackage.eINSTANCE.getApplicationUsesSDK();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinSdkVersion()
  {
    return minSdkVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinSdkVersion(int newMinSdkVersion)
  {
    int oldMinSdkVersion = minSdkVersion;
    minSdkVersion = newMinSdkVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.APPLICATION_USES_SDK__MIN_SDK_VERSION, oldMinSdkVersion, minSdkVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxSdkVersion()
  {
    return maxSdkVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxSdkVersion(int newMaxSdkVersion)
  {
    int oldMaxSdkVersion = maxSdkVersion;
    maxSdkVersion = newMaxSdkVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.APPLICATION_USES_SDK__MAX_SDK_VERSION, oldMaxSdkVersion, maxSdkVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTargetSdkVersion()
  {
    return targetSdkVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetSdkVersion(int newTargetSdkVersion)
  {
    int oldTargetSdkVersion = targetSdkVersion;
    targetSdkVersion = newTargetSdkVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.APPLICATION_USES_SDK__TARGET_SDK_VERSION, oldTargetSdkVersion, targetSdkVersion));
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
      case DroidPackage.APPLICATION_USES_SDK__MIN_SDK_VERSION:
        return getMinSdkVersion();
      case DroidPackage.APPLICATION_USES_SDK__MAX_SDK_VERSION:
        return getMaxSdkVersion();
      case DroidPackage.APPLICATION_USES_SDK__TARGET_SDK_VERSION:
        return getTargetSdkVersion();
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
      case DroidPackage.APPLICATION_USES_SDK__MIN_SDK_VERSION:
        setMinSdkVersion((Integer)newValue);
        return;
      case DroidPackage.APPLICATION_USES_SDK__MAX_SDK_VERSION:
        setMaxSdkVersion((Integer)newValue);
        return;
      case DroidPackage.APPLICATION_USES_SDK__TARGET_SDK_VERSION:
        setTargetSdkVersion((Integer)newValue);
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
      case DroidPackage.APPLICATION_USES_SDK__MIN_SDK_VERSION:
        setMinSdkVersion(MIN_SDK_VERSION_EDEFAULT);
        return;
      case DroidPackage.APPLICATION_USES_SDK__MAX_SDK_VERSION:
        setMaxSdkVersion(MAX_SDK_VERSION_EDEFAULT);
        return;
      case DroidPackage.APPLICATION_USES_SDK__TARGET_SDK_VERSION:
        setTargetSdkVersion(TARGET_SDK_VERSION_EDEFAULT);
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
      case DroidPackage.APPLICATION_USES_SDK__MIN_SDK_VERSION:
        return minSdkVersion != MIN_SDK_VERSION_EDEFAULT;
      case DroidPackage.APPLICATION_USES_SDK__MAX_SDK_VERSION:
        return maxSdkVersion != MAX_SDK_VERSION_EDEFAULT;
      case DroidPackage.APPLICATION_USES_SDK__TARGET_SDK_VERSION:
        return targetSdkVersion != TARGET_SDK_VERSION_EDEFAULT;
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
    result.append(" (minSdkVersion: ");
    result.append(minSdkVersion);
    result.append(", maxSdkVersion: ");
    result.append(maxSdkVersion);
    result.append(", targetSdkVersion: ");
    result.append(targetSdkVersion);
    result.append(')');
    return result.toString();
  }

} //ApplicationUsesSDKImpl
