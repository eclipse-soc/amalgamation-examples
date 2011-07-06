/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.BooleanVA;
import org.eclipse.amalgam.tutorials.xtext.droid.DimensionVA;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.LayoutParams;
import org.eclipse.amalgam.tutorials.xtext.droid.Widget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getLayoutParams <em>Layout Params</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getTop <em>Top</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getClickable <em>Clickable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetImpl extends ViewImpl implements Widget
{
  /**
   * The cached value of the '{@link #getLayoutParams() <em>Layout Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutParams()
   * @generated
   * @ordered
   */
  protected LayoutParams layoutParams;

  /**
   * The cached value of the '{@link #getTop() <em>Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTop()
   * @generated
   * @ordered
   */
  protected DimensionVA top;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected DimensionVA left;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected DimensionVA width;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected DimensionVA height;

  /**
   * The cached value of the '{@link #getClickable() <em>Clickable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClickable()
   * @generated
   * @ordered
   */
  protected BooleanVA clickable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WidgetImpl()
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
    return DroidPackage.eINSTANCE.getWidget();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutParams getLayoutParams()
  {
    return layoutParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLayoutParams(LayoutParams newLayoutParams, NotificationChain msgs)
  {
    LayoutParams oldLayoutParams = layoutParams;
    layoutParams = newLayoutParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__LAYOUT_PARAMS, oldLayoutParams, newLayoutParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayoutParams(LayoutParams newLayoutParams)
  {
    if (newLayoutParams != layoutParams)
    {
      NotificationChain msgs = null;
      if (layoutParams != null)
        msgs = ((InternalEObject)layoutParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__LAYOUT_PARAMS, null, msgs);
      if (newLayoutParams != null)
        msgs = ((InternalEObject)newLayoutParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__LAYOUT_PARAMS, null, msgs);
      msgs = basicSetLayoutParams(newLayoutParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__LAYOUT_PARAMS, newLayoutParams, newLayoutParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionVA getTop()
  {
    return top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTop(DimensionVA newTop, NotificationChain msgs)
  {
    DimensionVA oldTop = top;
    top = newTop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__TOP, oldTop, newTop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTop(DimensionVA newTop)
  {
    if (newTop != top)
    {
      NotificationChain msgs = null;
      if (top != null)
        msgs = ((InternalEObject)top).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__TOP, null, msgs);
      if (newTop != null)
        msgs = ((InternalEObject)newTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__TOP, null, msgs);
      msgs = basicSetTop(newTop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__TOP, newTop, newTop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionVA getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(DimensionVA newLeft, NotificationChain msgs)
  {
    DimensionVA oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(DimensionVA newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionVA getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWidth(DimensionVA newWidth, NotificationChain msgs)
  {
    DimensionVA oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__WIDTH, oldWidth, newWidth);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(DimensionVA newWidth)
  {
    if (newWidth != width)
    {
      NotificationChain msgs = null;
      if (width != null)
        msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__WIDTH, null, msgs);
      if (newWidth != null)
        msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__WIDTH, null, msgs);
      msgs = basicSetWidth(newWidth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__WIDTH, newWidth, newWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionVA getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeight(DimensionVA newHeight, NotificationChain msgs)
  {
    DimensionVA oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__HEIGHT, oldHeight, newHeight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(DimensionVA newHeight)
  {
    if (newHeight != height)
    {
      NotificationChain msgs = null;
      if (height != null)
        msgs = ((InternalEObject)height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__HEIGHT, null, msgs);
      if (newHeight != null)
        msgs = ((InternalEObject)newHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__HEIGHT, null, msgs);
      msgs = basicSetHeight(newHeight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__HEIGHT, newHeight, newHeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanVA getClickable()
  {
    return clickable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClickable(BooleanVA newClickable, NotificationChain msgs)
  {
    BooleanVA oldClickable = clickable;
    clickable = newClickable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__CLICKABLE, oldClickable, newClickable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClickable(BooleanVA newClickable)
  {
    if (newClickable != clickable)
    {
      NotificationChain msgs = null;
      if (clickable != null)
        msgs = ((InternalEObject)clickable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__CLICKABLE, null, msgs);
      if (newClickable != null)
        msgs = ((InternalEObject)newClickable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__CLICKABLE, null, msgs);
      msgs = basicSetClickable(newClickable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__CLICKABLE, newClickable, newClickable));
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
      case DroidPackage.WIDGET__LAYOUT_PARAMS:
        return basicSetLayoutParams(null, msgs);
      case DroidPackage.WIDGET__TOP:
        return basicSetTop(null, msgs);
      case DroidPackage.WIDGET__LEFT:
        return basicSetLeft(null, msgs);
      case DroidPackage.WIDGET__WIDTH:
        return basicSetWidth(null, msgs);
      case DroidPackage.WIDGET__HEIGHT:
        return basicSetHeight(null, msgs);
      case DroidPackage.WIDGET__CLICKABLE:
        return basicSetClickable(null, msgs);
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
      case DroidPackage.WIDGET__LAYOUT_PARAMS:
        return getLayoutParams();
      case DroidPackage.WIDGET__TOP:
        return getTop();
      case DroidPackage.WIDGET__LEFT:
        return getLeft();
      case DroidPackage.WIDGET__WIDTH:
        return getWidth();
      case DroidPackage.WIDGET__HEIGHT:
        return getHeight();
      case DroidPackage.WIDGET__CLICKABLE:
        return getClickable();
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
      case DroidPackage.WIDGET__LAYOUT_PARAMS:
        setLayoutParams((LayoutParams)newValue);
        return;
      case DroidPackage.WIDGET__TOP:
        setTop((DimensionVA)newValue);
        return;
      case DroidPackage.WIDGET__LEFT:
        setLeft((DimensionVA)newValue);
        return;
      case DroidPackage.WIDGET__WIDTH:
        setWidth((DimensionVA)newValue);
        return;
      case DroidPackage.WIDGET__HEIGHT:
        setHeight((DimensionVA)newValue);
        return;
      case DroidPackage.WIDGET__CLICKABLE:
        setClickable((BooleanVA)newValue);
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
      case DroidPackage.WIDGET__LAYOUT_PARAMS:
        setLayoutParams((LayoutParams)null);
        return;
      case DroidPackage.WIDGET__TOP:
        setTop((DimensionVA)null);
        return;
      case DroidPackage.WIDGET__LEFT:
        setLeft((DimensionVA)null);
        return;
      case DroidPackage.WIDGET__WIDTH:
        setWidth((DimensionVA)null);
        return;
      case DroidPackage.WIDGET__HEIGHT:
        setHeight((DimensionVA)null);
        return;
      case DroidPackage.WIDGET__CLICKABLE:
        setClickable((BooleanVA)null);
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
      case DroidPackage.WIDGET__LAYOUT_PARAMS:
        return layoutParams != null;
      case DroidPackage.WIDGET__TOP:
        return top != null;
      case DroidPackage.WIDGET__LEFT:
        return left != null;
      case DroidPackage.WIDGET__WIDTH:
        return width != null;
      case DroidPackage.WIDGET__HEIGHT:
        return height != null;
      case DroidPackage.WIDGET__CLICKABLE:
        return clickable != null;
    }
    return super.eIsSet(featureID);
  }

} //WidgetImpl
