/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.GenericActivity;
import org.eclipse.amalgam.tutorials.xtext.droid.Layout;
import org.eclipse.amalgam.tutorials.xtext.droid.ViewCollection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericActivityImpl#getReferencedLayout <em>Referenced Layout</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericActivityImpl#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericActivityImpl extends ActivityImpl implements GenericActivity
{
  /**
   * The cached value of the '{@link #getReferencedLayout() <em>Referenced Layout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedLayout()
   * @generated
   * @ordered
   */
  protected Layout referencedLayout;

  /**
   * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidgets()
   * @generated
   * @ordered
   */
  protected ViewCollection widgets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericActivityImpl()
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
    return DroidPackage.eINSTANCE.getGenericActivity();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout getReferencedLayout()
  {
    if (referencedLayout != null && referencedLayout.eIsProxy())
    {
      InternalEObject oldReferencedLayout = (InternalEObject)referencedLayout;
      referencedLayout = (Layout)eResolveProxy(oldReferencedLayout);
      if (referencedLayout != oldReferencedLayout)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.GENERIC_ACTIVITY__REFERENCED_LAYOUT, oldReferencedLayout, referencedLayout));
      }
    }
    return referencedLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout basicGetReferencedLayout()
  {
    return referencedLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferencedLayout(Layout newReferencedLayout)
  {
    Layout oldReferencedLayout = referencedLayout;
    referencedLayout = newReferencedLayout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.GENERIC_ACTIVITY__REFERENCED_LAYOUT, oldReferencedLayout, referencedLayout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewCollection getWidgets()
  {
    return widgets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWidgets(ViewCollection newWidgets, NotificationChain msgs)
  {
    ViewCollection oldWidgets = widgets;
    widgets = newWidgets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.GENERIC_ACTIVITY__WIDGETS, oldWidgets, newWidgets);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidgets(ViewCollection newWidgets)
  {
    if (newWidgets != widgets)
    {
      NotificationChain msgs = null;
      if (widgets != null)
        msgs = ((InternalEObject)widgets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.GENERIC_ACTIVITY__WIDGETS, null, msgs);
      if (newWidgets != null)
        msgs = ((InternalEObject)newWidgets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.GENERIC_ACTIVITY__WIDGETS, null, msgs);
      msgs = basicSetWidgets(newWidgets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.GENERIC_ACTIVITY__WIDGETS, newWidgets, newWidgets));
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
      case DroidPackage.GENERIC_ACTIVITY__WIDGETS:
        return basicSetWidgets(null, msgs);
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
      case DroidPackage.GENERIC_ACTIVITY__REFERENCED_LAYOUT:
        if (resolve) return getReferencedLayout();
        return basicGetReferencedLayout();
      case DroidPackage.GENERIC_ACTIVITY__WIDGETS:
        return getWidgets();
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
      case DroidPackage.GENERIC_ACTIVITY__REFERENCED_LAYOUT:
        setReferencedLayout((Layout)newValue);
        return;
      case DroidPackage.GENERIC_ACTIVITY__WIDGETS:
        setWidgets((ViewCollection)newValue);
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
      case DroidPackage.GENERIC_ACTIVITY__REFERENCED_LAYOUT:
        setReferencedLayout((Layout)null);
        return;
      case DroidPackage.GENERIC_ACTIVITY__WIDGETS:
        setWidgets((ViewCollection)null);
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
      case DroidPackage.GENERIC_ACTIVITY__REFERENCED_LAYOUT:
        return referencedLayout != null;
      case DroidPackage.GENERIC_ACTIVITY__WIDGETS:
        return widgets != null;
    }
    return super.eIsSet(featureID);
  }

} //GenericActivityImpl
