/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.impl;

import java.util.Collection;

import org.eclipse.amalgam.tutorials.emf.droid.AutoLinkKind;
import org.eclipse.amalgam.tutorials.emf.droid.BooleanVA;
import org.eclipse.amalgam.tutorials.emf.droid.CapitalizeKind;
import org.eclipse.amalgam.tutorials.emf.droid.ColorVA;
import org.eclipse.amalgam.tutorials.emf.droid.DimensionVA;
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.EditText;
import org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind;
import org.eclipse.amalgam.tutorials.emf.droid.StringVA;
import org.eclipse.amalgam.tutorials.emf.droid.TextStyleKind;
import org.eclipse.amalgam.tutorials.emf.droid.TypefaceKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getFadeScrollBars <em>Fade Scroll Bars</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getIsScrollContainer <em>Is Scroll Container</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getAutoLink <em>Auto Link</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getAutoText <em>Auto Text</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getCapitalize <em>Capitalize</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getDigits <em>Digits</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getEditable <em>Editable</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getGravity <em>Gravity</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getNumeric <em>Numeric</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getSingleLine <em>Single Line</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getTypeface <em>Typeface</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getTextSize <em>Text Size</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl#getTextStyle <em>Text Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditTextImpl extends WidgetImpl implements EditText {
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
	 * The default value of the '{@link #getAutoLink() <em>Auto Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoLink()
	 * @generated
	 * @ordered
	 */
	protected static final AutoLinkKind AUTO_LINK_EDEFAULT = AutoLinkKind.NONE;

	/**
	 * The cached value of the '{@link #getAutoLink() <em>Auto Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoLink()
	 * @generated
	 * @ordered
	 */
	protected AutoLinkKind autoLink = AUTO_LINK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAutoText() <em>Auto Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoText()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA autoText;

	/**
	 * The default value of the '{@link #getCapitalize() <em>Capitalize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapitalize()
	 * @generated
	 * @ordered
	 */
	protected static final CapitalizeKind CAPITALIZE_EDEFAULT = CapitalizeKind.NONE;

	/**
	 * The cached value of the '{@link #getCapitalize() <em>Capitalize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapitalize()
	 * @generated
	 * @ordered
	 */
	protected CapitalizeKind capitalize = CAPITALIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDigits() <em>Digits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigits()
	 * @generated
	 * @ordered
	 */
	protected StringVA digits;

	/**
	 * The cached value of the '{@link #getEditable() <em>Editable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditable()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA editable;

	/**
	 * The default value of the '{@link #getGravity() <em>Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravity()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutGravityKind GRAVITY_EDEFAULT = LayoutGravityKind.TOP;

	/**
	 * The cached value of the '{@link #getGravity() <em>Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravity()
	 * @generated
	 * @ordered
	 */
	protected LayoutGravityKind gravity = GRAVITY_EDEFAULT;

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
	 * The cached value of the '{@link #getNumeric() <em>Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeric()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA numeric;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA password;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA phoneNumber;

	/**
	 * The cached value of the '{@link #getSingleLine() <em>Single Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleLine()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA singleLine;

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected ColorVA textColor;

	/**
	 * The default value of the '{@link #getTypeface() <em>Typeface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeface()
	 * @generated
	 * @ordered
	 */
	protected static final TypefaceKind TYPEFACE_EDEFAULT = TypefaceKind.NORMAL;

	/**
	 * The cached value of the '{@link #getTypeface() <em>Typeface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeface()
	 * @generated
	 * @ordered
	 */
	protected TypefaceKind typeface = TYPEFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextSize() <em>Text Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSize()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA textSize;

	/**
	 * The cached value of the '{@link #getTextStyle() <em>Text Style</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<TextStyleKind> textStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.eINSTANCE.getEditText();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVA getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(StringVA newText, NotificationChain msgs) {
		StringVA oldText = text;
		text = newText;
		if (eNotificationRequired()) {
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
	public void setText(StringVA newText) {
		if (newText != text) {
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
	public BooleanVA getFadeScrollBars() {
		return fadeScrollBars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFadeScrollBars(BooleanVA newFadeScrollBars, NotificationChain msgs) {
		BooleanVA oldFadeScrollBars = fadeScrollBars;
		fadeScrollBars = newFadeScrollBars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__FADE_SCROLL_BARS, oldFadeScrollBars, newFadeScrollBars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFadeScrollBars(BooleanVA newFadeScrollBars) {
		if (newFadeScrollBars != fadeScrollBars) {
			NotificationChain msgs = null;
			if (fadeScrollBars != null)
				msgs = ((InternalEObject)fadeScrollBars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__FADE_SCROLL_BARS, null, msgs);
			if (newFadeScrollBars != null)
				msgs = ((InternalEObject)newFadeScrollBars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__FADE_SCROLL_BARS, null, msgs);
			msgs = basicSetFadeScrollBars(newFadeScrollBars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__FADE_SCROLL_BARS, newFadeScrollBars, newFadeScrollBars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getIsScrollContainer() {
		return isScrollContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsScrollContainer(BooleanVA newIsScrollContainer, NotificationChain msgs) {
		BooleanVA oldIsScrollContainer = isScrollContainer;
		isScrollContainer = newIsScrollContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__IS_SCROLL_CONTAINER, oldIsScrollContainer, newIsScrollContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsScrollContainer(BooleanVA newIsScrollContainer) {
		if (newIsScrollContainer != isScrollContainer) {
			NotificationChain msgs = null;
			if (isScrollContainer != null)
				msgs = ((InternalEObject)isScrollContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__IS_SCROLL_CONTAINER, null, msgs);
			if (newIsScrollContainer != null)
				msgs = ((InternalEObject)newIsScrollContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__IS_SCROLL_CONTAINER, null, msgs);
			msgs = basicSetIsScrollContainer(newIsScrollContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__IS_SCROLL_CONTAINER, newIsScrollContainer, newIsScrollContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoLinkKind getAutoLink() {
		return autoLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoLink(AutoLinkKind newAutoLink) {
		AutoLinkKind oldAutoLink = autoLink;
		autoLink = newAutoLink == null ? AUTO_LINK_EDEFAULT : newAutoLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__AUTO_LINK, oldAutoLink, autoLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getAutoText() {
		return autoText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoText(BooleanVA newAutoText, NotificationChain msgs) {
		BooleanVA oldAutoText = autoText;
		autoText = newAutoText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__AUTO_TEXT, oldAutoText, newAutoText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoText(BooleanVA newAutoText) {
		if (newAutoText != autoText) {
			NotificationChain msgs = null;
			if (autoText != null)
				msgs = ((InternalEObject)autoText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__AUTO_TEXT, null, msgs);
			if (newAutoText != null)
				msgs = ((InternalEObject)newAutoText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__AUTO_TEXT, null, msgs);
			msgs = basicSetAutoText(newAutoText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__AUTO_TEXT, newAutoText, newAutoText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapitalizeKind getCapitalize() {
		return capitalize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapitalize(CapitalizeKind newCapitalize) {
		CapitalizeKind oldCapitalize = capitalize;
		capitalize = newCapitalize == null ? CAPITALIZE_EDEFAULT : newCapitalize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__CAPITALIZE, oldCapitalize, capitalize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVA getDigits() {
		return digits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDigits(StringVA newDigits, NotificationChain msgs) {
		StringVA oldDigits = digits;
		digits = newDigits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__DIGITS, oldDigits, newDigits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigits(StringVA newDigits) {
		if (newDigits != digits) {
			NotificationChain msgs = null;
			if (digits != null)
				msgs = ((InternalEObject)digits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__DIGITS, null, msgs);
			if (newDigits != null)
				msgs = ((InternalEObject)newDigits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__DIGITS, null, msgs);
			msgs = basicSetDigits(newDigits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__DIGITS, newDigits, newDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditable(BooleanVA newEditable, NotificationChain msgs) {
		BooleanVA oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired()) {
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
	public void setEditable(BooleanVA newEditable) {
		if (newEditable != editable) {
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
	public LayoutGravityKind getGravity() {
		return gravity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGravity(LayoutGravityKind newGravity) {
		LayoutGravityKind oldGravity = gravity;
		gravity = newGravity == null ? GRAVITY_EDEFAULT : newGravity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__GRAVITY, oldGravity, gravity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVA getHint() {
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHint(StringVA newHint, NotificationChain msgs) {
		StringVA oldHint = hint;
		hint = newHint;
		if (eNotificationRequired()) {
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
	public void setHint(StringVA newHint) {
		if (newHint != hint) {
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
	public BooleanVA getNumeric() {
		return numeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumeric(BooleanVA newNumeric, NotificationChain msgs) {
		BooleanVA oldNumeric = numeric;
		numeric = newNumeric;
		if (eNotificationRequired()) {
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
	public void setNumeric(BooleanVA newNumeric) {
		if (newNumeric != numeric) {
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
	public BooleanVA getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassword(BooleanVA newPassword, NotificationChain msgs) {
		BooleanVA oldPassword = password;
		password = newPassword;
		if (eNotificationRequired()) {
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
	public void setPassword(BooleanVA newPassword) {
		if (newPassword != password) {
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
	public BooleanVA getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhoneNumber(BooleanVA newPhoneNumber, NotificationChain msgs) {
		BooleanVA oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired()) {
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
	public void setPhoneNumber(BooleanVA newPhoneNumber) {
		if (newPhoneNumber != phoneNumber) {
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
	public BooleanVA getSingleLine() {
		return singleLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleLine(BooleanVA newSingleLine, NotificationChain msgs) {
		BooleanVA oldSingleLine = singleLine;
		singleLine = newSingleLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__SINGLE_LINE, oldSingleLine, newSingleLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleLine(BooleanVA newSingleLine) {
		if (newSingleLine != singleLine) {
			NotificationChain msgs = null;
			if (singleLine != null)
				msgs = ((InternalEObject)singleLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__SINGLE_LINE, null, msgs);
			if (newSingleLine != null)
				msgs = ((InternalEObject)newSingleLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__SINGLE_LINE, null, msgs);
			msgs = basicSetSingleLine(newSingleLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__SINGLE_LINE, newSingleLine, newSingleLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorVA getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextColor(ColorVA newTextColor, NotificationChain msgs) {
		ColorVA oldTextColor = textColor;
		textColor = newTextColor;
		if (eNotificationRequired()) {
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
	public void setTextColor(ColorVA newTextColor) {
		if (newTextColor != textColor) {
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
	public TypefaceKind getTypeface() {
		return typeface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeface(TypefaceKind newTypeface) {
		TypefaceKind oldTypeface = typeface;
		typeface = newTypeface == null ? TYPEFACE_EDEFAULT : newTypeface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__TYPEFACE, oldTypeface, typeface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getTextSize() {
		return textSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextSize(DimensionVA newTextSize, NotificationChain msgs) {
		DimensionVA oldTextSize = textSize;
		textSize = newTextSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__TEXT_SIZE, oldTextSize, newTextSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextSize(DimensionVA newTextSize) {
		if (newTextSize != textSize) {
			NotificationChain msgs = null;
			if (textSize != null)
				msgs = ((InternalEObject)textSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__TEXT_SIZE, null, msgs);
			if (newTextSize != null)
				msgs = ((InternalEObject)newTextSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.EDIT_TEXT__TEXT_SIZE, null, msgs);
			msgs = basicSetTextSize(newTextSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.EDIT_TEXT__TEXT_SIZE, newTextSize, newTextSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextStyleKind> getTextStyle() {
		if (textStyle == null) {
			textStyle = new EDataTypeEList<TextStyleKind>(TextStyleKind.class, this, DroidPackage.EDIT_TEXT__TEXT_STYLE);
		}
		return textStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DroidPackage.EDIT_TEXT__TEXT:
				return basicSetText(null, msgs);
			case DroidPackage.EDIT_TEXT__FADE_SCROLL_BARS:
				return basicSetFadeScrollBars(null, msgs);
			case DroidPackage.EDIT_TEXT__IS_SCROLL_CONTAINER:
				return basicSetIsScrollContainer(null, msgs);
			case DroidPackage.EDIT_TEXT__AUTO_TEXT:
				return basicSetAutoText(null, msgs);
			case DroidPackage.EDIT_TEXT__DIGITS:
				return basicSetDigits(null, msgs);
			case DroidPackage.EDIT_TEXT__EDITABLE:
				return basicSetEditable(null, msgs);
			case DroidPackage.EDIT_TEXT__HINT:
				return basicSetHint(null, msgs);
			case DroidPackage.EDIT_TEXT__NUMERIC:
				return basicSetNumeric(null, msgs);
			case DroidPackage.EDIT_TEXT__PASSWORD:
				return basicSetPassword(null, msgs);
			case DroidPackage.EDIT_TEXT__PHONE_NUMBER:
				return basicSetPhoneNumber(null, msgs);
			case DroidPackage.EDIT_TEXT__SINGLE_LINE:
				return basicSetSingleLine(null, msgs);
			case DroidPackage.EDIT_TEXT__TEXT_COLOR:
				return basicSetTextColor(null, msgs);
			case DroidPackage.EDIT_TEXT__TEXT_SIZE:
				return basicSetTextSize(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DroidPackage.EDIT_TEXT__TEXT:
				return getText();
			case DroidPackage.EDIT_TEXT__FADE_SCROLL_BARS:
				return getFadeScrollBars();
			case DroidPackage.EDIT_TEXT__IS_SCROLL_CONTAINER:
				return getIsScrollContainer();
			case DroidPackage.EDIT_TEXT__AUTO_LINK:
				return getAutoLink();
			case DroidPackage.EDIT_TEXT__AUTO_TEXT:
				return getAutoText();
			case DroidPackage.EDIT_TEXT__CAPITALIZE:
				return getCapitalize();
			case DroidPackage.EDIT_TEXT__DIGITS:
				return getDigits();
			case DroidPackage.EDIT_TEXT__EDITABLE:
				return getEditable();
			case DroidPackage.EDIT_TEXT__GRAVITY:
				return getGravity();
			case DroidPackage.EDIT_TEXT__HINT:
				return getHint();
			case DroidPackage.EDIT_TEXT__NUMERIC:
				return getNumeric();
			case DroidPackage.EDIT_TEXT__PASSWORD:
				return getPassword();
			case DroidPackage.EDIT_TEXT__PHONE_NUMBER:
				return getPhoneNumber();
			case DroidPackage.EDIT_TEXT__SINGLE_LINE:
				return getSingleLine();
			case DroidPackage.EDIT_TEXT__TEXT_COLOR:
				return getTextColor();
			case DroidPackage.EDIT_TEXT__TYPEFACE:
				return getTypeface();
			case DroidPackage.EDIT_TEXT__TEXT_SIZE:
				return getTextSize();
			case DroidPackage.EDIT_TEXT__TEXT_STYLE:
				return getTextStyle();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DroidPackage.EDIT_TEXT__TEXT:
				setText((StringVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__FADE_SCROLL_BARS:
				setFadeScrollBars((BooleanVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__IS_SCROLL_CONTAINER:
				setIsScrollContainer((BooleanVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__AUTO_LINK:
				setAutoLink((AutoLinkKind)newValue);
				return;
			case DroidPackage.EDIT_TEXT__AUTO_TEXT:
				setAutoText((BooleanVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__CAPITALIZE:
				setCapitalize((CapitalizeKind)newValue);
				return;
			case DroidPackage.EDIT_TEXT__DIGITS:
				setDigits((StringVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__EDITABLE:
				setEditable((BooleanVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__GRAVITY:
				setGravity((LayoutGravityKind)newValue);
				return;
			case DroidPackage.EDIT_TEXT__HINT:
				setHint((StringVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__NUMERIC:
				setNumeric((BooleanVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__PASSWORD:
				setPassword((BooleanVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__PHONE_NUMBER:
				setPhoneNumber((BooleanVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__SINGLE_LINE:
				setSingleLine((BooleanVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__TEXT_COLOR:
				setTextColor((ColorVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__TYPEFACE:
				setTypeface((TypefaceKind)newValue);
				return;
			case DroidPackage.EDIT_TEXT__TEXT_SIZE:
				setTextSize((DimensionVA)newValue);
				return;
			case DroidPackage.EDIT_TEXT__TEXT_STYLE:
				getTextStyle().clear();
				getTextStyle().addAll((Collection<? extends TextStyleKind>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DroidPackage.EDIT_TEXT__TEXT:
				setText((StringVA)null);
				return;
			case DroidPackage.EDIT_TEXT__FADE_SCROLL_BARS:
				setFadeScrollBars((BooleanVA)null);
				return;
			case DroidPackage.EDIT_TEXT__IS_SCROLL_CONTAINER:
				setIsScrollContainer((BooleanVA)null);
				return;
			case DroidPackage.EDIT_TEXT__AUTO_LINK:
				setAutoLink(AUTO_LINK_EDEFAULT);
				return;
			case DroidPackage.EDIT_TEXT__AUTO_TEXT:
				setAutoText((BooleanVA)null);
				return;
			case DroidPackage.EDIT_TEXT__CAPITALIZE:
				setCapitalize(CAPITALIZE_EDEFAULT);
				return;
			case DroidPackage.EDIT_TEXT__DIGITS:
				setDigits((StringVA)null);
				return;
			case DroidPackage.EDIT_TEXT__EDITABLE:
				setEditable((BooleanVA)null);
				return;
			case DroidPackage.EDIT_TEXT__GRAVITY:
				setGravity(GRAVITY_EDEFAULT);
				return;
			case DroidPackage.EDIT_TEXT__HINT:
				setHint((StringVA)null);
				return;
			case DroidPackage.EDIT_TEXT__NUMERIC:
				setNumeric((BooleanVA)null);
				return;
			case DroidPackage.EDIT_TEXT__PASSWORD:
				setPassword((BooleanVA)null);
				return;
			case DroidPackage.EDIT_TEXT__PHONE_NUMBER:
				setPhoneNumber((BooleanVA)null);
				return;
			case DroidPackage.EDIT_TEXT__SINGLE_LINE:
				setSingleLine((BooleanVA)null);
				return;
			case DroidPackage.EDIT_TEXT__TEXT_COLOR:
				setTextColor((ColorVA)null);
				return;
			case DroidPackage.EDIT_TEXT__TYPEFACE:
				setTypeface(TYPEFACE_EDEFAULT);
				return;
			case DroidPackage.EDIT_TEXT__TEXT_SIZE:
				setTextSize((DimensionVA)null);
				return;
			case DroidPackage.EDIT_TEXT__TEXT_STYLE:
				getTextStyle().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DroidPackage.EDIT_TEXT__TEXT:
				return text != null;
			case DroidPackage.EDIT_TEXT__FADE_SCROLL_BARS:
				return fadeScrollBars != null;
			case DroidPackage.EDIT_TEXT__IS_SCROLL_CONTAINER:
				return isScrollContainer != null;
			case DroidPackage.EDIT_TEXT__AUTO_LINK:
				return autoLink != AUTO_LINK_EDEFAULT;
			case DroidPackage.EDIT_TEXT__AUTO_TEXT:
				return autoText != null;
			case DroidPackage.EDIT_TEXT__CAPITALIZE:
				return capitalize != CAPITALIZE_EDEFAULT;
			case DroidPackage.EDIT_TEXT__DIGITS:
				return digits != null;
			case DroidPackage.EDIT_TEXT__EDITABLE:
				return editable != null;
			case DroidPackage.EDIT_TEXT__GRAVITY:
				return gravity != GRAVITY_EDEFAULT;
			case DroidPackage.EDIT_TEXT__HINT:
				return hint != null;
			case DroidPackage.EDIT_TEXT__NUMERIC:
				return numeric != null;
			case DroidPackage.EDIT_TEXT__PASSWORD:
				return password != null;
			case DroidPackage.EDIT_TEXT__PHONE_NUMBER:
				return phoneNumber != null;
			case DroidPackage.EDIT_TEXT__SINGLE_LINE:
				return singleLine != null;
			case DroidPackage.EDIT_TEXT__TEXT_COLOR:
				return textColor != null;
			case DroidPackage.EDIT_TEXT__TYPEFACE:
				return typeface != TYPEFACE_EDEFAULT;
			case DroidPackage.EDIT_TEXT__TEXT_SIZE:
				return textSize != null;
			case DroidPackage.EDIT_TEXT__TEXT_STYLE:
				return textStyle != null && !textStyle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (autoLink: ");
		result.append(autoLink);
		result.append(", capitalize: ");
		result.append(capitalize);
		result.append(", gravity: ");
		result.append(gravity);
		result.append(", typeface: ");
		result.append(typeface);
		result.append(", textStyle: ");
		result.append(textStyle);
		result.append(')');
		return result.toString();
	}

} //EditTextImpl
