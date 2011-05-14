/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.DrawableResourcePropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.Widget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getTop <em>Top</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getClickable <em>Clickable</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getFadeScrollBars <em>Fade Scroll Bars</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl#getIsScrollContainer <em>Is Scroll Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetImpl extends MinimalEObjectImpl.Container implements Widget
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getTop() <em>Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTop()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue top;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue left;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue width;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected DimensionPropertyValue height;

  /**
   * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackground()
   * @generated
   * @ordered
   */
  protected DrawableResourcePropertyValue background;

  /**
   * The cached value of the '{@link #getClickable() <em>Clickable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClickable()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue clickable;

  /**
   * The cached value of the '{@link #getFadeScrollBars() <em>Fade Scroll Bars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFadeScrollBars()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue fadeScrollBars;

  /**
   * The cached value of the '{@link #getIsScrollContainer() <em>Is Scroll Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsScrollContainer()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue isScrollContainer;

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
    return DroidPackage.Literals.WIDGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue getTop()
  {
    return top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTop(DimensionPropertyValue newTop, NotificationChain msgs)
  {
    DimensionPropertyValue oldTop = top;
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
  public void setTop(DimensionPropertyValue newTop)
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
  public DimensionPropertyValue getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(DimensionPropertyValue newLeft, NotificationChain msgs)
  {
    DimensionPropertyValue oldLeft = left;
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
  public void setLeft(DimensionPropertyValue newLeft)
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
  public DimensionPropertyValue getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWidth(DimensionPropertyValue newWidth, NotificationChain msgs)
  {
    DimensionPropertyValue oldWidth = width;
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
  public void setWidth(DimensionPropertyValue newWidth)
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
  public DimensionPropertyValue getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeight(DimensionPropertyValue newHeight, NotificationChain msgs)
  {
    DimensionPropertyValue oldHeight = height;
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
  public void setHeight(DimensionPropertyValue newHeight)
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
  public DrawableResourcePropertyValue getBackground()
  {
    return background;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBackground(DrawableResourcePropertyValue newBackground, NotificationChain msgs)
  {
    DrawableResourcePropertyValue oldBackground = background;
    background = newBackground;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__BACKGROUND, oldBackground, newBackground);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackground(DrawableResourcePropertyValue newBackground)
  {
    if (newBackground != background)
    {
      NotificationChain msgs = null;
      if (background != null)
        msgs = ((InternalEObject)background).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__BACKGROUND, null, msgs);
      if (newBackground != null)
        msgs = ((InternalEObject)newBackground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__BACKGROUND, null, msgs);
      msgs = basicSetBackground(newBackground, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__BACKGROUND, newBackground, newBackground));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getClickable()
  {
    return clickable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClickable(BooleanPropertyValue newClickable, NotificationChain msgs)
  {
    BooleanPropertyValue oldClickable = clickable;
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
  public void setClickable(BooleanPropertyValue newClickable)
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
  public BooleanPropertyValue getFadeScrollBars()
  {
    return fadeScrollBars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFadeScrollBars(BooleanPropertyValue newFadeScrollBars, NotificationChain msgs)
  {
    BooleanPropertyValue oldFadeScrollBars = fadeScrollBars;
    fadeScrollBars = newFadeScrollBars;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__FADE_SCROLL_BARS, oldFadeScrollBars, newFadeScrollBars);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFadeScrollBars(BooleanPropertyValue newFadeScrollBars)
  {
    if (newFadeScrollBars != fadeScrollBars)
    {
      NotificationChain msgs = null;
      if (fadeScrollBars != null)
        msgs = ((InternalEObject)fadeScrollBars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__FADE_SCROLL_BARS, null, msgs);
      if (newFadeScrollBars != null)
        msgs = ((InternalEObject)newFadeScrollBars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__FADE_SCROLL_BARS, null, msgs);
      msgs = basicSetFadeScrollBars(newFadeScrollBars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__FADE_SCROLL_BARS, newFadeScrollBars, newFadeScrollBars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getIsScrollContainer()
  {
    return isScrollContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsScrollContainer(BooleanPropertyValue newIsScrollContainer, NotificationChain msgs)
  {
    BooleanPropertyValue oldIsScrollContainer = isScrollContainer;
    isScrollContainer = newIsScrollContainer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__IS_SCROLL_CONTAINER, oldIsScrollContainer, newIsScrollContainer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsScrollContainer(BooleanPropertyValue newIsScrollContainer)
  {
    if (newIsScrollContainer != isScrollContainer)
    {
      NotificationChain msgs = null;
      if (isScrollContainer != null)
        msgs = ((InternalEObject)isScrollContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__IS_SCROLL_CONTAINER, null, msgs);
      if (newIsScrollContainer != null)
        msgs = ((InternalEObject)newIsScrollContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.WIDGET__IS_SCROLL_CONTAINER, null, msgs);
      msgs = basicSetIsScrollContainer(newIsScrollContainer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.WIDGET__IS_SCROLL_CONTAINER, newIsScrollContainer, newIsScrollContainer));
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
      case DroidPackage.WIDGET__TOP:
        return basicSetTop(null, msgs);
      case DroidPackage.WIDGET__LEFT:
        return basicSetLeft(null, msgs);
      case DroidPackage.WIDGET__WIDTH:
        return basicSetWidth(null, msgs);
      case DroidPackage.WIDGET__HEIGHT:
        return basicSetHeight(null, msgs);
      case DroidPackage.WIDGET__BACKGROUND:
        return basicSetBackground(null, msgs);
      case DroidPackage.WIDGET__CLICKABLE:
        return basicSetClickable(null, msgs);
      case DroidPackage.WIDGET__FADE_SCROLL_BARS:
        return basicSetFadeScrollBars(null, msgs);
      case DroidPackage.WIDGET__IS_SCROLL_CONTAINER:
        return basicSetIsScrollContainer(null, msgs);
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
      case DroidPackage.WIDGET__ID:
        return getId();
      case DroidPackage.WIDGET__TOP:
        return getTop();
      case DroidPackage.WIDGET__LEFT:
        return getLeft();
      case DroidPackage.WIDGET__WIDTH:
        return getWidth();
      case DroidPackage.WIDGET__HEIGHT:
        return getHeight();
      case DroidPackage.WIDGET__BACKGROUND:
        return getBackground();
      case DroidPackage.WIDGET__CLICKABLE:
        return getClickable();
      case DroidPackage.WIDGET__FADE_SCROLL_BARS:
        return getFadeScrollBars();
      case DroidPackage.WIDGET__IS_SCROLL_CONTAINER:
        return getIsScrollContainer();
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
      case DroidPackage.WIDGET__ID:
        setId((String)newValue);
        return;
      case DroidPackage.WIDGET__TOP:
        setTop((DimensionPropertyValue)newValue);
        return;
      case DroidPackage.WIDGET__LEFT:
        setLeft((DimensionPropertyValue)newValue);
        return;
      case DroidPackage.WIDGET__WIDTH:
        setWidth((DimensionPropertyValue)newValue);
        return;
      case DroidPackage.WIDGET__HEIGHT:
        setHeight((DimensionPropertyValue)newValue);
        return;
      case DroidPackage.WIDGET__BACKGROUND:
        setBackground((DrawableResourcePropertyValue)newValue);
        return;
      case DroidPackage.WIDGET__CLICKABLE:
        setClickable((BooleanPropertyValue)newValue);
        return;
      case DroidPackage.WIDGET__FADE_SCROLL_BARS:
        setFadeScrollBars((BooleanPropertyValue)newValue);
        return;
      case DroidPackage.WIDGET__IS_SCROLL_CONTAINER:
        setIsScrollContainer((BooleanPropertyValue)newValue);
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
      case DroidPackage.WIDGET__ID:
        setId(ID_EDEFAULT);
        return;
      case DroidPackage.WIDGET__TOP:
        setTop((DimensionPropertyValue)null);
        return;
      case DroidPackage.WIDGET__LEFT:
        setLeft((DimensionPropertyValue)null);
        return;
      case DroidPackage.WIDGET__WIDTH:
        setWidth((DimensionPropertyValue)null);
        return;
      case DroidPackage.WIDGET__HEIGHT:
        setHeight((DimensionPropertyValue)null);
        return;
      case DroidPackage.WIDGET__BACKGROUND:
        setBackground((DrawableResourcePropertyValue)null);
        return;
      case DroidPackage.WIDGET__CLICKABLE:
        setClickable((BooleanPropertyValue)null);
        return;
      case DroidPackage.WIDGET__FADE_SCROLL_BARS:
        setFadeScrollBars((BooleanPropertyValue)null);
        return;
      case DroidPackage.WIDGET__IS_SCROLL_CONTAINER:
        setIsScrollContainer((BooleanPropertyValue)null);
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
      case DroidPackage.WIDGET__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case DroidPackage.WIDGET__TOP:
        return top != null;
      case DroidPackage.WIDGET__LEFT:
        return left != null;
      case DroidPackage.WIDGET__WIDTH:
        return width != null;
      case DroidPackage.WIDGET__HEIGHT:
        return height != null;
      case DroidPackage.WIDGET__BACKGROUND:
        return background != null;
      case DroidPackage.WIDGET__CLICKABLE:
        return clickable != null;
      case DroidPackage.WIDGET__FADE_SCROLL_BARS:
        return fadeScrollBars != null;
      case DroidPackage.WIDGET__IS_SCROLL_CONTAINER:
        return isScrollContainer != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //WidgetImpl
