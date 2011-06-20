/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import java.util.Collection;

import org.eclipse.amalgam.tutorials.xtext.droid.AnyDrawableVA;
import org.eclipse.amalgam.tutorials.xtext.droid.BooleanVA;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.LayoutGravityKind;
import org.eclipse.amalgam.tutorials.xtext.droid.TabWidget;
import org.eclipse.amalgam.tutorials.xtext.droid.ViewCollection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TabWidgetImpl#getGravity <em>Gravity</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TabWidgetImpl#getDivider <em>Divider</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TabWidgetImpl#getTrabStripEnabled <em>Trab Strip Enabled</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TabWidgetImpl#getTrabStripLeft <em>Trab Strip Left</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TabWidgetImpl#getTabStripRight <em>Tab Strip Right</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TabWidgetImpl#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabWidgetImpl extends AbstractLinearLayoutImpl implements TabWidget
{
  /**
   * The cached value of the '{@link #getGravity() <em>Gravity</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGravity()
   * @generated
   * @ordered
   */
  protected EList<LayoutGravityKind> gravity;

  /**
   * The cached value of the '{@link #getDivider() <em>Divider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDivider()
   * @generated
   * @ordered
   */
  protected AnyDrawableVA divider;

  /**
   * The cached value of the '{@link #getTrabStripEnabled() <em>Trab Strip Enabled</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrabStripEnabled()
   * @generated
   * @ordered
   */
  protected BooleanVA trabStripEnabled;

  /**
   * The cached value of the '{@link #getTrabStripLeft() <em>Trab Strip Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrabStripLeft()
   * @generated
   * @ordered
   */
  protected AnyDrawableVA trabStripLeft;

  /**
   * The cached value of the '{@link #getTabStripRight() <em>Tab Strip Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTabStripRight()
   * @generated
   * @ordered
   */
  protected AnyDrawableVA tabStripRight;

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
  protected TabWidgetImpl()
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
    return DroidPackage.eINSTANCE.getTabWidget();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LayoutGravityKind> getGravity()
  {
    if (gravity == null)
    {
      gravity = new EDataTypeEList<LayoutGravityKind>(LayoutGravityKind.class, this, DroidPackage.TAB_WIDGET__GRAVITY);
    }
    return gravity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyDrawableVA getDivider()
  {
    return divider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDivider(AnyDrawableVA newDivider, NotificationChain msgs)
  {
    AnyDrawableVA oldDivider = divider;
    divider = newDivider;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.TAB_WIDGET__DIVIDER, oldDivider, newDivider);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDivider(AnyDrawableVA newDivider)
  {
    if (newDivider != divider)
    {
      NotificationChain msgs = null;
      if (divider != null)
        msgs = ((InternalEObject)divider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB_WIDGET__DIVIDER, null, msgs);
      if (newDivider != null)
        msgs = ((InternalEObject)newDivider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB_WIDGET__DIVIDER, null, msgs);
      msgs = basicSetDivider(newDivider, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TAB_WIDGET__DIVIDER, newDivider, newDivider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanVA getTrabStripEnabled()
  {
    return trabStripEnabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrabStripEnabled(BooleanVA newTrabStripEnabled, NotificationChain msgs)
  {
    BooleanVA oldTrabStripEnabled = trabStripEnabled;
    trabStripEnabled = newTrabStripEnabled;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.TAB_WIDGET__TRAB_STRIP_ENABLED, oldTrabStripEnabled, newTrabStripEnabled);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrabStripEnabled(BooleanVA newTrabStripEnabled)
  {
    if (newTrabStripEnabled != trabStripEnabled)
    {
      NotificationChain msgs = null;
      if (trabStripEnabled != null)
        msgs = ((InternalEObject)trabStripEnabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB_WIDGET__TRAB_STRIP_ENABLED, null, msgs);
      if (newTrabStripEnabled != null)
        msgs = ((InternalEObject)newTrabStripEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB_WIDGET__TRAB_STRIP_ENABLED, null, msgs);
      msgs = basicSetTrabStripEnabled(newTrabStripEnabled, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TAB_WIDGET__TRAB_STRIP_ENABLED, newTrabStripEnabled, newTrabStripEnabled));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyDrawableVA getTrabStripLeft()
  {
    return trabStripLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrabStripLeft(AnyDrawableVA newTrabStripLeft, NotificationChain msgs)
  {
    AnyDrawableVA oldTrabStripLeft = trabStripLeft;
    trabStripLeft = newTrabStripLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.TAB_WIDGET__TRAB_STRIP_LEFT, oldTrabStripLeft, newTrabStripLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrabStripLeft(AnyDrawableVA newTrabStripLeft)
  {
    if (newTrabStripLeft != trabStripLeft)
    {
      NotificationChain msgs = null;
      if (trabStripLeft != null)
        msgs = ((InternalEObject)trabStripLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB_WIDGET__TRAB_STRIP_LEFT, null, msgs);
      if (newTrabStripLeft != null)
        msgs = ((InternalEObject)newTrabStripLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB_WIDGET__TRAB_STRIP_LEFT, null, msgs);
      msgs = basicSetTrabStripLeft(newTrabStripLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TAB_WIDGET__TRAB_STRIP_LEFT, newTrabStripLeft, newTrabStripLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyDrawableVA getTabStripRight()
  {
    return tabStripRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTabStripRight(AnyDrawableVA newTabStripRight, NotificationChain msgs)
  {
    AnyDrawableVA oldTabStripRight = tabStripRight;
    tabStripRight = newTabStripRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.TAB_WIDGET__TAB_STRIP_RIGHT, oldTabStripRight, newTabStripRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTabStripRight(AnyDrawableVA newTabStripRight)
  {
    if (newTabStripRight != tabStripRight)
    {
      NotificationChain msgs = null;
      if (tabStripRight != null)
        msgs = ((InternalEObject)tabStripRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB_WIDGET__TAB_STRIP_RIGHT, null, msgs);
      if (newTabStripRight != null)
        msgs = ((InternalEObject)newTabStripRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB_WIDGET__TAB_STRIP_RIGHT, null, msgs);
      msgs = basicSetTabStripRight(newTabStripRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TAB_WIDGET__TAB_STRIP_RIGHT, newTabStripRight, newTabStripRight));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.TAB_WIDGET__WIDGETS, oldWidgets, newWidgets);
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
        msgs = ((InternalEObject)widgets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB_WIDGET__WIDGETS, null, msgs);
      if (newWidgets != null)
        msgs = ((InternalEObject)newWidgets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB_WIDGET__WIDGETS, null, msgs);
      msgs = basicSetWidgets(newWidgets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TAB_WIDGET__WIDGETS, newWidgets, newWidgets));
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
      case DroidPackage.TAB_WIDGET__DIVIDER:
        return basicSetDivider(null, msgs);
      case DroidPackage.TAB_WIDGET__TRAB_STRIP_ENABLED:
        return basicSetTrabStripEnabled(null, msgs);
      case DroidPackage.TAB_WIDGET__TRAB_STRIP_LEFT:
        return basicSetTrabStripLeft(null, msgs);
      case DroidPackage.TAB_WIDGET__TAB_STRIP_RIGHT:
        return basicSetTabStripRight(null, msgs);
      case DroidPackage.TAB_WIDGET__WIDGETS:
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
      case DroidPackage.TAB_WIDGET__GRAVITY:
        return getGravity();
      case DroidPackage.TAB_WIDGET__DIVIDER:
        return getDivider();
      case DroidPackage.TAB_WIDGET__TRAB_STRIP_ENABLED:
        return getTrabStripEnabled();
      case DroidPackage.TAB_WIDGET__TRAB_STRIP_LEFT:
        return getTrabStripLeft();
      case DroidPackage.TAB_WIDGET__TAB_STRIP_RIGHT:
        return getTabStripRight();
      case DroidPackage.TAB_WIDGET__WIDGETS:
        return getWidgets();
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
      case DroidPackage.TAB_WIDGET__GRAVITY:
        getGravity().clear();
        getGravity().addAll((Collection<? extends LayoutGravityKind>)newValue);
        return;
      case DroidPackage.TAB_WIDGET__DIVIDER:
        setDivider((AnyDrawableVA)newValue);
        return;
      case DroidPackage.TAB_WIDGET__TRAB_STRIP_ENABLED:
        setTrabStripEnabled((BooleanVA)newValue);
        return;
      case DroidPackage.TAB_WIDGET__TRAB_STRIP_LEFT:
        setTrabStripLeft((AnyDrawableVA)newValue);
        return;
      case DroidPackage.TAB_WIDGET__TAB_STRIP_RIGHT:
        setTabStripRight((AnyDrawableVA)newValue);
        return;
      case DroidPackage.TAB_WIDGET__WIDGETS:
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
      case DroidPackage.TAB_WIDGET__GRAVITY:
        getGravity().clear();
        return;
      case DroidPackage.TAB_WIDGET__DIVIDER:
        setDivider((AnyDrawableVA)null);
        return;
      case DroidPackage.TAB_WIDGET__TRAB_STRIP_ENABLED:
        setTrabStripEnabled((BooleanVA)null);
        return;
      case DroidPackage.TAB_WIDGET__TRAB_STRIP_LEFT:
        setTrabStripLeft((AnyDrawableVA)null);
        return;
      case DroidPackage.TAB_WIDGET__TAB_STRIP_RIGHT:
        setTabStripRight((AnyDrawableVA)null);
        return;
      case DroidPackage.TAB_WIDGET__WIDGETS:
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
      case DroidPackage.TAB_WIDGET__GRAVITY:
        return gravity != null && !gravity.isEmpty();
      case DroidPackage.TAB_WIDGET__DIVIDER:
        return divider != null;
      case DroidPackage.TAB_WIDGET__TRAB_STRIP_ENABLED:
        return trabStripEnabled != null;
      case DroidPackage.TAB_WIDGET__TRAB_STRIP_LEFT:
        return trabStripLeft != null;
      case DroidPackage.TAB_WIDGET__TAB_STRIP_RIGHT:
        return tabStripRight != null;
      case DroidPackage.TAB_WIDGET__WIDGETS:
        return widgets != null;
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
    result.append(" (gravity: ");
    result.append(gravity);
    result.append(')');
    return result.toString();
  }

} //TabWidgetImpl
