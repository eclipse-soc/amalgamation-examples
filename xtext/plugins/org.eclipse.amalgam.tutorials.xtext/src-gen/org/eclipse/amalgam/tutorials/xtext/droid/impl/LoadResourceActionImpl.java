/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.Action;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Resource Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.LoadResourceActionImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.LoadResourceActionImpl#getToVar <em>To Var</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.LoadResourceActionImpl#getAfterLoad <em>After Load</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadResourceActionImpl extends ActionImpl implements LoadResourceAction
{
  /**
   * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected static final String RESOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected String resource = RESOURCE_EDEFAULT;

  /**
   * The default value of the '{@link #getToVar() <em>To Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToVar()
   * @generated
   * @ordered
   */
  protected static final String TO_VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getToVar() <em>To Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToVar()
   * @generated
   * @ordered
   */
  protected String toVar = TO_VAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getAfterLoad() <em>After Load</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfterLoad()
   * @generated
   * @ordered
   */
  protected Action afterLoad;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoadResourceActionImpl()
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
    return DroidPackage.Literals.LOAD_RESOURCE_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResource(String newResource)
  {
    String oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LOAD_RESOURCE_ACTION__RESOURCE, oldResource, resource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getToVar()
  {
    return toVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToVar(String newToVar)
  {
    String oldToVar = toVar;
    toVar = newToVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LOAD_RESOURCE_ACTION__TO_VAR, oldToVar, toVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getAfterLoad()
  {
    return afterLoad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAfterLoad(Action newAfterLoad, NotificationChain msgs)
  {
    Action oldAfterLoad = afterLoad;
    afterLoad = newAfterLoad;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LOAD_RESOURCE_ACTION__AFTER_LOAD, oldAfterLoad, newAfterLoad);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAfterLoad(Action newAfterLoad)
  {
    if (newAfterLoad != afterLoad)
    {
      NotificationChain msgs = null;
      if (afterLoad != null)
        msgs = ((InternalEObject)afterLoad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LOAD_RESOURCE_ACTION__AFTER_LOAD, null, msgs);
      if (newAfterLoad != null)
        msgs = ((InternalEObject)newAfterLoad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LOAD_RESOURCE_ACTION__AFTER_LOAD, null, msgs);
      msgs = basicSetAfterLoad(newAfterLoad, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LOAD_RESOURCE_ACTION__AFTER_LOAD, newAfterLoad, newAfterLoad));
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
      case DroidPackage.LOAD_RESOURCE_ACTION__AFTER_LOAD:
        return basicSetAfterLoad(null, msgs);
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
      case DroidPackage.LOAD_RESOURCE_ACTION__RESOURCE:
        return getResource();
      case DroidPackage.LOAD_RESOURCE_ACTION__TO_VAR:
        return getToVar();
      case DroidPackage.LOAD_RESOURCE_ACTION__AFTER_LOAD:
        return getAfterLoad();
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
      case DroidPackage.LOAD_RESOURCE_ACTION__RESOURCE:
        setResource((String)newValue);
        return;
      case DroidPackage.LOAD_RESOURCE_ACTION__TO_VAR:
        setToVar((String)newValue);
        return;
      case DroidPackage.LOAD_RESOURCE_ACTION__AFTER_LOAD:
        setAfterLoad((Action)newValue);
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
      case DroidPackage.LOAD_RESOURCE_ACTION__RESOURCE:
        setResource(RESOURCE_EDEFAULT);
        return;
      case DroidPackage.LOAD_RESOURCE_ACTION__TO_VAR:
        setToVar(TO_VAR_EDEFAULT);
        return;
      case DroidPackage.LOAD_RESOURCE_ACTION__AFTER_LOAD:
        setAfterLoad((Action)null);
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
      case DroidPackage.LOAD_RESOURCE_ACTION__RESOURCE:
        return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
      case DroidPackage.LOAD_RESOURCE_ACTION__TO_VAR:
        return TO_VAR_EDEFAULT == null ? toVar != null : !TO_VAR_EDEFAULT.equals(toVar);
      case DroidPackage.LOAD_RESOURCE_ACTION__AFTER_LOAD:
        return afterLoad != null;
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
    result.append(" (resource: ");
    result.append(resource);
    result.append(", toVar: ");
    result.append(toVar);
    result.append(')');
    return result.toString();
  }

} //LoadResourceActionImpl
