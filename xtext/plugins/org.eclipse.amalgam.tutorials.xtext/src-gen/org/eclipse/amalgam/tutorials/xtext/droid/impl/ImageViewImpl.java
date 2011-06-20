/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.AnyDrawableVA;
import org.eclipse.amalgam.tutorials.xtext.droid.BooleanVA;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.ImageView;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ImageViewImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ImageViewImpl#getFadeScrollBars <em>Fade Scroll Bars</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ImageViewImpl#getIsScrollContainer <em>Is Scroll Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageViewImpl extends WidgetImpl implements ImageView
{
  /**
   * The cached value of the '{@link #getSrc() <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrc()
   * @generated
   * @ordered
   */
  protected AnyDrawableVA src;

  /**
   * The cached value of the '{@link #getFadeScrollBars() <em>Fade Scroll Bars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFadeScrollBars()
   * @generated
   * @ordered
   */
  protected BooleanVA fadeScrollBars;

  /**
   * The cached value of the '{@link #getIsScrollContainer() <em>Is Scroll Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsScrollContainer()
   * @generated
   * @ordered
   */
  protected BooleanVA isScrollContainer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageViewImpl()
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
    return DroidPackage.eINSTANCE.getImageView();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyDrawableVA getSrc()
  {
    return src;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrc(AnyDrawableVA newSrc, NotificationChain msgs)
  {
    AnyDrawableVA oldSrc = src;
    src = newSrc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.IMAGE_VIEW__SRC, oldSrc, newSrc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrc(AnyDrawableVA newSrc)
  {
    if (newSrc != src)
    {
      NotificationChain msgs = null;
      if (src != null)
        msgs = ((InternalEObject)src).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.IMAGE_VIEW__SRC, null, msgs);
      if (newSrc != null)
        msgs = ((InternalEObject)newSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.IMAGE_VIEW__SRC, null, msgs);
      msgs = basicSetSrc(newSrc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.IMAGE_VIEW__SRC, newSrc, newSrc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanVA getFadeScrollBars()
  {
    return fadeScrollBars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFadeScrollBars(BooleanVA newFadeScrollBars, NotificationChain msgs)
  {
    BooleanVA oldFadeScrollBars = fadeScrollBars;
    fadeScrollBars = newFadeScrollBars;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.IMAGE_VIEW__FADE_SCROLL_BARS, oldFadeScrollBars, newFadeScrollBars);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFadeScrollBars(BooleanVA newFadeScrollBars)
  {
    if (newFadeScrollBars != fadeScrollBars)
    {
      NotificationChain msgs = null;
      if (fadeScrollBars != null)
        msgs = ((InternalEObject)fadeScrollBars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.IMAGE_VIEW__FADE_SCROLL_BARS, null, msgs);
      if (newFadeScrollBars != null)
        msgs = ((InternalEObject)newFadeScrollBars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.IMAGE_VIEW__FADE_SCROLL_BARS, null, msgs);
      msgs = basicSetFadeScrollBars(newFadeScrollBars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.IMAGE_VIEW__FADE_SCROLL_BARS, newFadeScrollBars, newFadeScrollBars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanVA getIsScrollContainer()
  {
    return isScrollContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsScrollContainer(BooleanVA newIsScrollContainer, NotificationChain msgs)
  {
    BooleanVA oldIsScrollContainer = isScrollContainer;
    isScrollContainer = newIsScrollContainer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER, oldIsScrollContainer, newIsScrollContainer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsScrollContainer(BooleanVA newIsScrollContainer)
  {
    if (newIsScrollContainer != isScrollContainer)
    {
      NotificationChain msgs = null;
      if (isScrollContainer != null)
        msgs = ((InternalEObject)isScrollContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER, null, msgs);
      if (newIsScrollContainer != null)
        msgs = ((InternalEObject)newIsScrollContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER, null, msgs);
      msgs = basicSetIsScrollContainer(newIsScrollContainer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER, newIsScrollContainer, newIsScrollContainer));
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
      case DroidPackage.IMAGE_VIEW__SRC:
        return basicSetSrc(null, msgs);
      case DroidPackage.IMAGE_VIEW__FADE_SCROLL_BARS:
        return basicSetFadeScrollBars(null, msgs);
      case DroidPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER:
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
      case DroidPackage.IMAGE_VIEW__SRC:
        return getSrc();
      case DroidPackage.IMAGE_VIEW__FADE_SCROLL_BARS:
        return getFadeScrollBars();
      case DroidPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER:
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
      case DroidPackage.IMAGE_VIEW__SRC:
        setSrc((AnyDrawableVA)newValue);
        return;
      case DroidPackage.IMAGE_VIEW__FADE_SCROLL_BARS:
        setFadeScrollBars((BooleanVA)newValue);
        return;
      case DroidPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER:
        setIsScrollContainer((BooleanVA)newValue);
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
      case DroidPackage.IMAGE_VIEW__SRC:
        setSrc((AnyDrawableVA)null);
        return;
      case DroidPackage.IMAGE_VIEW__FADE_SCROLL_BARS:
        setFadeScrollBars((BooleanVA)null);
        return;
      case DroidPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER:
        setIsScrollContainer((BooleanVA)null);
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
      case DroidPackage.IMAGE_VIEW__SRC:
        return src != null;
      case DroidPackage.IMAGE_VIEW__FADE_SCROLL_BARS:
        return fadeScrollBars != null;
      case DroidPackage.IMAGE_VIEW__IS_SCROLL_CONTAINER:
        return isScrollContainer != null;
    }
    return super.eIsSet(featureID);
  }

} //ImageViewImpl
