/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import java.util.Collection;

import org.eclipse.amalgam.tutorials.xtext.droid.Action;
import org.eclipse.amalgam.tutorials.xtext.droid.ColorPropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.ImageButton;
import org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ImageButtonImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ImageButtonImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ImageButtonImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ImageButtonImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageButtonImpl extends WidgetImpl implements ImageButton
{
  /**
   * The cached value of the '{@link #getSrc() <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrc()
   * @generated
   * @ordered
   */
  protected DrawableImageResourcePropertyValue src;

  /**
   * The cached value of the '{@link #getHint() <em>Hint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected StringPropertyValue hint;

  /**
   * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextColor()
   * @generated
   * @ordered
   */
  protected ColorPropertyValue textColor;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageButtonImpl()
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
    return DroidPackage.Literals.IMAGE_BUTTON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrawableImageResourcePropertyValue getSrc()
  {
    return src;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrc(DrawableImageResourcePropertyValue newSrc, NotificationChain msgs)
  {
    DrawableImageResourcePropertyValue oldSrc = src;
    src = newSrc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.IMAGE_BUTTON__SRC, oldSrc, newSrc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrc(DrawableImageResourcePropertyValue newSrc)
  {
    if (newSrc != src)
    {
      NotificationChain msgs = null;
      if (src != null)
        msgs = ((InternalEObject)src).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.IMAGE_BUTTON__SRC, null, msgs);
      if (newSrc != null)
        msgs = ((InternalEObject)newSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.IMAGE_BUTTON__SRC, null, msgs);
      msgs = basicSetSrc(newSrc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.IMAGE_BUTTON__SRC, newSrc, newSrc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringPropertyValue getHint()
  {
    return hint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHint(StringPropertyValue newHint, NotificationChain msgs)
  {
    StringPropertyValue oldHint = hint;
    hint = newHint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.IMAGE_BUTTON__HINT, oldHint, newHint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHint(StringPropertyValue newHint)
  {
    if (newHint != hint)
    {
      NotificationChain msgs = null;
      if (hint != null)
        msgs = ((InternalEObject)hint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.IMAGE_BUTTON__HINT, null, msgs);
      if (newHint != null)
        msgs = ((InternalEObject)newHint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.IMAGE_BUTTON__HINT, null, msgs);
      msgs = basicSetHint(newHint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.IMAGE_BUTTON__HINT, newHint, newHint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorPropertyValue getTextColor()
  {
    return textColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTextColor(ColorPropertyValue newTextColor, NotificationChain msgs)
  {
    ColorPropertyValue oldTextColor = textColor;
    textColor = newTextColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.IMAGE_BUTTON__TEXT_COLOR, oldTextColor, newTextColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextColor(ColorPropertyValue newTextColor)
  {
    if (newTextColor != textColor)
    {
      NotificationChain msgs = null;
      if (textColor != null)
        msgs = ((InternalEObject)textColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.IMAGE_BUTTON__TEXT_COLOR, null, msgs);
      if (newTextColor != null)
        msgs = ((InternalEObject)newTextColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.IMAGE_BUTTON__TEXT_COLOR, null, msgs);
      msgs = basicSetTextColor(newTextColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.IMAGE_BUTTON__TEXT_COLOR, newTextColor, newTextColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, DroidPackage.IMAGE_BUTTON__ACTIONS);
    }
    return actions;
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
      case DroidPackage.IMAGE_BUTTON__SRC:
        return basicSetSrc(null, msgs);
      case DroidPackage.IMAGE_BUTTON__HINT:
        return basicSetHint(null, msgs);
      case DroidPackage.IMAGE_BUTTON__TEXT_COLOR:
        return basicSetTextColor(null, msgs);
      case DroidPackage.IMAGE_BUTTON__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
      case DroidPackage.IMAGE_BUTTON__SRC:
        return getSrc();
      case DroidPackage.IMAGE_BUTTON__HINT:
        return getHint();
      case DroidPackage.IMAGE_BUTTON__TEXT_COLOR:
        return getTextColor();
      case DroidPackage.IMAGE_BUTTON__ACTIONS:
        return getActions();
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
      case DroidPackage.IMAGE_BUTTON__SRC:
        setSrc((DrawableImageResourcePropertyValue)newValue);
        return;
      case DroidPackage.IMAGE_BUTTON__HINT:
        setHint((StringPropertyValue)newValue);
        return;
      case DroidPackage.IMAGE_BUTTON__TEXT_COLOR:
        setTextColor((ColorPropertyValue)newValue);
        return;
      case DroidPackage.IMAGE_BUTTON__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
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
      case DroidPackage.IMAGE_BUTTON__SRC:
        setSrc((DrawableImageResourcePropertyValue)null);
        return;
      case DroidPackage.IMAGE_BUTTON__HINT:
        setHint((StringPropertyValue)null);
        return;
      case DroidPackage.IMAGE_BUTTON__TEXT_COLOR:
        setTextColor((ColorPropertyValue)null);
        return;
      case DroidPackage.IMAGE_BUTTON__ACTIONS:
        getActions().clear();
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
      case DroidPackage.IMAGE_BUTTON__SRC:
        return src != null;
      case DroidPackage.IMAGE_BUTTON__HINT:
        return hint != null;
      case DroidPackage.IMAGE_BUTTON__TEXT_COLOR:
        return textColor != null;
      case DroidPackage.IMAGE_BUTTON__ACTIONS:
        return actions != null && !actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ImageButtonImpl
