/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.Activity;
import org.eclipse.amalgam.tutorials.xtext.droid.AnyDrawableVA;
import org.eclipse.amalgam.tutorials.xtext.droid.Button;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.StringVA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ButtonImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ButtonImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ButtonImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ButtonImpl#getHint <em>Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonImpl extends WidgetImpl implements Button
{
  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected StringVA text;

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
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Activity target;

  /**
   * The cached value of the '{@link #getHint() <em>Hint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected StringVA hint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ButtonImpl()
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
    return DroidPackage.eINSTANCE.getButton();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringVA getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(StringVA newText, NotificationChain msgs)
  {
    StringVA oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.BUTTON__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(StringVA newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.BUTTON__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.BUTTON__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.BUTTON__TEXT, newText, newText));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.BUTTON__SRC, oldSrc, newSrc);
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
        msgs = ((InternalEObject)src).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.BUTTON__SRC, null, msgs);
      if (newSrc != null)
        msgs = ((InternalEObject)newSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.BUTTON__SRC, null, msgs);
      msgs = basicSetSrc(newSrc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.BUTTON__SRC, newSrc, newSrc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Activity)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.BUTTON__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Activity newTarget)
  {
    Activity oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.BUTTON__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringVA getHint()
  {
    return hint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHint(StringVA newHint, NotificationChain msgs)
  {
    StringVA oldHint = hint;
    hint = newHint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.BUTTON__HINT, oldHint, newHint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHint(StringVA newHint)
  {
    if (newHint != hint)
    {
      NotificationChain msgs = null;
      if (hint != null)
        msgs = ((InternalEObject)hint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.BUTTON__HINT, null, msgs);
      if (newHint != null)
        msgs = ((InternalEObject)newHint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.BUTTON__HINT, null, msgs);
      msgs = basicSetHint(newHint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.BUTTON__HINT, newHint, newHint));
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
      case DroidPackage.BUTTON__TEXT:
        return basicSetText(null, msgs);
      case DroidPackage.BUTTON__SRC:
        return basicSetSrc(null, msgs);
      case DroidPackage.BUTTON__HINT:
        return basicSetHint(null, msgs);
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
      case DroidPackage.BUTTON__TEXT:
        return getText();
      case DroidPackage.BUTTON__SRC:
        return getSrc();
      case DroidPackage.BUTTON__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case DroidPackage.BUTTON__HINT:
        return getHint();
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
      case DroidPackage.BUTTON__TEXT:
        setText((StringVA)newValue);
        return;
      case DroidPackage.BUTTON__SRC:
        setSrc((AnyDrawableVA)newValue);
        return;
      case DroidPackage.BUTTON__TARGET:
        setTarget((Activity)newValue);
        return;
      case DroidPackage.BUTTON__HINT:
        setHint((StringVA)newValue);
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
      case DroidPackage.BUTTON__TEXT:
        setText((StringVA)null);
        return;
      case DroidPackage.BUTTON__SRC:
        setSrc((AnyDrawableVA)null);
        return;
      case DroidPackage.BUTTON__TARGET:
        setTarget((Activity)null);
        return;
      case DroidPackage.BUTTON__HINT:
        setHint((StringVA)null);
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
      case DroidPackage.BUTTON__TEXT:
        return text != null;
      case DroidPackage.BUTTON__SRC:
        return src != null;
      case DroidPackage.BUTTON__TARGET:
        return target != null;
      case DroidPackage.BUTTON__HINT:
        return hint != null;
    }
    return super.eIsSet(featureID);
  }

} //ButtonImpl
