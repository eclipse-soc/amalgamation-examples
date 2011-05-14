/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import java.util.Collection;

import org.eclipse.amalgam.tutorials.xtext.droid.Action;
import org.eclipse.amalgam.tutorials.xtext.droid.ColorPropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.TextView;

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
 * An implementation of the model object '<em><b>Text View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TextViewImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TextViewImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TextViewImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TextViewImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextViewImpl extends WidgetImpl implements TextView
{
  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected StringPropertyValue text;

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
  protected TextViewImpl()
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
    return DroidPackage.Literals.TEXT_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringPropertyValue getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(StringPropertyValue newText, NotificationChain msgs)
  {
    StringPropertyValue oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.TEXT_VIEW__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(StringPropertyValue newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TEXT_VIEW__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TEXT_VIEW__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TEXT_VIEW__TEXT, newText, newText));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.TEXT_VIEW__HINT, oldHint, newHint);
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
        msgs = ((InternalEObject)hint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TEXT_VIEW__HINT, null, msgs);
      if (newHint != null)
        msgs = ((InternalEObject)newHint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TEXT_VIEW__HINT, null, msgs);
      msgs = basicSetHint(newHint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TEXT_VIEW__HINT, newHint, newHint));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.TEXT_VIEW__TEXT_COLOR, oldTextColor, newTextColor);
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
        msgs = ((InternalEObject)textColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TEXT_VIEW__TEXT_COLOR, null, msgs);
      if (newTextColor != null)
        msgs = ((InternalEObject)newTextColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TEXT_VIEW__TEXT_COLOR, null, msgs);
      msgs = basicSetTextColor(newTextColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TEXT_VIEW__TEXT_COLOR, newTextColor, newTextColor));
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
      actions = new EObjectContainmentEList<Action>(Action.class, this, DroidPackage.TEXT_VIEW__ACTIONS);
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
      case DroidPackage.TEXT_VIEW__TEXT:
        return basicSetText(null, msgs);
      case DroidPackage.TEXT_VIEW__HINT:
        return basicSetHint(null, msgs);
      case DroidPackage.TEXT_VIEW__TEXT_COLOR:
        return basicSetTextColor(null, msgs);
      case DroidPackage.TEXT_VIEW__ACTIONS:
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
      case DroidPackage.TEXT_VIEW__TEXT:
        return getText();
      case DroidPackage.TEXT_VIEW__HINT:
        return getHint();
      case DroidPackage.TEXT_VIEW__TEXT_COLOR:
        return getTextColor();
      case DroidPackage.TEXT_VIEW__ACTIONS:
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
      case DroidPackage.TEXT_VIEW__TEXT:
        setText((StringPropertyValue)newValue);
        return;
      case DroidPackage.TEXT_VIEW__HINT:
        setHint((StringPropertyValue)newValue);
        return;
      case DroidPackage.TEXT_VIEW__TEXT_COLOR:
        setTextColor((ColorPropertyValue)newValue);
        return;
      case DroidPackage.TEXT_VIEW__ACTIONS:
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
      case DroidPackage.TEXT_VIEW__TEXT:
        setText((StringPropertyValue)null);
        return;
      case DroidPackage.TEXT_VIEW__HINT:
        setHint((StringPropertyValue)null);
        return;
      case DroidPackage.TEXT_VIEW__TEXT_COLOR:
        setTextColor((ColorPropertyValue)null);
        return;
      case DroidPackage.TEXT_VIEW__ACTIONS:
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
      case DroidPackage.TEXT_VIEW__TEXT:
        return text != null;
      case DroidPackage.TEXT_VIEW__HINT:
        return hint != null;
      case DroidPackage.TEXT_VIEW__TEXT_COLOR:
        return textColor != null;
      case DroidPackage.TEXT_VIEW__ACTIONS:
        return actions != null && !actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TextViewImpl
