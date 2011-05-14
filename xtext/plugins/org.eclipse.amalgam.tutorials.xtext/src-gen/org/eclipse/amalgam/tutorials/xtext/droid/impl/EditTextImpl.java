/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.ColorPropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.EditText;
import org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.EditTextImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.EditTextImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.EditTextImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.EditTextImpl#getEditable <em>Editable</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.EditTextImpl#getNumeric <em>Numeric</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.EditTextImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.EditTextImpl#getPhoneNumber <em>Phone Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditTextImpl extends WidgetImpl implements EditText
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
   * The cached value of the '{@link #getEditable() <em>Editable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditable()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue editable;

  /**
   * The cached value of the '{@link #getNumeric() <em>Numeric</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumeric()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue numeric;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue password;

  /**
   * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhoneNumber()
   * @generated
   * @ordered
   */
  protected BooleanPropertyValue phoneNumber;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditTextImpl()
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
    return DroidPackage.Literals.EDIT_TEXT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__TEXT, oldText, newText);
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
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__TEXT, newText, newText));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__HINT, oldHint, newHint);
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
        msgs = ((InternalEObject)hint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__HINT, null, msgs);
      if (newHint != null)
        msgs = ((InternalEObject)newHint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__HINT, null, msgs);
      msgs = basicSetHint(newHint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__HINT, newHint, newHint));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__TEXT_COLOR, oldTextColor, newTextColor);
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
        msgs = ((InternalEObject)textColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__TEXT_COLOR, null, msgs);
      if (newTextColor != null)
        msgs = ((InternalEObject)newTextColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__TEXT_COLOR, null, msgs);
      msgs = basicSetTextColor(newTextColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__TEXT_COLOR, newTextColor, newTextColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getEditable()
  {
    return editable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEditable(BooleanPropertyValue newEditable, NotificationChain msgs)
  {
    BooleanPropertyValue oldEditable = editable;
    editable = newEditable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__EDITABLE, oldEditable, newEditable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEditable(BooleanPropertyValue newEditable)
  {
    if (newEditable != editable)
    {
      NotificationChain msgs = null;
      if (editable != null)
        msgs = ((InternalEObject)editable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__EDITABLE, null, msgs);
      if (newEditable != null)
        msgs = ((InternalEObject)newEditable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__EDITABLE, null, msgs);
      msgs = basicSetEditable(newEditable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__EDITABLE, newEditable, newEditable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getNumeric()
  {
    return numeric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumeric(BooleanPropertyValue newNumeric, NotificationChain msgs)
  {
    BooleanPropertyValue oldNumeric = numeric;
    numeric = newNumeric;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__NUMERIC, oldNumeric, newNumeric);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumeric(BooleanPropertyValue newNumeric)
  {
    if (newNumeric != numeric)
    {
      NotificationChain msgs = null;
      if (numeric != null)
        msgs = ((InternalEObject)numeric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__NUMERIC, null, msgs);
      if (newNumeric != null)
        msgs = ((InternalEObject)newNumeric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__NUMERIC, null, msgs);
      msgs = basicSetNumeric(newNumeric, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__NUMERIC, newNumeric, newNumeric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPassword(BooleanPropertyValue newPassword, NotificationChain msgs)
  {
    BooleanPropertyValue oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__PASSWORD, oldPassword, newPassword);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassword(BooleanPropertyValue newPassword)
  {
    if (newPassword != password)
    {
      NotificationChain msgs = null;
      if (password != null)
        msgs = ((InternalEObject)password).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__PASSWORD, null, msgs);
      if (newPassword != null)
        msgs = ((InternalEObject)newPassword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__PASSWORD, null, msgs);
      msgs = basicSetPassword(newPassword, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__PASSWORD, newPassword, newPassword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue getPhoneNumber()
  {
    return phoneNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPhoneNumber(BooleanPropertyValue newPhoneNumber, NotificationChain msgs)
  {
    BooleanPropertyValue oldPhoneNumber = phoneNumber;
    phoneNumber = newPhoneNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__PHONE_NUMBER, oldPhoneNumber, newPhoneNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPhoneNumber(BooleanPropertyValue newPhoneNumber)
  {
    if (newPhoneNumber != phoneNumber)
    {
      NotificationChain msgs = null;
      if (phoneNumber != null)
        msgs = ((InternalEObject)phoneNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__PHONE_NUMBER, null, msgs);
      if (newPhoneNumber != null)
        msgs = ((InternalEObject)newPhoneNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__PHONE_NUMBER, null, msgs);
      msgs = basicSetPhoneNumber(newPhoneNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__PHONE_NUMBER, newPhoneNumber, newPhoneNumber));
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
      case DroidPackage.EDIT_TEXT__TEXT:
        return basicSetText(null, msgs);
      case DroidPackage.EDIT_TEXT__HINT:
        return basicSetHint(null, msgs);
      case DroidPackage.EDIT_TEXT__TEXT_COLOR:
        return basicSetTextColor(null, msgs);
      case DroidPackage.EDIT_TEXT__EDITABLE:
        return basicSetEditable(null, msgs);
      case DroidPackage.EDIT_TEXT__NUMERIC:
        return basicSetNumeric(null, msgs);
      case DroidPackage.EDIT_TEXT__PASSWORD:
        return basicSetPassword(null, msgs);
      case DroidPackage.EDIT_TEXT__PHONE_NUMBER:
        return basicSetPhoneNumber(null, msgs);
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
      case DroidPackage.EDIT_TEXT__TEXT:
        return getText();
      case DroidPackage.EDIT_TEXT__HINT:
        return getHint();
      case DroidPackage.EDIT_TEXT__TEXT_COLOR:
        return getTextColor();
      case DroidPackage.EDIT_TEXT__EDITABLE:
        return getEditable();
      case DroidPackage.EDIT_TEXT__NUMERIC:
        return getNumeric();
      case DroidPackage.EDIT_TEXT__PASSWORD:
        return getPassword();
      case DroidPackage.EDIT_TEXT__PHONE_NUMBER:
        return getPhoneNumber();
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
      case DroidPackage.EDIT_TEXT__TEXT:
        setText((StringPropertyValue)newValue);
        return;
      case DroidPackage.EDIT_TEXT__HINT:
        setHint((StringPropertyValue)newValue);
        return;
      case DroidPackage.EDIT_TEXT__TEXT_COLOR:
        setTextColor((ColorPropertyValue)newValue);
        return;
      case DroidPackage.EDIT_TEXT__EDITABLE:
        setEditable((BooleanPropertyValue)newValue);
        return;
      case DroidPackage.EDIT_TEXT__NUMERIC:
        setNumeric((BooleanPropertyValue)newValue);
        return;
      case DroidPackage.EDIT_TEXT__PASSWORD:
        setPassword((BooleanPropertyValue)newValue);
        return;
      case DroidPackage.EDIT_TEXT__PHONE_NUMBER:
        setPhoneNumber((BooleanPropertyValue)newValue);
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
      case DroidPackage.EDIT_TEXT__TEXT:
        setText((StringPropertyValue)null);
        return;
      case DroidPackage.EDIT_TEXT__HINT:
        setHint((StringPropertyValue)null);
        return;
      case DroidPackage.EDIT_TEXT__TEXT_COLOR:
        setTextColor((ColorPropertyValue)null);
        return;
      case DroidPackage.EDIT_TEXT__EDITABLE:
        setEditable((BooleanPropertyValue)null);
        return;
      case DroidPackage.EDIT_TEXT__NUMERIC:
        setNumeric((BooleanPropertyValue)null);
        return;
      case DroidPackage.EDIT_TEXT__PASSWORD:
        setPassword((BooleanPropertyValue)null);
        return;
      case DroidPackage.EDIT_TEXT__PHONE_NUMBER:
        setPhoneNumber((BooleanPropertyValue)null);
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
      case DroidPackage.EDIT_TEXT__TEXT:
        return text != null;
      case DroidPackage.EDIT_TEXT__HINT:
        return hint != null;
      case DroidPackage.EDIT_TEXT__TEXT_COLOR:
        return textColor != null;
      case DroidPackage.EDIT_TEXT__EDITABLE:
        return editable != null;
      case DroidPackage.EDIT_TEXT__NUMERIC:
        return numeric != null;
      case DroidPackage.EDIT_TEXT__PASSWORD:
        return password != null;
      case DroidPackage.EDIT_TEXT__PHONE_NUMBER:
        return phoneNumber != null;
    }
    return super.eIsSet(featureID);
  }

} //EditTextImpl
