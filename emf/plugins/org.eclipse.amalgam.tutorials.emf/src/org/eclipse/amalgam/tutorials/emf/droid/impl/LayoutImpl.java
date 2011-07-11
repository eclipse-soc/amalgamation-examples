/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.impl;

import org.eclipse.amalgam.tutorials.emf.droid.Action;
import org.eclipse.amalgam.tutorials.emf.droid.AnimationVA;
import org.eclipse.amalgam.tutorials.emf.droid.BooleanVA;
import org.eclipse.amalgam.tutorials.emf.droid.DimensionVA;
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.Layout;
import org.eclipse.amalgam.tutorials.emf.droid.LayoutVisibilityKind;
import org.eclipse.amalgam.tutorials.emf.droid.View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getNextFocusDown <em>Next Focus Down</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getNextFocusLeft <em>Next Focus Left</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getNextFocusRight <em>Next Focus Right</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getNextFocusUp <em>Next Focus Up</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getOnClick <em>On Click</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getPaddingBottom <em>Padding Bottom</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getPaddingLeft <em>Padding Left</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getPaddingRight <em>Padding Right</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getPaddingTop <em>Padding Top</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getScrollbars <em>Scrollbars</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl#getLayoutAnimation <em>Layout Animation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutImpl extends ViewImpl implements Layout {
	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final Float ALPHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected Float alpha = ALPHA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMinHeight() <em>Min Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA minHeight;

	/**
	 * The cached value of the '{@link #getMinWidth() <em>Min Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA minWidth;

	/**
	 * The cached value of the '{@link #getNextFocusDown() <em>Next Focus Down</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFocusDown()
	 * @generated
	 * @ordered
	 */
	protected View nextFocusDown;

	/**
	 * The cached value of the '{@link #getNextFocusLeft() <em>Next Focus Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFocusLeft()
	 * @generated
	 * @ordered
	 */
	protected View nextFocusLeft;

	/**
	 * The cached value of the '{@link #getNextFocusRight() <em>Next Focus Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFocusRight()
	 * @generated
	 * @ordered
	 */
	protected View nextFocusRight;

	/**
	 * The cached value of the '{@link #getNextFocusUp() <em>Next Focus Up</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFocusUp()
	 * @generated
	 * @ordered
	 */
	protected View nextFocusUp;

	/**
	 * The cached value of the '{@link #getOnClick() <em>On Click</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnClick()
	 * @generated
	 * @ordered
	 */
	protected Action onClick;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA padding;

	/**
	 * The cached value of the '{@link #getPaddingBottom() <em>Padding Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingBottom()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA paddingBottom;

	/**
	 * The cached value of the '{@link #getPaddingLeft() <em>Padding Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingLeft()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA paddingLeft;

	/**
	 * The cached value of the '{@link #getPaddingRight() <em>Padding Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingRight()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA paddingRight;

	/**
	 * The cached value of the '{@link #getPaddingTop() <em>Padding Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingTop()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA paddingTop;

	/**
	 * The cached value of the '{@link #getScrollbars() <em>Scrollbars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollbars()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA scrollbars;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutVisibilityKind VISIBILITY_EDEFAULT = LayoutVisibilityKind.VISIBLE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected LayoutVisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayoutAnimation() <em>Layout Animation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutAnimation()
	 * @generated
	 * @ordered
	 */
	protected AnimationVA layoutAnimation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.eINSTANCE.getLayout();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(Float newAlpha) {
		Float oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getMinHeight() {
		return minHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinHeight(DimensionVA newMinHeight, NotificationChain msgs) {
		DimensionVA oldMinHeight = minHeight;
		minHeight = newMinHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__MIN_HEIGHT, oldMinHeight, newMinHeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinHeight(DimensionVA newMinHeight) {
		if (newMinHeight != minHeight) {
			NotificationChain msgs = null;
			if (minHeight != null)
				msgs = ((InternalEObject)minHeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__MIN_HEIGHT, null, msgs);
			if (newMinHeight != null)
				msgs = ((InternalEObject)newMinHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__MIN_HEIGHT, null, msgs);
			msgs = basicSetMinHeight(newMinHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__MIN_HEIGHT, newMinHeight, newMinHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getMinWidth() {
		return minWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinWidth(DimensionVA newMinWidth, NotificationChain msgs) {
		DimensionVA oldMinWidth = minWidth;
		minWidth = newMinWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__MIN_WIDTH, oldMinWidth, newMinWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinWidth(DimensionVA newMinWidth) {
		if (newMinWidth != minWidth) {
			NotificationChain msgs = null;
			if (minWidth != null)
				msgs = ((InternalEObject)minWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__MIN_WIDTH, null, msgs);
			if (newMinWidth != null)
				msgs = ((InternalEObject)newMinWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__MIN_WIDTH, null, msgs);
			msgs = basicSetMinWidth(newMinWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__MIN_WIDTH, newMinWidth, newMinWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getNextFocusDown() {
		if (nextFocusDown != null && nextFocusDown.eIsProxy()) {
			InternalEObject oldNextFocusDown = (InternalEObject)nextFocusDown;
			nextFocusDown = (View)eResolveProxy(oldNextFocusDown);
			if (nextFocusDown != oldNextFocusDown) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT__NEXT_FOCUS_DOWN, oldNextFocusDown, nextFocusDown));
			}
		}
		return nextFocusDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetNextFocusDown() {
		return nextFocusDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextFocusDown(View newNextFocusDown) {
		View oldNextFocusDown = nextFocusDown;
		nextFocusDown = newNextFocusDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__NEXT_FOCUS_DOWN, oldNextFocusDown, nextFocusDown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getNextFocusLeft() {
		if (nextFocusLeft != null && nextFocusLeft.eIsProxy()) {
			InternalEObject oldNextFocusLeft = (InternalEObject)nextFocusLeft;
			nextFocusLeft = (View)eResolveProxy(oldNextFocusLeft);
			if (nextFocusLeft != oldNextFocusLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT__NEXT_FOCUS_LEFT, oldNextFocusLeft, nextFocusLeft));
			}
		}
		return nextFocusLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetNextFocusLeft() {
		return nextFocusLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextFocusLeft(View newNextFocusLeft) {
		View oldNextFocusLeft = nextFocusLeft;
		nextFocusLeft = newNextFocusLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__NEXT_FOCUS_LEFT, oldNextFocusLeft, nextFocusLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getNextFocusRight() {
		if (nextFocusRight != null && nextFocusRight.eIsProxy()) {
			InternalEObject oldNextFocusRight = (InternalEObject)nextFocusRight;
			nextFocusRight = (View)eResolveProxy(oldNextFocusRight);
			if (nextFocusRight != oldNextFocusRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT__NEXT_FOCUS_RIGHT, oldNextFocusRight, nextFocusRight));
			}
		}
		return nextFocusRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetNextFocusRight() {
		return nextFocusRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextFocusRight(View newNextFocusRight) {
		View oldNextFocusRight = nextFocusRight;
		nextFocusRight = newNextFocusRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__NEXT_FOCUS_RIGHT, oldNextFocusRight, nextFocusRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getNextFocusUp() {
		if (nextFocusUp != null && nextFocusUp.eIsProxy()) {
			InternalEObject oldNextFocusUp = (InternalEObject)nextFocusUp;
			nextFocusUp = (View)eResolveProxy(oldNextFocusUp);
			if (nextFocusUp != oldNextFocusUp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT__NEXT_FOCUS_UP, oldNextFocusUp, nextFocusUp));
			}
		}
		return nextFocusUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetNextFocusUp() {
		return nextFocusUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextFocusUp(View newNextFocusUp) {
		View oldNextFocusUp = nextFocusUp;
		nextFocusUp = newNextFocusUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__NEXT_FOCUS_UP, oldNextFocusUp, nextFocusUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getOnClick() {
		return onClick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnClick(Action newOnClick, NotificationChain msgs) {
		Action oldOnClick = onClick;
		onClick = newOnClick;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__ON_CLICK, oldOnClick, newOnClick);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnClick(Action newOnClick) {
		if (newOnClick != onClick) {
			NotificationChain msgs = null;
			if (onClick != null)
				msgs = ((InternalEObject)onClick).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__ON_CLICK, null, msgs);
			if (newOnClick != null)
				msgs = ((InternalEObject)newOnClick).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__ON_CLICK, null, msgs);
			msgs = basicSetOnClick(newOnClick, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__ON_CLICK, newOnClick, newOnClick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPadding(DimensionVA newPadding, NotificationChain msgs) {
		DimensionVA oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING, oldPadding, newPadding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadding(DimensionVA newPadding) {
		if (newPadding != padding) {
			NotificationChain msgs = null;
			if (padding != null)
				msgs = ((InternalEObject)padding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING, null, msgs);
			if (newPadding != null)
				msgs = ((InternalEObject)newPadding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING, null, msgs);
			msgs = basicSetPadding(newPadding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING, newPadding, newPadding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getPaddingBottom() {
		return paddingBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaddingBottom(DimensionVA newPaddingBottom, NotificationChain msgs) {
		DimensionVA oldPaddingBottom = paddingBottom;
		paddingBottom = newPaddingBottom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_BOTTOM, oldPaddingBottom, newPaddingBottom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingBottom(DimensionVA newPaddingBottom) {
		if (newPaddingBottom != paddingBottom) {
			NotificationChain msgs = null;
			if (paddingBottom != null)
				msgs = ((InternalEObject)paddingBottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_BOTTOM, null, msgs);
			if (newPaddingBottom != null)
				msgs = ((InternalEObject)newPaddingBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_BOTTOM, null, msgs);
			msgs = basicSetPaddingBottom(newPaddingBottom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_BOTTOM, newPaddingBottom, newPaddingBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getPaddingLeft() {
		return paddingLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaddingLeft(DimensionVA newPaddingLeft, NotificationChain msgs) {
		DimensionVA oldPaddingLeft = paddingLeft;
		paddingLeft = newPaddingLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_LEFT, oldPaddingLeft, newPaddingLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingLeft(DimensionVA newPaddingLeft) {
		if (newPaddingLeft != paddingLeft) {
			NotificationChain msgs = null;
			if (paddingLeft != null)
				msgs = ((InternalEObject)paddingLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_LEFT, null, msgs);
			if (newPaddingLeft != null)
				msgs = ((InternalEObject)newPaddingLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_LEFT, null, msgs);
			msgs = basicSetPaddingLeft(newPaddingLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_LEFT, newPaddingLeft, newPaddingLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getPaddingRight() {
		return paddingRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaddingRight(DimensionVA newPaddingRight, NotificationChain msgs) {
		DimensionVA oldPaddingRight = paddingRight;
		paddingRight = newPaddingRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_RIGHT, oldPaddingRight, newPaddingRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingRight(DimensionVA newPaddingRight) {
		if (newPaddingRight != paddingRight) {
			NotificationChain msgs = null;
			if (paddingRight != null)
				msgs = ((InternalEObject)paddingRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_RIGHT, null, msgs);
			if (newPaddingRight != null)
				msgs = ((InternalEObject)newPaddingRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_RIGHT, null, msgs);
			msgs = basicSetPaddingRight(newPaddingRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_RIGHT, newPaddingRight, newPaddingRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getPaddingTop() {
		return paddingTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaddingTop(DimensionVA newPaddingTop, NotificationChain msgs) {
		DimensionVA oldPaddingTop = paddingTop;
		paddingTop = newPaddingTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_TOP, oldPaddingTop, newPaddingTop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingTop(DimensionVA newPaddingTop) {
		if (newPaddingTop != paddingTop) {
			NotificationChain msgs = null;
			if (paddingTop != null)
				msgs = ((InternalEObject)paddingTop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_TOP, null, msgs);
			if (newPaddingTop != null)
				msgs = ((InternalEObject)newPaddingTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_TOP, null, msgs);
			msgs = basicSetPaddingTop(newPaddingTop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_TOP, newPaddingTop, newPaddingTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getScrollbars() {
		return scrollbars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScrollbars(BooleanVA newScrollbars, NotificationChain msgs) {
		BooleanVA oldScrollbars = scrollbars;
		scrollbars = newScrollbars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SCROLLBARS, oldScrollbars, newScrollbars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrollbars(BooleanVA newScrollbars) {
		if (newScrollbars != scrollbars) {
			NotificationChain msgs = null;
			if (scrollbars != null)
				msgs = ((InternalEObject)scrollbars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SCROLLBARS, null, msgs);
			if (newScrollbars != null)
				msgs = ((InternalEObject)newScrollbars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SCROLLBARS, null, msgs);
			msgs = basicSetScrollbars(newScrollbars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SCROLLBARS, newScrollbars, newScrollbars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutVisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(LayoutVisibilityKind newVisibility) {
		LayoutVisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationVA getLayoutAnimation() {
		return layoutAnimation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutAnimation(AnimationVA newLayoutAnimation, NotificationChain msgs) {
		AnimationVA oldLayoutAnimation = layoutAnimation;
		layoutAnimation = newLayoutAnimation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__LAYOUT_ANIMATION, oldLayoutAnimation, newLayoutAnimation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutAnimation(AnimationVA newLayoutAnimation) {
		if (newLayoutAnimation != layoutAnimation) {
			NotificationChain msgs = null;
			if (layoutAnimation != null)
				msgs = ((InternalEObject)layoutAnimation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__LAYOUT_ANIMATION, null, msgs);
			if (newLayoutAnimation != null)
				msgs = ((InternalEObject)newLayoutAnimation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__LAYOUT_ANIMATION, null, msgs);
			msgs = basicSetLayoutAnimation(newLayoutAnimation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__LAYOUT_ANIMATION, newLayoutAnimation, newLayoutAnimation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DroidPackage.LAYOUT__MIN_HEIGHT:
				return basicSetMinHeight(null, msgs);
			case DroidPackage.LAYOUT__MIN_WIDTH:
				return basicSetMinWidth(null, msgs);
			case DroidPackage.LAYOUT__ON_CLICK:
				return basicSetOnClick(null, msgs);
			case DroidPackage.LAYOUT__PADDING:
				return basicSetPadding(null, msgs);
			case DroidPackage.LAYOUT__PADDING_BOTTOM:
				return basicSetPaddingBottom(null, msgs);
			case DroidPackage.LAYOUT__PADDING_LEFT:
				return basicSetPaddingLeft(null, msgs);
			case DroidPackage.LAYOUT__PADDING_RIGHT:
				return basicSetPaddingRight(null, msgs);
			case DroidPackage.LAYOUT__PADDING_TOP:
				return basicSetPaddingTop(null, msgs);
			case DroidPackage.LAYOUT__SCROLLBARS:
				return basicSetScrollbars(null, msgs);
			case DroidPackage.LAYOUT__LAYOUT_ANIMATION:
				return basicSetLayoutAnimation(null, msgs);
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
			case DroidPackage.LAYOUT__ALPHA:
				return getAlpha();
			case DroidPackage.LAYOUT__MIN_HEIGHT:
				return getMinHeight();
			case DroidPackage.LAYOUT__MIN_WIDTH:
				return getMinWidth();
			case DroidPackage.LAYOUT__NEXT_FOCUS_DOWN:
				if (resolve) return getNextFocusDown();
				return basicGetNextFocusDown();
			case DroidPackage.LAYOUT__NEXT_FOCUS_LEFT:
				if (resolve) return getNextFocusLeft();
				return basicGetNextFocusLeft();
			case DroidPackage.LAYOUT__NEXT_FOCUS_RIGHT:
				if (resolve) return getNextFocusRight();
				return basicGetNextFocusRight();
			case DroidPackage.LAYOUT__NEXT_FOCUS_UP:
				if (resolve) return getNextFocusUp();
				return basicGetNextFocusUp();
			case DroidPackage.LAYOUT__ON_CLICK:
				return getOnClick();
			case DroidPackage.LAYOUT__PADDING:
				return getPadding();
			case DroidPackage.LAYOUT__PADDING_BOTTOM:
				return getPaddingBottom();
			case DroidPackage.LAYOUT__PADDING_LEFT:
				return getPaddingLeft();
			case DroidPackage.LAYOUT__PADDING_RIGHT:
				return getPaddingRight();
			case DroidPackage.LAYOUT__PADDING_TOP:
				return getPaddingTop();
			case DroidPackage.LAYOUT__SCROLLBARS:
				return getScrollbars();
			case DroidPackage.LAYOUT__VISIBILITY:
				return getVisibility();
			case DroidPackage.LAYOUT__LAYOUT_ANIMATION:
				return getLayoutAnimation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DroidPackage.LAYOUT__ALPHA:
				setAlpha((Float)newValue);
				return;
			case DroidPackage.LAYOUT__MIN_HEIGHT:
				setMinHeight((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__MIN_WIDTH:
				setMinWidth((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_DOWN:
				setNextFocusDown((View)newValue);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_LEFT:
				setNextFocusLeft((View)newValue);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_RIGHT:
				setNextFocusRight((View)newValue);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_UP:
				setNextFocusUp((View)newValue);
				return;
			case DroidPackage.LAYOUT__ON_CLICK:
				setOnClick((Action)newValue);
				return;
			case DroidPackage.LAYOUT__PADDING:
				setPadding((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__PADDING_BOTTOM:
				setPaddingBottom((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__PADDING_LEFT:
				setPaddingLeft((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__PADDING_RIGHT:
				setPaddingRight((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__PADDING_TOP:
				setPaddingTop((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__SCROLLBARS:
				setScrollbars((BooleanVA)newValue);
				return;
			case DroidPackage.LAYOUT__VISIBILITY:
				setVisibility((LayoutVisibilityKind)newValue);
				return;
			case DroidPackage.LAYOUT__LAYOUT_ANIMATION:
				setLayoutAnimation((AnimationVA)newValue);
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
			case DroidPackage.LAYOUT__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case DroidPackage.LAYOUT__MIN_HEIGHT:
				setMinHeight((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__MIN_WIDTH:
				setMinWidth((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_DOWN:
				setNextFocusDown((View)null);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_LEFT:
				setNextFocusLeft((View)null);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_RIGHT:
				setNextFocusRight((View)null);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_UP:
				setNextFocusUp((View)null);
				return;
			case DroidPackage.LAYOUT__ON_CLICK:
				setOnClick((Action)null);
				return;
			case DroidPackage.LAYOUT__PADDING:
				setPadding((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__PADDING_BOTTOM:
				setPaddingBottom((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__PADDING_LEFT:
				setPaddingLeft((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__PADDING_RIGHT:
				setPaddingRight((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__PADDING_TOP:
				setPaddingTop((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__SCROLLBARS:
				setScrollbars((BooleanVA)null);
				return;
			case DroidPackage.LAYOUT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case DroidPackage.LAYOUT__LAYOUT_ANIMATION:
				setLayoutAnimation((AnimationVA)null);
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
			case DroidPackage.LAYOUT__ALPHA:
				return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
			case DroidPackage.LAYOUT__MIN_HEIGHT:
				return minHeight != null;
			case DroidPackage.LAYOUT__MIN_WIDTH:
				return minWidth != null;
			case DroidPackage.LAYOUT__NEXT_FOCUS_DOWN:
				return nextFocusDown != null;
			case DroidPackage.LAYOUT__NEXT_FOCUS_LEFT:
				return nextFocusLeft != null;
			case DroidPackage.LAYOUT__NEXT_FOCUS_RIGHT:
				return nextFocusRight != null;
			case DroidPackage.LAYOUT__NEXT_FOCUS_UP:
				return nextFocusUp != null;
			case DroidPackage.LAYOUT__ON_CLICK:
				return onClick != null;
			case DroidPackage.LAYOUT__PADDING:
				return padding != null;
			case DroidPackage.LAYOUT__PADDING_BOTTOM:
				return paddingBottom != null;
			case DroidPackage.LAYOUT__PADDING_LEFT:
				return paddingLeft != null;
			case DroidPackage.LAYOUT__PADDING_RIGHT:
				return paddingRight != null;
			case DroidPackage.LAYOUT__PADDING_TOP:
				return paddingTop != null;
			case DroidPackage.LAYOUT__SCROLLBARS:
				return scrollbars != null;
			case DroidPackage.LAYOUT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case DroidPackage.LAYOUT__LAYOUT_ANIMATION:
				return layoutAnimation != null;
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
		result.append(" (alpha: ");
		result.append(alpha);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
