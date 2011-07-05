/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import java.util.Collection;

import org.eclipse.amalgam.tutorials.xtext.droid.Activity;
import org.eclipse.amalgam.tutorials.xtext.droid.Application;
import org.eclipse.amalgam.tutorials.xtext.droid.ApplicationUsesSDK;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.Layout;
import org.eclipse.amalgam.tutorials.xtext.droid.Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl#getVersionCode <em>Version Code</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl#getVersionName <em>Version Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl#getSdkVersion <em>Sdk Version</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl#getLayouts <em>Layouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected String packageName = PACKAGE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVersionCode() <em>Version Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionCode()
   * @generated
   * @ordered
   */
  protected static final int VERSION_CODE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVersionCode() <em>Version Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionCode()
   * @generated
   * @ordered
   */
  protected int versionCode = VERSION_CODE_EDEFAULT;

  /**
   * The default value of the '{@link #getVersionName() <em>Version Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionName()
   * @generated
   * @ordered
   */
  protected static final String VERSION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersionName() <em>Version Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionName()
   * @generated
   * @ordered
   */
  protected String versionName = VERSION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSdkVersion() <em>Sdk Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSdkVersion()
   * @generated
   * @ordered
   */
  protected ApplicationUsesSDK sdkVersion;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> resources;

  /**
   * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivities()
   * @generated
   * @ordered
   */
  protected EList<Activity> activities;

  /**
   * The cached value of the '{@link #getLayouts() <em>Layouts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayouts()
   * @generated
   * @ordered
   */
  protected EList<Layout> layouts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationImpl()
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
    return DroidPackage.eINSTANCE.getApplication();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.APPLICATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackageName()
  {
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageName(String newPackageName)
  {
    String oldPackageName = packageName;
    packageName = newPackageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.APPLICATION__PACKAGE_NAME, oldPackageName, packageName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVersionCode()
  {
    return versionCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersionCode(int newVersionCode)
  {
    int oldVersionCode = versionCode;
    versionCode = newVersionCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.APPLICATION__VERSION_CODE, oldVersionCode, versionCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersionName()
  {
    return versionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersionName(String newVersionName)
  {
    String oldVersionName = versionName;
    versionName = newVersionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.APPLICATION__VERSION_NAME, oldVersionName, versionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationUsesSDK getSdkVersion()
  {
    return sdkVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSdkVersion(ApplicationUsesSDK newSdkVersion, NotificationChain msgs)
  {
    ApplicationUsesSDK oldSdkVersion = sdkVersion;
    sdkVersion = newSdkVersion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.APPLICATION__SDK_VERSION, oldSdkVersion, newSdkVersion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSdkVersion(ApplicationUsesSDK newSdkVersion)
  {
    if (newSdkVersion != sdkVersion)
    {
      NotificationChain msgs = null;
      if (sdkVersion != null)
        msgs = ((InternalEObject)sdkVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.APPLICATION__SDK_VERSION, null, msgs);
      if (newSdkVersion != null)
        msgs = ((InternalEObject)newSdkVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.APPLICATION__SDK_VERSION, null, msgs);
      msgs = basicSetSdkVersion(newSdkVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.APPLICATION__SDK_VERSION, newSdkVersion, newSdkVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<Resource>(Resource.class, this, DroidPackage.APPLICATION__RESOURCES);
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Activity> getActivities()
  {
    if (activities == null)
    {
      activities = new EObjectContainmentEList<Activity>(Activity.class, this, DroidPackage.APPLICATION__ACTIVITIES);
    }
    return activities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Layout> getLayouts()
  {
    if (layouts == null)
    {
      layouts = new EObjectContainmentEList<Layout>(Layout.class, this, DroidPackage.APPLICATION__LAYOUTS);
    }
    return layouts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DroidPackage.APPLICATION__SDK_VERSION:
        return basicSetSdkVersion(null, msgs);
      case DroidPackage.APPLICATION__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
      case DroidPackage.APPLICATION__ACTIVITIES:
        return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
      case DroidPackage.APPLICATION__LAYOUTS:
        return ((InternalEList<?>)getLayouts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DroidPackage.APPLICATION__NAME:
        return getName();
      case DroidPackage.APPLICATION__PACKAGE_NAME:
        return getPackageName();
      case DroidPackage.APPLICATION__VERSION_CODE:
        return getVersionCode();
      case DroidPackage.APPLICATION__VERSION_NAME:
        return getVersionName();
      case DroidPackage.APPLICATION__SDK_VERSION:
        return getSdkVersion();
      case DroidPackage.APPLICATION__RESOURCES:
        return getResources();
      case DroidPackage.APPLICATION__ACTIVITIES:
        return getActivities();
      case DroidPackage.APPLICATION__LAYOUTS:
        return getLayouts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DroidPackage.APPLICATION__NAME:
        setName((String)newValue);
        return;
      case DroidPackage.APPLICATION__PACKAGE_NAME:
        setPackageName((String)newValue);
        return;
      case DroidPackage.APPLICATION__VERSION_CODE:
        setVersionCode((Integer)newValue);
        return;
      case DroidPackage.APPLICATION__VERSION_NAME:
        setVersionName((String)newValue);
        return;
      case DroidPackage.APPLICATION__SDK_VERSION:
        setSdkVersion((ApplicationUsesSDK)newValue);
        return;
      case DroidPackage.APPLICATION__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Resource>)newValue);
        return;
      case DroidPackage.APPLICATION__ACTIVITIES:
        getActivities().clear();
        getActivities().addAll((Collection<? extends Activity>)newValue);
        return;
      case DroidPackage.APPLICATION__LAYOUTS:
        getLayouts().clear();
        getLayouts().addAll((Collection<? extends Layout>)newValue);
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
      case DroidPackage.APPLICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DroidPackage.APPLICATION__PACKAGE_NAME:
        setPackageName(PACKAGE_NAME_EDEFAULT);
        return;
      case DroidPackage.APPLICATION__VERSION_CODE:
        setVersionCode(VERSION_CODE_EDEFAULT);
        return;
      case DroidPackage.APPLICATION__VERSION_NAME:
        setVersionName(VERSION_NAME_EDEFAULT);
        return;
      case DroidPackage.APPLICATION__SDK_VERSION:
        setSdkVersion((ApplicationUsesSDK)null);
        return;
      case DroidPackage.APPLICATION__RESOURCES:
        getResources().clear();
        return;
      case DroidPackage.APPLICATION__ACTIVITIES:
        getActivities().clear();
        return;
      case DroidPackage.APPLICATION__LAYOUTS:
        getLayouts().clear();
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
      case DroidPackage.APPLICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DroidPackage.APPLICATION__PACKAGE_NAME:
        return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
      case DroidPackage.APPLICATION__VERSION_CODE:
        return versionCode != VERSION_CODE_EDEFAULT;
      case DroidPackage.APPLICATION__VERSION_NAME:
        return VERSION_NAME_EDEFAULT == null ? versionName != null : !VERSION_NAME_EDEFAULT.equals(versionName);
      case DroidPackage.APPLICATION__SDK_VERSION:
        return sdkVersion != null;
      case DroidPackage.APPLICATION__RESOURCES:
        return resources != null && !resources.isEmpty();
      case DroidPackage.APPLICATION__ACTIVITIES:
        return activities != null && !activities.isEmpty();
      case DroidPackage.APPLICATION__LAYOUTS:
        return layouts != null && !layouts.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", packageName: ");
    result.append(packageName);
    result.append(", versionCode: ");
    result.append(versionCode);
    result.append(", versionName: ");
    result.append(versionName);
    result.append(')');
    return result.toString();
  }

} //ApplicationImpl
