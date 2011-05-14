/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.Spinner;
import org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.SpinnerImpl#getPrompt <em>Prompt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpinnerImpl extends WidgetImpl implements Spinner
{
  /**
   * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrompt()
   * @generated
   * @ordered
   */
  protected StringPropertyValue prompt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpinnerImpl()
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
    return DroidPackage.Literals.SPINNER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringPropertyValue getPrompt()
  {
    return prompt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrompt(StringPropertyValue newPrompt, NotificationChain msgs)
  {
    StringPropertyValue oldPrompt = prompt;
    prompt = newPrompt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.SPINNER__PROMPT, oldPrompt, newPrompt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrompt(StringPropertyValue newPrompt)
  {
    if (newPrompt != prompt)
    {
      NotificationChain msgs = null;
      if (prompt != null)
        msgs = ((InternalEObject)prompt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.SPINNER__PROMPT, null, msgs);
      if (newPrompt != null)
        msgs = ((InternalEObject)newPrompt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.SPINNER__PROMPT, null, msgs);
      msgs = basicSetPrompt(newPrompt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.SPINNER__PROMPT, newPrompt, newPrompt));
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
      case DroidPackage.SPINNER__PROMPT:
        return basicSetPrompt(null, msgs);
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
      case DroidPackage.SPINNER__PROMPT:
        return getPrompt();
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
      case DroidPackage.SPINNER__PROMPT:
        setPrompt((StringPropertyValue)newValue);
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
      case DroidPackage.SPINNER__PROMPT:
        setPrompt((StringPropertyValue)null);
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
      case DroidPackage.SPINNER__PROMPT:
        return prompt != null;
    }
    return super.eIsSet(featureID);
  }

} //SpinnerImpl
