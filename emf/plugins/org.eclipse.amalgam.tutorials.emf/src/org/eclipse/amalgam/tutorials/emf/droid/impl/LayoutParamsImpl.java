/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.impl;

import org.eclipse.amalgam.tutorials.emf.droid.BooleanVA;
import org.eclipse.amalgam.tutorials.emf.droid.DimensionVA;
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.IntegerVA;
import org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionVA;
import org.eclipse.amalgam.tutorials.emf.droid.LayoutParams;
import org.eclipse.amalgam.tutorials.emf.droid.View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_height <em>Layout height</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_width <em>Layout width</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_weight <em>Layout weight</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_marginBottom <em>Layout margin Bottom</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_marginLeft <em>Layout margin Left</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_marginRight <em>Layout margin Right</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_marginTop <em>Layout margin Top</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_above <em>Layout above</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_alignBaseline <em>Layout align Baseline</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_alignBottom <em>Layout align Bottom</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_alignLeft <em>Layout align Left</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_alignParentBottom <em>Layout align Parent Bottom</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_alignParentLeft <em>Layout align Parent Left</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_alignParentRight <em>Layout align Parent Right</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_alignParentTop <em>Layout align Parent Top</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_alignTop <em>Layout align Top</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_alignWithParentIfMissing <em>Layout align With Parent If Missing</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_below <em>Layout below</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_centerHorizontal <em>Layout center Horizontal</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_centerInParent <em>Layout center In Parent</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_centerVertical <em>Layout center Vertical</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_toLeftOf <em>Layout to Left Of</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl#getLayout_toRightOf <em>Layout to Right Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutParamsImpl extends EObjectImpl implements LayoutParams {
	/**
	 * The cached value of the '{@link #getLayout_height() <em>Layout height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_height()
	 * @generated
	 * @ordered
	 */
	protected LayoutDimensionVA layout_height;

	/**
	 * The cached value of the '{@link #getLayout_width() <em>Layout width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_width()
	 * @generated
	 * @ordered
	 */
	protected LayoutDimensionVA layout_width;

	/**
	 * The cached value of the '{@link #getLayout_weight() <em>Layout weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_weight()
	 * @generated
	 * @ordered
	 */
	protected IntegerVA layout_weight;

	/**
	 * The cached value of the '{@link #getLayout_marginBottom() <em>Layout margin Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_marginBottom()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA layout_marginBottom;

	/**
	 * The cached value of the '{@link #getLayout_marginLeft() <em>Layout margin Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_marginLeft()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA layout_marginLeft;

	/**
	 * The cached value of the '{@link #getLayout_marginRight() <em>Layout margin Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_marginRight()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA layout_marginRight;

	/**
	 * The cached value of the '{@link #getLayout_marginTop() <em>Layout margin Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_marginTop()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA layout_marginTop;

	/**
	 * The cached value of the '{@link #getLayout_above() <em>Layout above</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_above()
	 * @generated
	 * @ordered
	 */
	protected View layout_above;

	/**
	 * The cached value of the '{@link #getLayout_alignBaseline() <em>Layout align Baseline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_alignBaseline()
	 * @generated
	 * @ordered
	 */
	protected View layout_alignBaseline;

	/**
	 * The cached value of the '{@link #getLayout_alignBottom() <em>Layout align Bottom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_alignBottom()
	 * @generated
	 * @ordered
	 */
	protected View layout_alignBottom;

	/**
	 * The cached value of the '{@link #getLayout_alignLeft() <em>Layout align Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_alignLeft()
	 * @generated
	 * @ordered
	 */
	protected View layout_alignLeft;

	/**
	 * The cached value of the '{@link #getLayout_alignParentBottom() <em>Layout align Parent Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_alignParentBottom()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA layout_alignParentBottom;

	/**
	 * The cached value of the '{@link #getLayout_alignParentLeft() <em>Layout align Parent Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_alignParentLeft()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA layout_alignParentLeft;

	/**
	 * The cached value of the '{@link #getLayout_alignParentRight() <em>Layout align Parent Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_alignParentRight()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA layout_alignParentRight;

	/**
	 * The cached value of the '{@link #getLayout_alignParentTop() <em>Layout align Parent Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_alignParentTop()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA layout_alignParentTop;

	/**
	 * The cached value of the '{@link #getLayout_alignTop() <em>Layout align Top</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_alignTop()
	 * @generated
	 * @ordered
	 */
	protected View layout_alignTop;

	/**
	 * The cached value of the '{@link #getLayout_alignWithParentIfMissing() <em>Layout align With Parent If Missing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_alignWithParentIfMissing()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA layout_alignWithParentIfMissing;

	/**
	 * The cached value of the '{@link #getLayout_below() <em>Layout below</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_below()
	 * @generated
	 * @ordered
	 */
	protected View layout_below;

	/**
	 * The cached value of the '{@link #getLayout_centerHorizontal() <em>Layout center Horizontal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_centerHorizontal()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA layout_centerHorizontal;

	/**
	 * The cached value of the '{@link #getLayout_centerInParent() <em>Layout center In Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_centerInParent()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA layout_centerInParent;

	/**
	 * The cached value of the '{@link #getLayout_centerVertical() <em>Layout center Vertical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_centerVertical()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA layout_centerVertical;

	/**
	 * The cached value of the '{@link #getLayout_toLeftOf() <em>Layout to Left Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_toLeftOf()
	 * @generated
	 * @ordered
	 */
	protected View layout_toLeftOf;

	/**
	 * The cached value of the '{@link #getLayout_toRightOf() <em>Layout to Right Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_toRightOf()
	 * @generated
	 * @ordered
	 */
	protected View layout_toRightOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.eINSTANCE.getLayoutParams();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutDimensionVA getLayout_height() {
		return layout_height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_height(LayoutDimensionVA newLayout_height, NotificationChain msgs) {
		LayoutDimensionVA oldLayout_height = layout_height;
		layout_height = newLayout_height;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_HEIGHT, oldLayout_height, newLayout_height);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_height(LayoutDimensionVA newLayout_height) {
		if (newLayout_height != layout_height) {
			NotificationChain msgs = null;
			if (layout_height != null)
				msgs = ((InternalEObject)layout_height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_HEIGHT, null, msgs);
			if (newLayout_height != null)
				msgs = ((InternalEObject)newLayout_height).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_HEIGHT, null, msgs);
			msgs = basicSetLayout_height(newLayout_height, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_HEIGHT, newLayout_height, newLayout_height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutDimensionVA getLayout_width() {
		return layout_width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_width(LayoutDimensionVA newLayout_width, NotificationChain msgs) {
		LayoutDimensionVA oldLayout_width = layout_width;
		layout_width = newLayout_width;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_WIDTH, oldLayout_width, newLayout_width);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_width(LayoutDimensionVA newLayout_width) {
		if (newLayout_width != layout_width) {
			NotificationChain msgs = null;
			if (layout_width != null)
				msgs = ((InternalEObject)layout_width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_WIDTH, null, msgs);
			if (newLayout_width != null)
				msgs = ((InternalEObject)newLayout_width).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_WIDTH, null, msgs);
			msgs = basicSetLayout_width(newLayout_width, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_WIDTH, newLayout_width, newLayout_width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVA getLayout_weight() {
		return layout_weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_weight(IntegerVA newLayout_weight, NotificationChain msgs) {
		IntegerVA oldLayout_weight = layout_weight;
		layout_weight = newLayout_weight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_WEIGHT, oldLayout_weight, newLayout_weight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_weight(IntegerVA newLayout_weight) {
		if (newLayout_weight != layout_weight) {
			NotificationChain msgs = null;
			if (layout_weight != null)
				msgs = ((InternalEObject)layout_weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_WEIGHT, null, msgs);
			if (newLayout_weight != null)
				msgs = ((InternalEObject)newLayout_weight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_WEIGHT, null, msgs);
			msgs = basicSetLayout_weight(newLayout_weight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_WEIGHT, newLayout_weight, newLayout_weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getLayout_marginBottom() {
		return layout_marginBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_marginBottom(DimensionVA newLayout_marginBottom, NotificationChain msgs) {
		DimensionVA oldLayout_marginBottom = layout_marginBottom;
		layout_marginBottom = newLayout_marginBottom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_BOTTOM, oldLayout_marginBottom, newLayout_marginBottom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_marginBottom(DimensionVA newLayout_marginBottom) {
		if (newLayout_marginBottom != layout_marginBottom) {
			NotificationChain msgs = null;
			if (layout_marginBottom != null)
				msgs = ((InternalEObject)layout_marginBottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_BOTTOM, null, msgs);
			if (newLayout_marginBottom != null)
				msgs = ((InternalEObject)newLayout_marginBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_BOTTOM, null, msgs);
			msgs = basicSetLayout_marginBottom(newLayout_marginBottom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_BOTTOM, newLayout_marginBottom, newLayout_marginBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getLayout_marginLeft() {
		return layout_marginLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_marginLeft(DimensionVA newLayout_marginLeft, NotificationChain msgs) {
		DimensionVA oldLayout_marginLeft = layout_marginLeft;
		layout_marginLeft = newLayout_marginLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_LEFT, oldLayout_marginLeft, newLayout_marginLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_marginLeft(DimensionVA newLayout_marginLeft) {
		if (newLayout_marginLeft != layout_marginLeft) {
			NotificationChain msgs = null;
			if (layout_marginLeft != null)
				msgs = ((InternalEObject)layout_marginLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_LEFT, null, msgs);
			if (newLayout_marginLeft != null)
				msgs = ((InternalEObject)newLayout_marginLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_LEFT, null, msgs);
			msgs = basicSetLayout_marginLeft(newLayout_marginLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_LEFT, newLayout_marginLeft, newLayout_marginLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getLayout_marginRight() {
		return layout_marginRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_marginRight(DimensionVA newLayout_marginRight, NotificationChain msgs) {
		DimensionVA oldLayout_marginRight = layout_marginRight;
		layout_marginRight = newLayout_marginRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_RIGHT, oldLayout_marginRight, newLayout_marginRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_marginRight(DimensionVA newLayout_marginRight) {
		if (newLayout_marginRight != layout_marginRight) {
			NotificationChain msgs = null;
			if (layout_marginRight != null)
				msgs = ((InternalEObject)layout_marginRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_RIGHT, null, msgs);
			if (newLayout_marginRight != null)
				msgs = ((InternalEObject)newLayout_marginRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_RIGHT, null, msgs);
			msgs = basicSetLayout_marginRight(newLayout_marginRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_RIGHT, newLayout_marginRight, newLayout_marginRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getLayout_marginTop() {
		return layout_marginTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_marginTop(DimensionVA newLayout_marginTop, NotificationChain msgs) {
		DimensionVA oldLayout_marginTop = layout_marginTop;
		layout_marginTop = newLayout_marginTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_TOP, oldLayout_marginTop, newLayout_marginTop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_marginTop(DimensionVA newLayout_marginTop) {
		if (newLayout_marginTop != layout_marginTop) {
			NotificationChain msgs = null;
			if (layout_marginTop != null)
				msgs = ((InternalEObject)layout_marginTop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_TOP, null, msgs);
			if (newLayout_marginTop != null)
				msgs = ((InternalEObject)newLayout_marginTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_TOP, null, msgs);
			msgs = basicSetLayout_marginTop(newLayout_marginTop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_TOP, newLayout_marginTop, newLayout_marginTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getLayout_above() {
		if (layout_above != null && layout_above.eIsProxy()) {
			InternalEObject oldLayout_above = (InternalEObject)layout_above;
			layout_above = (View)eResolveProxy(oldLayout_above);
			if (layout_above != oldLayout_above) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT_PARAMS__LAYOUT_ABOVE, oldLayout_above, layout_above));
			}
		}
		return layout_above;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetLayout_above() {
		return layout_above;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_above(View newLayout_above) {
		View oldLayout_above = layout_above;
		layout_above = newLayout_above;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ABOVE, oldLayout_above, layout_above));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getLayout_alignBaseline() {
		if (layout_alignBaseline != null && layout_alignBaseline.eIsProxy()) {
			InternalEObject oldLayout_alignBaseline = (InternalEObject)layout_alignBaseline;
			layout_alignBaseline = (View)eResolveProxy(oldLayout_alignBaseline);
			if (layout_alignBaseline != oldLayout_alignBaseline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_BASELINE, oldLayout_alignBaseline, layout_alignBaseline));
			}
		}
		return layout_alignBaseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetLayout_alignBaseline() {
		return layout_alignBaseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_alignBaseline(View newLayout_alignBaseline) {
		View oldLayout_alignBaseline = layout_alignBaseline;
		layout_alignBaseline = newLayout_alignBaseline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_BASELINE, oldLayout_alignBaseline, layout_alignBaseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getLayout_alignBottom() {
		if (layout_alignBottom != null && layout_alignBottom.eIsProxy()) {
			InternalEObject oldLayout_alignBottom = (InternalEObject)layout_alignBottom;
			layout_alignBottom = (View)eResolveProxy(oldLayout_alignBottom);
			if (layout_alignBottom != oldLayout_alignBottom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_BOTTOM, oldLayout_alignBottom, layout_alignBottom));
			}
		}
		return layout_alignBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetLayout_alignBottom() {
		return layout_alignBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_alignBottom(View newLayout_alignBottom) {
		View oldLayout_alignBottom = layout_alignBottom;
		layout_alignBottom = newLayout_alignBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_BOTTOM, oldLayout_alignBottom, layout_alignBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getLayout_alignLeft() {
		if (layout_alignLeft != null && layout_alignLeft.eIsProxy()) {
			InternalEObject oldLayout_alignLeft = (InternalEObject)layout_alignLeft;
			layout_alignLeft = (View)eResolveProxy(oldLayout_alignLeft);
			if (layout_alignLeft != oldLayout_alignLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_LEFT, oldLayout_alignLeft, layout_alignLeft));
			}
		}
		return layout_alignLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetLayout_alignLeft() {
		return layout_alignLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_alignLeft(View newLayout_alignLeft) {
		View oldLayout_alignLeft = layout_alignLeft;
		layout_alignLeft = newLayout_alignLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_LEFT, oldLayout_alignLeft, layout_alignLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getLayout_alignParentBottom() {
		return layout_alignParentBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_alignParentBottom(BooleanVA newLayout_alignParentBottom, NotificationChain msgs) {
		BooleanVA oldLayout_alignParentBottom = layout_alignParentBottom;
		layout_alignParentBottom = newLayout_alignParentBottom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_BOTTOM, oldLayout_alignParentBottom, newLayout_alignParentBottom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_alignParentBottom(BooleanVA newLayout_alignParentBottom) {
		if (newLayout_alignParentBottom != layout_alignParentBottom) {
			NotificationChain msgs = null;
			if (layout_alignParentBottom != null)
				msgs = ((InternalEObject)layout_alignParentBottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_BOTTOM, null, msgs);
			if (newLayout_alignParentBottom != null)
				msgs = ((InternalEObject)newLayout_alignParentBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_BOTTOM, null, msgs);
			msgs = basicSetLayout_alignParentBottom(newLayout_alignParentBottom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_BOTTOM, newLayout_alignParentBottom, newLayout_alignParentBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getLayout_alignParentLeft() {
		return layout_alignParentLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_alignParentLeft(BooleanVA newLayout_alignParentLeft, NotificationChain msgs) {
		BooleanVA oldLayout_alignParentLeft = layout_alignParentLeft;
		layout_alignParentLeft = newLayout_alignParentLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_LEFT, oldLayout_alignParentLeft, newLayout_alignParentLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_alignParentLeft(BooleanVA newLayout_alignParentLeft) {
		if (newLayout_alignParentLeft != layout_alignParentLeft) {
			NotificationChain msgs = null;
			if (layout_alignParentLeft != null)
				msgs = ((InternalEObject)layout_alignParentLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_LEFT, null, msgs);
			if (newLayout_alignParentLeft != null)
				msgs = ((InternalEObject)newLayout_alignParentLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_LEFT, null, msgs);
			msgs = basicSetLayout_alignParentLeft(newLayout_alignParentLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_LEFT, newLayout_alignParentLeft, newLayout_alignParentLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getLayout_alignParentRight() {
		return layout_alignParentRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_alignParentRight(BooleanVA newLayout_alignParentRight, NotificationChain msgs) {
		BooleanVA oldLayout_alignParentRight = layout_alignParentRight;
		layout_alignParentRight = newLayout_alignParentRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_RIGHT, oldLayout_alignParentRight, newLayout_alignParentRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_alignParentRight(BooleanVA newLayout_alignParentRight) {
		if (newLayout_alignParentRight != layout_alignParentRight) {
			NotificationChain msgs = null;
			if (layout_alignParentRight != null)
				msgs = ((InternalEObject)layout_alignParentRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_RIGHT, null, msgs);
			if (newLayout_alignParentRight != null)
				msgs = ((InternalEObject)newLayout_alignParentRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_RIGHT, null, msgs);
			msgs = basicSetLayout_alignParentRight(newLayout_alignParentRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_RIGHT, newLayout_alignParentRight, newLayout_alignParentRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getLayout_alignParentTop() {
		return layout_alignParentTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_alignParentTop(BooleanVA newLayout_alignParentTop, NotificationChain msgs) {
		BooleanVA oldLayout_alignParentTop = layout_alignParentTop;
		layout_alignParentTop = newLayout_alignParentTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_TOP, oldLayout_alignParentTop, newLayout_alignParentTop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_alignParentTop(BooleanVA newLayout_alignParentTop) {
		if (newLayout_alignParentTop != layout_alignParentTop) {
			NotificationChain msgs = null;
			if (layout_alignParentTop != null)
				msgs = ((InternalEObject)layout_alignParentTop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_TOP, null, msgs);
			if (newLayout_alignParentTop != null)
				msgs = ((InternalEObject)newLayout_alignParentTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_TOP, null, msgs);
			msgs = basicSetLayout_alignParentTop(newLayout_alignParentTop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_TOP, newLayout_alignParentTop, newLayout_alignParentTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getLayout_alignTop() {
		if (layout_alignTop != null && layout_alignTop.eIsProxy()) {
			InternalEObject oldLayout_alignTop = (InternalEObject)layout_alignTop;
			layout_alignTop = (View)eResolveProxy(oldLayout_alignTop);
			if (layout_alignTop != oldLayout_alignTop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_TOP, oldLayout_alignTop, layout_alignTop));
			}
		}
		return layout_alignTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetLayout_alignTop() {
		return layout_alignTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_alignTop(View newLayout_alignTop) {
		View oldLayout_alignTop = layout_alignTop;
		layout_alignTop = newLayout_alignTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_TOP, oldLayout_alignTop, layout_alignTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getLayout_alignWithParentIfMissing() {
		return layout_alignWithParentIfMissing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_alignWithParentIfMissing(BooleanVA newLayout_alignWithParentIfMissing, NotificationChain msgs) {
		BooleanVA oldLayout_alignWithParentIfMissing = layout_alignWithParentIfMissing;
		layout_alignWithParentIfMissing = newLayout_alignWithParentIfMissing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING, oldLayout_alignWithParentIfMissing, newLayout_alignWithParentIfMissing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_alignWithParentIfMissing(BooleanVA newLayout_alignWithParentIfMissing) {
		if (newLayout_alignWithParentIfMissing != layout_alignWithParentIfMissing) {
			NotificationChain msgs = null;
			if (layout_alignWithParentIfMissing != null)
				msgs = ((InternalEObject)layout_alignWithParentIfMissing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING, null, msgs);
			if (newLayout_alignWithParentIfMissing != null)
				msgs = ((InternalEObject)newLayout_alignWithParentIfMissing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING, null, msgs);
			msgs = basicSetLayout_alignWithParentIfMissing(newLayout_alignWithParentIfMissing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING, newLayout_alignWithParentIfMissing, newLayout_alignWithParentIfMissing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getLayout_below() {
		if (layout_below != null && layout_below.eIsProxy()) {
			InternalEObject oldLayout_below = (InternalEObject)layout_below;
			layout_below = (View)eResolveProxy(oldLayout_below);
			if (layout_below != oldLayout_below) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT_PARAMS__LAYOUT_BELOW, oldLayout_below, layout_below));
			}
		}
		return layout_below;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetLayout_below() {
		return layout_below;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_below(View newLayout_below) {
		View oldLayout_below = layout_below;
		layout_below = newLayout_below;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_BELOW, oldLayout_below, layout_below));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getLayout_centerHorizontal() {
		return layout_centerHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_centerHorizontal(BooleanVA newLayout_centerHorizontal, NotificationChain msgs) {
		BooleanVA oldLayout_centerHorizontal = layout_centerHorizontal;
		layout_centerHorizontal = newLayout_centerHorizontal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_HORIZONTAL, oldLayout_centerHorizontal, newLayout_centerHorizontal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_centerHorizontal(BooleanVA newLayout_centerHorizontal) {
		if (newLayout_centerHorizontal != layout_centerHorizontal) {
			NotificationChain msgs = null;
			if (layout_centerHorizontal != null)
				msgs = ((InternalEObject)layout_centerHorizontal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_HORIZONTAL, null, msgs);
			if (newLayout_centerHorizontal != null)
				msgs = ((InternalEObject)newLayout_centerHorizontal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_HORIZONTAL, null, msgs);
			msgs = basicSetLayout_centerHorizontal(newLayout_centerHorizontal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_HORIZONTAL, newLayout_centerHorizontal, newLayout_centerHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getLayout_centerInParent() {
		return layout_centerInParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_centerInParent(BooleanVA newLayout_centerInParent, NotificationChain msgs) {
		BooleanVA oldLayout_centerInParent = layout_centerInParent;
		layout_centerInParent = newLayout_centerInParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_IN_PARENT, oldLayout_centerInParent, newLayout_centerInParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_centerInParent(BooleanVA newLayout_centerInParent) {
		if (newLayout_centerInParent != layout_centerInParent) {
			NotificationChain msgs = null;
			if (layout_centerInParent != null)
				msgs = ((InternalEObject)layout_centerInParent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_IN_PARENT, null, msgs);
			if (newLayout_centerInParent != null)
				msgs = ((InternalEObject)newLayout_centerInParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_IN_PARENT, null, msgs);
			msgs = basicSetLayout_centerInParent(newLayout_centerInParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_IN_PARENT, newLayout_centerInParent, newLayout_centerInParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getLayout_centerVertical() {
		return layout_centerVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout_centerVertical(BooleanVA newLayout_centerVertical, NotificationChain msgs) {
		BooleanVA oldLayout_centerVertical = layout_centerVertical;
		layout_centerVertical = newLayout_centerVertical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_VERTICAL, oldLayout_centerVertical, newLayout_centerVertical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_centerVertical(BooleanVA newLayout_centerVertical) {
		if (newLayout_centerVertical != layout_centerVertical) {
			NotificationChain msgs = null;
			if (layout_centerVertical != null)
				msgs = ((InternalEObject)layout_centerVertical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_VERTICAL, null, msgs);
			if (newLayout_centerVertical != null)
				msgs = ((InternalEObject)newLayout_centerVertical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_VERTICAL, null, msgs);
			msgs = basicSetLayout_centerVertical(newLayout_centerVertical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_VERTICAL, newLayout_centerVertical, newLayout_centerVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getLayout_toLeftOf() {
		if (layout_toLeftOf != null && layout_toLeftOf.eIsProxy()) {
			InternalEObject oldLayout_toLeftOf = (InternalEObject)layout_toLeftOf;
			layout_toLeftOf = (View)eResolveProxy(oldLayout_toLeftOf);
			if (layout_toLeftOf != oldLayout_toLeftOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT_PARAMS__LAYOUT_TO_LEFT_OF, oldLayout_toLeftOf, layout_toLeftOf));
			}
		}
		return layout_toLeftOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetLayout_toLeftOf() {
		return layout_toLeftOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_toLeftOf(View newLayout_toLeftOf) {
		View oldLayout_toLeftOf = layout_toLeftOf;
		layout_toLeftOf = newLayout_toLeftOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_TO_LEFT_OF, oldLayout_toLeftOf, layout_toLeftOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getLayout_toRightOf() {
		if (layout_toRightOf != null && layout_toRightOf.eIsProxy()) {
			InternalEObject oldLayout_toRightOf = (InternalEObject)layout_toRightOf;
			layout_toRightOf = (View)eResolveProxy(oldLayout_toRightOf);
			if (layout_toRightOf != oldLayout_toRightOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT_PARAMS__LAYOUT_TO_RIGHT_OF, oldLayout_toRightOf, layout_toRightOf));
			}
		}
		return layout_toRightOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetLayout_toRightOf() {
		return layout_toRightOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_toRightOf(View newLayout_toRightOf) {
		View oldLayout_toRightOf = layout_toRightOf;
		layout_toRightOf = newLayout_toRightOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_PARAMS__LAYOUT_TO_RIGHT_OF, oldLayout_toRightOf, layout_toRightOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_HEIGHT:
				return basicSetLayout_height(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_WIDTH:
				return basicSetLayout_width(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_WEIGHT:
				return basicSetLayout_weight(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_BOTTOM:
				return basicSetLayout_marginBottom(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_LEFT:
				return basicSetLayout_marginLeft(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_RIGHT:
				return basicSetLayout_marginRight(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_TOP:
				return basicSetLayout_marginTop(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_BOTTOM:
				return basicSetLayout_alignParentBottom(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_LEFT:
				return basicSetLayout_alignParentLeft(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_RIGHT:
				return basicSetLayout_alignParentRight(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_TOP:
				return basicSetLayout_alignParentTop(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING:
				return basicSetLayout_alignWithParentIfMissing(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_HORIZONTAL:
				return basicSetLayout_centerHorizontal(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_IN_PARENT:
				return basicSetLayout_centerInParent(null, msgs);
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_VERTICAL:
				return basicSetLayout_centerVertical(null, msgs);
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
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_HEIGHT:
				return getLayout_height();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_WIDTH:
				return getLayout_width();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_WEIGHT:
				return getLayout_weight();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_BOTTOM:
				return getLayout_marginBottom();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_LEFT:
				return getLayout_marginLeft();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_RIGHT:
				return getLayout_marginRight();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_TOP:
				return getLayout_marginTop();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ABOVE:
				if (resolve) return getLayout_above();
				return basicGetLayout_above();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_BASELINE:
				if (resolve) return getLayout_alignBaseline();
				return basicGetLayout_alignBaseline();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_BOTTOM:
				if (resolve) return getLayout_alignBottom();
				return basicGetLayout_alignBottom();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_LEFT:
				if (resolve) return getLayout_alignLeft();
				return basicGetLayout_alignLeft();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_BOTTOM:
				return getLayout_alignParentBottom();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_LEFT:
				return getLayout_alignParentLeft();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_RIGHT:
				return getLayout_alignParentRight();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_TOP:
				return getLayout_alignParentTop();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_TOP:
				if (resolve) return getLayout_alignTop();
				return basicGetLayout_alignTop();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING:
				return getLayout_alignWithParentIfMissing();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_BELOW:
				if (resolve) return getLayout_below();
				return basicGetLayout_below();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_HORIZONTAL:
				return getLayout_centerHorizontal();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_IN_PARENT:
				return getLayout_centerInParent();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_VERTICAL:
				return getLayout_centerVertical();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_TO_LEFT_OF:
				if (resolve) return getLayout_toLeftOf();
				return basicGetLayout_toLeftOf();
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_TO_RIGHT_OF:
				if (resolve) return getLayout_toRightOf();
				return basicGetLayout_toRightOf();
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
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_HEIGHT:
				setLayout_height((LayoutDimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_WIDTH:
				setLayout_width((LayoutDimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_WEIGHT:
				setLayout_weight((IntegerVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_BOTTOM:
				setLayout_marginBottom((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_LEFT:
				setLayout_marginLeft((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_RIGHT:
				setLayout_marginRight((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_TOP:
				setLayout_marginTop((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ABOVE:
				setLayout_above((View)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_BASELINE:
				setLayout_alignBaseline((View)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_BOTTOM:
				setLayout_alignBottom((View)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_LEFT:
				setLayout_alignLeft((View)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_BOTTOM:
				setLayout_alignParentBottom((BooleanVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_LEFT:
				setLayout_alignParentLeft((BooleanVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_RIGHT:
				setLayout_alignParentRight((BooleanVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_TOP:
				setLayout_alignParentTop((BooleanVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_TOP:
				setLayout_alignTop((View)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING:
				setLayout_alignWithParentIfMissing((BooleanVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_BELOW:
				setLayout_below((View)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_HORIZONTAL:
				setLayout_centerHorizontal((BooleanVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_IN_PARENT:
				setLayout_centerInParent((BooleanVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_VERTICAL:
				setLayout_centerVertical((BooleanVA)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_TO_LEFT_OF:
				setLayout_toLeftOf((View)newValue);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_TO_RIGHT_OF:
				setLayout_toRightOf((View)newValue);
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
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_HEIGHT:
				setLayout_height((LayoutDimensionVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_WIDTH:
				setLayout_width((LayoutDimensionVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_WEIGHT:
				setLayout_weight((IntegerVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_BOTTOM:
				setLayout_marginBottom((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_LEFT:
				setLayout_marginLeft((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_RIGHT:
				setLayout_marginRight((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_TOP:
				setLayout_marginTop((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ABOVE:
				setLayout_above((View)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_BASELINE:
				setLayout_alignBaseline((View)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_BOTTOM:
				setLayout_alignBottom((View)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_LEFT:
				setLayout_alignLeft((View)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_BOTTOM:
				setLayout_alignParentBottom((BooleanVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_LEFT:
				setLayout_alignParentLeft((BooleanVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_RIGHT:
				setLayout_alignParentRight((BooleanVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_TOP:
				setLayout_alignParentTop((BooleanVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_TOP:
				setLayout_alignTop((View)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING:
				setLayout_alignWithParentIfMissing((BooleanVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_BELOW:
				setLayout_below((View)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_HORIZONTAL:
				setLayout_centerHorizontal((BooleanVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_IN_PARENT:
				setLayout_centerInParent((BooleanVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_VERTICAL:
				setLayout_centerVertical((BooleanVA)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_TO_LEFT_OF:
				setLayout_toLeftOf((View)null);
				return;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_TO_RIGHT_OF:
				setLayout_toRightOf((View)null);
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
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_HEIGHT:
				return layout_height != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_WIDTH:
				return layout_width != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_WEIGHT:
				return layout_weight != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_BOTTOM:
				return layout_marginBottom != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_LEFT:
				return layout_marginLeft != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_RIGHT:
				return layout_marginRight != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_TOP:
				return layout_marginTop != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ABOVE:
				return layout_above != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_BASELINE:
				return layout_alignBaseline != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_BOTTOM:
				return layout_alignBottom != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_LEFT:
				return layout_alignLeft != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_BOTTOM:
				return layout_alignParentBottom != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_LEFT:
				return layout_alignParentLeft != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_RIGHT:
				return layout_alignParentRight != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_TOP:
				return layout_alignParentTop != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_TOP:
				return layout_alignTop != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING:
				return layout_alignWithParentIfMissing != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_BELOW:
				return layout_below != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_HORIZONTAL:
				return layout_centerHorizontal != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_IN_PARENT:
				return layout_centerInParent != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_VERTICAL:
				return layout_centerVertical != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_TO_LEFT_OF:
				return layout_toLeftOf != null;
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_TO_RIGHT_OF:
				return layout_toRightOf != null;
		}
		return super.eIsSet(featureID);
	}

} //LayoutParamsImpl
