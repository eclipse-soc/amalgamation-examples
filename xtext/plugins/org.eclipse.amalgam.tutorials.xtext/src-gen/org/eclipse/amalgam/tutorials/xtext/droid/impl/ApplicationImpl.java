/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import java.util.Collection;

import org.eclipse.amalgam.tutorials.xtext.droid.Activity;
import org.eclipse.amalgam.tutorials.xtext.droid.Application;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.Layout;
import org.eclipse.amalgam.tutorials.xtext.droid.ManifestFile;

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
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl#getActivities <em>Activities</em>}</li>
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
   * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected String package_ = PACKAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getManifest() <em>Manifest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManifest()
   * @generated
   * @ordered
   */
  protected ManifestFile manifest;

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
   * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivities()
   * @generated
   * @ordered
   */
  protected EList<Activity> activities;

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
    return DroidPackage.Literals.APPLICATION;
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
  public String getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(String newPackage)
  {
    String oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.APPLICATION__PACKAGE, oldPackage, package_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManifestFile getManifest()
  {
    return manifest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManifest(ManifestFile newManifest, NotificationChain msgs)
  {
    ManifestFile oldManifest = manifest;
    manifest = newManifest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.APPLICATION__MANIFEST, oldManifest, newManifest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManifest(ManifestFile newManifest)
  {
    if (newManifest != manifest)
    {
      NotificationChain msgs = null;
      if (manifest != null)
        msgs = ((InternalEObject)manifest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.APPLICATION__MANIFEST, null, msgs);
      if (newManifest != null)
        msgs = ((InternalEObject)newManifest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.APPLICATION__MANIFEST, null, msgs);
      msgs = basicSetManifest(newManifest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.APPLICATION__MANIFEST, newManifest, newManifest));
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DroidPackage.APPLICATION__MANIFEST:
        return basicSetManifest(null, msgs);
      case DroidPackage.APPLICATION__LAYOUTS:
        return ((InternalEList<?>)getLayouts()).basicRemove(otherEnd, msgs);
      case DroidPackage.APPLICATION__ACTIVITIES:
        return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
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
      case DroidPackage.APPLICATION__PACKAGE:
        return getPackage();
      case DroidPackage.APPLICATION__MANIFEST:
        return getManifest();
      case DroidPackage.APPLICATION__LAYOUTS:
        return getLayouts();
      case DroidPackage.APPLICATION__ACTIVITIES:
        return getActivities();
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
      case DroidPackage.APPLICATION__PACKAGE:
        setPackage((String)newValue);
        return;
      case DroidPackage.APPLICATION__MANIFEST:
        setManifest((ManifestFile)newValue);
        return;
      case DroidPackage.APPLICATION__LAYOUTS:
        getLayouts().clear();
        getLayouts().addAll((Collection<? extends Layout>)newValue);
        return;
      case DroidPackage.APPLICATION__ACTIVITIES:
        getActivities().clear();
        getActivities().addAll((Collection<? extends Activity>)newValue);
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
      case DroidPackage.APPLICATION__PACKAGE:
        setPackage(PACKAGE_EDEFAULT);
        return;
      case DroidPackage.APPLICATION__MANIFEST:
        setManifest((ManifestFile)null);
        return;
      case DroidPackage.APPLICATION__LAYOUTS:
        getLayouts().clear();
        return;
      case DroidPackage.APPLICATION__ACTIVITIES:
        getActivities().clear();
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
      case DroidPackage.APPLICATION__PACKAGE:
        return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
      case DroidPackage.APPLICATION__MANIFEST:
        return manifest != null;
      case DroidPackage.APPLICATION__LAYOUTS:
        return layouts != null && !layouts.isEmpty();
      case DroidPackage.APPLICATION__ACTIVITIES:
        return activities != null && !activities.isEmpty();
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
    result.append(", package: ");
    result.append(package_);
    result.append(')');
    return result.toString();
  }

} //ApplicationImpl
